package xin.cymall.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import xin.cymall.entity.Category;
import xin.cymall.enumresource.StateEnum;
import xin.cymall.annotation.SysLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

import xin.cymall.entity.CustomerCategory;
import xin.cymall.enumresource.TopMenuEnum;
import xin.cymall.service.CustomerCategoryService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;
import xin.cymall.utils.ZtreeBean;


/**
 * 客户分类表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:48:13
 */
@Controller
@RequestMapping("customercategory")
public class CustomerCategoryController {
	@Autowired
	private CustomerCategoryService customerCategoryService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("customercategory:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CustomerCategory> customerCategoryList = customerCategoryService.getList(query);
		int total = customerCategoryService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(customerCategoryList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("customercategory:save")
    public String add(){
        return "customercategory/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("customercategory:update")
    public String edit(Model model, @PathVariable("id") String id){
		CustomerCategory customerCategory = customerCategoryService.get(id);
        model.addAttribute("model",customerCategory);
        return "customercategory/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{id}")
    @RequiresPermissions("customercategory:info")
    public R info(@PathVariable("id") String id){
        CustomerCategory customerCategory = customerCategoryService.get(id);
        return R.ok().put("customerCategory", customerCategory);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存客户分类表")
	@RequestMapping("/save")
	@RequiresPermissions("customercategory:save")
	public R save(@RequestBody CustomerCategory customerCategory){
		customerCategoryService.save(customerCategory);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改客户分类表")
	@RequestMapping("/update")
	@RequiresPermissions("customercategory:update")
	public R update(@RequestBody CustomerCategory customerCategory){
		customerCategoryService.update(customerCategory);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用客户分类表")
    @RequestMapping("/enable")
    @RequiresPermissions("customercategory:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		customerCategoryService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用客户分类表")
    @RequestMapping("/limit")
    @RequiresPermissions("customercategory:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		customerCategoryService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除客户分类表")
	@RequestMapping("/delete")
	@RequiresPermissions("customercategory:delete")
	public R delete(@RequestBody String[] ids){
		customerCategoryService.deleteBatch(ids);
		
		return R.ok();
	}


    /**
     * 选择父类(添加，修改商品分类信息时用到)
     */
    @ResponseBody
    @RequestMapping("/select")
    public R seletAll(){
        //查询列表的数据
        List<CustomerCategory> customerCategoryList = customerCategoryService.getCustomerCategpryList();

        //顶级菜单
        CustomerCategory root = new CustomerCategory();
        root.setId(Long.parseLong(TopMenuEnum.TopCutomerCategpry.getCode()));
        root.setName(TopMenuEnum.TopCutomerCategpry.getDesc());
        root.setParentId((long) -1);
        root.setOpen(true);
        customerCategoryList.add(root);
        List<ZtreeBean> ztreeBeans = new ArrayList<>();
        for (CustomerCategory customerCategory : customerCategoryList) {
            ZtreeBean tree = new ZtreeBean();
            tree.setId(customerCategory.getId() + "");
            tree.setpId(customerCategory.getParentId() + "");
            tree.setName(customerCategory.getName());
            tree.setOpen(customerCategory.getOpen() + "");
            tree.setChkDisabled("false");
            ztreeBeans.add(tree);
        }
        return R.ok().put("data", ztreeBeans);
    }
	
}
