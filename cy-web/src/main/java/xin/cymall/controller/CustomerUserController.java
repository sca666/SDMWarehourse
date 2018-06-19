package xin.cymall.controller;

import java.util.List;
import java.util.Map;
import xin.cymall.enumresource.StateEnum;
import xin.cymall.annotation.SysLog;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;

import xin.cymall.entity.CustomerUser;
import xin.cymall.service.CustomerUserService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 客户与登录用户对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:48:13
 */
@Controller
@RequestMapping("customeruser")
public class CustomerUserController {
	@Autowired
	private CustomerUserService customerUserService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("customeruser:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<CustomerUser> customerUserList = customerUserService.getList(query);
		int total = customerUserService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(customerUserList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("customeruser:save")
    public String add(){
        return "customeruser/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("customeruser:update")
    public String edit(Model model, @PathVariable("id") String id){
		CustomerUser customerUser = customerUserService.get(id);
        model.addAttribute("model",customerUser);
        return "customeruser/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{id}")
    @RequiresPermissions("customeruser:info")
    public R info(@PathVariable("id") String id){
        CustomerUser customerUser = customerUserService.get(id);
        return R.ok().put("customerUser", customerUser);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存客户与登录用户对应表")
	@RequestMapping("/save")
	@RequiresPermissions("customeruser:save")
	public R save(@RequestBody CustomerUser customerUser){
		customerUserService.save(customerUser);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改客户与登录用户对应表")
	@RequestMapping("/update")
	@RequiresPermissions("customeruser:update")
	public R update(@RequestBody CustomerUser customerUser){
		customerUserService.update(customerUser);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用客户与登录用户对应表")
    @RequestMapping("/enable")
    @RequiresPermissions("customeruser:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		customerUserService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用客户与登录用户对应表")
    @RequestMapping("/limit")
    @RequiresPermissions("customeruser:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		customerUserService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除客户与登录用户对应表")
	@RequestMapping("/delete")
	@RequiresPermissions("customeruser:delete")
	public R delete(@RequestBody String[] ids){
		customerUserService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
