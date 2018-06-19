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

import xin.cymall.entity.Houseinventorymain;
import xin.cymall.service.HouseinventorymainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 仓库的库存主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("houseinventorymain")
public class HouseinventorymainController {
	@Autowired
	private HouseinventorymainService houseinventorymainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("houseinventorymain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Houseinventorymain> houseinventorymainList = houseinventorymainService.getList(query);
		int total = houseinventorymainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(houseinventorymainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("houseinventorymain:save")
    public String add(){
        return "houseinventorymain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("houseinventorymain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Houseinventorymain houseinventorymain = houseinventorymainService.get(id);
        model.addAttribute("model",houseinventorymain);
        return "houseinventorymain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{houseinvenmId}")
    @RequiresPermissions("houseinventorymain:info")
    public R info(@PathVariable("houseinvenmId") String houseinvenmId){
        Houseinventorymain houseinventorymain = houseinventorymainService.get(houseinvenmId);
        return R.ok().put("houseinventorymain", houseinventorymain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存仓库的库存主表")
	@RequestMapping("/save")
	@RequiresPermissions("houseinventorymain:save")
	public R save(@RequestBody Houseinventorymain houseinventorymain){
		houseinventorymainService.save(houseinventorymain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改仓库的库存主表")
	@RequestMapping("/update")
	@RequiresPermissions("houseinventorymain:update")
	public R update(@RequestBody Houseinventorymain houseinventorymain){
		houseinventorymainService.update(houseinventorymain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用仓库的库存主表")
    @RequestMapping("/enable")
    @RequiresPermissions("houseinventorymain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		houseinventorymainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用仓库的库存主表")
    @RequestMapping("/limit")
    @RequiresPermissions("houseinventorymain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		houseinventorymainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除仓库的库存主表")
	@RequestMapping("/delete")
	@RequiresPermissions("houseinventorymain:delete")
	public R delete(@RequestBody String[] houseinvenmIds){
		houseinventorymainService.deleteBatch(houseinvenmIds);
		
		return R.ok();
	}
	
}
