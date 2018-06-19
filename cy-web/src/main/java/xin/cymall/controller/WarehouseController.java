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

import xin.cymall.entity.Warehouse;
import xin.cymall.service.WarehouseService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 仓库表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
@Controller
@RequestMapping("warehouse")
public class WarehouseController {
	@Autowired
	private WarehouseService warehouseService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("warehouse:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Warehouse> warehouseList = warehouseService.getList(query);
		int total = warehouseService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(warehouseList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("warehouse:save")
    public String add(){
        return "warehouse/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("warehouse:update")
    public String edit(Model model, @PathVariable("id") String id){
		Warehouse warehouse = warehouseService.get(id);
        model.addAttribute("model",warehouse);
        return "warehouse/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{warehouseId}")
    @RequiresPermissions("warehouse:info")
    public R info(@PathVariable("warehouseId") String warehouseId){
        Warehouse warehouse = warehouseService.get(warehouseId);
        return R.ok().put("warehouse", warehouse);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存仓库表")
	@RequestMapping("/save")
	@RequiresPermissions("warehouse:save")
	public R save(@RequestBody Warehouse warehouse){
		warehouseService.save(warehouse);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改仓库表")
	@RequestMapping("/update")
	@RequiresPermissions("warehouse:update")
	public R update(@RequestBody Warehouse warehouse){
		warehouseService.update(warehouse);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用仓库表")
    @RequestMapping("/enable")
    @RequiresPermissions("warehouse:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		warehouseService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用仓库表")
    @RequestMapping("/limit")
    @RequiresPermissions("warehouse:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		warehouseService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除仓库表")
	@RequestMapping("/delete")
	@RequiresPermissions("warehouse:delete")
	public R delete(@RequestBody String[] warehouseIds){
		warehouseService.deleteBatch(warehouseIds);
		
		return R.ok();
	}
	
}
