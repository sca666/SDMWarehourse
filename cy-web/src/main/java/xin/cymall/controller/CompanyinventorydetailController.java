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

import xin.cymall.entity.Companyinventorydetail;
import xin.cymall.service.CompanyinventorydetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 对客户的库存明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("companyinventorydetail")
public class CompanyinventorydetailController {
	@Autowired
	private CompanyinventorydetailService companyinventorydetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("companyinventorydetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Companyinventorydetail> companyinventorydetailList = companyinventorydetailService.getList(query);
		int total = companyinventorydetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(companyinventorydetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("companyinventorydetail:save")
    public String add(){
        return "companyinventorydetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("companyinventorydetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Companyinventorydetail companyinventorydetail = companyinventorydetailService.get(id);
        model.addAttribute("model",companyinventorydetail);
        return "companyinventorydetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{cominvendId}")
    @RequiresPermissions("companyinventorydetail:info")
    public R info(@PathVariable("cominvendId") String cominvendId){
        Companyinventorydetail companyinventorydetail = companyinventorydetailService.get(cominvendId);
        return R.ok().put("companyinventorydetail", companyinventorydetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存对客户的库存明细表")
	@RequestMapping("/save")
	@RequiresPermissions("companyinventorydetail:save")
	public R save(@RequestBody Companyinventorydetail companyinventorydetail){
		companyinventorydetailService.save(companyinventorydetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改对客户的库存明细表")
	@RequestMapping("/update")
	@RequiresPermissions("companyinventorydetail:update")
	public R update(@RequestBody Companyinventorydetail companyinventorydetail){
		companyinventorydetailService.update(companyinventorydetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用对客户的库存明细表")
    @RequestMapping("/enable")
    @RequiresPermissions("companyinventorydetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		companyinventorydetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用对客户的库存明细表")
    @RequestMapping("/limit")
    @RequiresPermissions("companyinventorydetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		companyinventorydetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除对客户的库存明细表")
	@RequestMapping("/delete")
	@RequiresPermissions("companyinventorydetail:delete")
	public R delete(@RequestBody String[] cominvendIds){
		companyinventorydetailService.deleteBatch(cominvendIds);
		
		return R.ok();
	}
	
}
