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

import xin.cymall.entity.Companysettlemain;
import xin.cymall.service.CompanysettlemainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 客户结算主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("companysettlemain")
public class CompanysettlemainController {
	@Autowired
	private CompanysettlemainService companysettlemainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("companysettlemain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Companysettlemain> companysettlemainList = companysettlemainService.getList(query);
		int total = companysettlemainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(companysettlemainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("companysettlemain:save")
    public String add(){
        return "companysettlemain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("companysettlemain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Companysettlemain companysettlemain = companysettlemainService.get(id);
        model.addAttribute("model",companysettlemain);
        return "companysettlemain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{comsetmainId}")
    @RequiresPermissions("companysettlemain:info")
    public R info(@PathVariable("comsetmainId") String comsetmainId){
        Companysettlemain companysettlemain = companysettlemainService.get(comsetmainId);
        return R.ok().put("companysettlemain", companysettlemain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存客户结算主表")
	@RequestMapping("/save")
	@RequiresPermissions("companysettlemain:save")
	public R save(@RequestBody Companysettlemain companysettlemain){
		companysettlemainService.save(companysettlemain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改客户结算主表")
	@RequestMapping("/update")
	@RequiresPermissions("companysettlemain:update")
	public R update(@RequestBody Companysettlemain companysettlemain){
		companysettlemainService.update(companysettlemain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用客户结算主表")
    @RequestMapping("/enable")
    @RequiresPermissions("companysettlemain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		companysettlemainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用客户结算主表")
    @RequestMapping("/limit")
    @RequiresPermissions("companysettlemain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		companysettlemainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除客户结算主表")
	@RequestMapping("/delete")
	@RequiresPermissions("companysettlemain:delete")
	public R delete(@RequestBody String[] comsetmainIds){
		companysettlemainService.deleteBatch(comsetmainIds);
		
		return R.ok();
	}
	
}
