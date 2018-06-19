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

import xin.cymall.entity.Companyinventorymain;
import xin.cymall.service.CompanyinventorymainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 客户的库存主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("companyinventorymain")
public class CompanyinventorymainController {
	@Autowired
	private CompanyinventorymainService companyinventorymainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("companyinventorymain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Companyinventorymain> companyinventorymainList = companyinventorymainService.getList(query);
		int total = companyinventorymainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(companyinventorymainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("companyinventorymain:save")
    public String add(){
        return "companyinventorymain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("companyinventorymain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Companyinventorymain companyinventorymain = companyinventorymainService.get(id);
        model.addAttribute("model",companyinventorymain);
        return "companyinventorymain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{cominvenmId}")
    @RequiresPermissions("companyinventorymain:info")
    public R info(@PathVariable("cominvenmId") String cominvenmId){
        Companyinventorymain companyinventorymain = companyinventorymainService.get(cominvenmId);
        return R.ok().put("companyinventorymain", companyinventorymain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存客户的库存主表")
	@RequestMapping("/save")
	@RequiresPermissions("companyinventorymain:save")
	public R save(@RequestBody Companyinventorymain companyinventorymain){
		companyinventorymainService.save(companyinventorymain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改客户的库存主表")
	@RequestMapping("/update")
	@RequiresPermissions("companyinventorymain:update")
	public R update(@RequestBody Companyinventorymain companyinventorymain){
		companyinventorymainService.update(companyinventorymain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用客户的库存主表")
    @RequestMapping("/enable")
    @RequiresPermissions("companyinventorymain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		companyinventorymainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用客户的库存主表")
    @RequestMapping("/limit")
    @RequiresPermissions("companyinventorymain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		companyinventorymainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除客户的库存主表")
	@RequestMapping("/delete")
	@RequiresPermissions("companyinventorymain:delete")
	public R delete(@RequestBody String[] cominvenmIds){
		companyinventorymainService.deleteBatch(cominvenmIds);
		
		return R.ok();
	}
	
}
