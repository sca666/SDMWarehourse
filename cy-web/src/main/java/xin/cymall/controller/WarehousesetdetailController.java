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

import xin.cymall.entity.Warehousesetdetail;
import xin.cymall.service.WarehousesetdetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 仓库结算明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("warehousesetdetail")
public class WarehousesetdetailController {
	@Autowired
	private WarehousesetdetailService warehousesetdetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("warehousesetdetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Warehousesetdetail> warehousesetdetailList = warehousesetdetailService.getList(query);
		int total = warehousesetdetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(warehousesetdetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("warehousesetdetail:save")
    public String add(){
        return "warehousesetdetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("warehousesetdetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Warehousesetdetail warehousesetdetail = warehousesetdetailService.get(id);
        model.addAttribute("model",warehousesetdetail);
        return "warehousesetdetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{housesetdetailId}")
    @RequiresPermissions("warehousesetdetail:info")
    public R info(@PathVariable("housesetdetailId") String housesetdetailId){
        Warehousesetdetail warehousesetdetail = warehousesetdetailService.get(housesetdetailId);
        return R.ok().put("warehousesetdetail", warehousesetdetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存仓库结算明细表")
	@RequestMapping("/save")
	@RequiresPermissions("warehousesetdetail:save")
	public R save(@RequestBody Warehousesetdetail warehousesetdetail){
		warehousesetdetailService.save(warehousesetdetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改仓库结算明细表")
	@RequestMapping("/update")
	@RequiresPermissions("warehousesetdetail:update")
	public R update(@RequestBody Warehousesetdetail warehousesetdetail){
		warehousesetdetailService.update(warehousesetdetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用仓库结算明细表")
    @RequestMapping("/enable")
    @RequiresPermissions("warehousesetdetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		warehousesetdetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用仓库结算明细表")
    @RequestMapping("/limit")
    @RequiresPermissions("warehousesetdetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		warehousesetdetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除仓库结算明细表")
	@RequestMapping("/delete")
	@RequiresPermissions("warehousesetdetail:delete")
	public R delete(@RequestBody String[] housesetdetailIds){
		warehousesetdetailService.deleteBatch(housesetdetailIds);
		
		return R.ok();
	}
	
}
