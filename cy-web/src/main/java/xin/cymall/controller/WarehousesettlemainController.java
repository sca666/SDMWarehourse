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

import xin.cymall.entity.Warehousesettlemain;
import xin.cymall.service.WarehousesettlemainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 仓库结算主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("warehousesettlemain")
public class WarehousesettlemainController {
	@Autowired
	private WarehousesettlemainService warehousesettlemainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("warehousesettlemain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Warehousesettlemain> warehousesettlemainList = warehousesettlemainService.getList(query);
		int total = warehousesettlemainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(warehousesettlemainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("warehousesettlemain:save")
    public String add(){
        return "warehousesettlemain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("warehousesettlemain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Warehousesettlemain warehousesettlemain = warehousesettlemainService.get(id);
        model.addAttribute("model",warehousesettlemain);
        return "warehousesettlemain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{housesetmainId}")
    @RequiresPermissions("warehousesettlemain:info")
    public R info(@PathVariable("housesetmainId") String housesetmainId){
        Warehousesettlemain warehousesettlemain = warehousesettlemainService.get(housesetmainId);
        return R.ok().put("warehousesettlemain", warehousesettlemain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存仓库结算主表")
	@RequestMapping("/save")
	@RequiresPermissions("warehousesettlemain:save")
	public R save(@RequestBody Warehousesettlemain warehousesettlemain){
		warehousesettlemainService.save(warehousesettlemain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改仓库结算主表")
	@RequestMapping("/update")
	@RequiresPermissions("warehousesettlemain:update")
	public R update(@RequestBody Warehousesettlemain warehousesettlemain){
		warehousesettlemainService.update(warehousesettlemain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用仓库结算主表")
    @RequestMapping("/enable")
    @RequiresPermissions("warehousesettlemain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		warehousesettlemainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用仓库结算主表")
    @RequestMapping("/limit")
    @RequiresPermissions("warehousesettlemain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		warehousesettlemainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除仓库结算主表")
	@RequestMapping("/delete")
	@RequiresPermissions("warehousesettlemain:delete")
	public R delete(@RequestBody String[] housesetmainIds){
		warehousesettlemainService.deleteBatch(housesetmainIds);
		
		return R.ok();
	}
	
}
