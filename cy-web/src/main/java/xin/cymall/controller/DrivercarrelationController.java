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

import xin.cymall.entity.Drivercarrelation;
import xin.cymall.service.DrivercarrelationService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 车辆与司机关联表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("drivercarrelation")
public class DrivercarrelationController {
	@Autowired
	private DrivercarrelationService drivercarrelationService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("drivercarrelation:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Drivercarrelation> drivercarrelationList = drivercarrelationService.getList(query);
		int total = drivercarrelationService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(drivercarrelationList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("drivercarrelation:save")
    public String add(){
        return "drivercarrelation/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("drivercarrelation:update")
    public String edit(Model model, @PathVariable("id") String id){
		Drivercarrelation drivercarrelation = drivercarrelationService.get(id);
        model.addAttribute("model",drivercarrelation);
        return "drivercarrelation/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{id}")
    @RequiresPermissions("drivercarrelation:info")
    public R info(@PathVariable("id") String id){
        Drivercarrelation drivercarrelation = drivercarrelationService.get(id);
        return R.ok().put("drivercarrelation", drivercarrelation);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存车辆与司机关联表")
	@RequestMapping("/save")
	@RequiresPermissions("drivercarrelation:save")
	public R save(@RequestBody Drivercarrelation drivercarrelation){
		drivercarrelationService.save(drivercarrelation);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改车辆与司机关联表")
	@RequestMapping("/update")
	@RequiresPermissions("drivercarrelation:update")
	public R update(@RequestBody Drivercarrelation drivercarrelation){
		drivercarrelationService.update(drivercarrelation);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用车辆与司机关联表")
    @RequestMapping("/enable")
    @RequiresPermissions("drivercarrelation:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		drivercarrelationService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用车辆与司机关联表")
    @RequestMapping("/limit")
    @RequiresPermissions("drivercarrelation:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		drivercarrelationService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除车辆与司机关联表")
	@RequestMapping("/delete")
	@RequiresPermissions("drivercarrelation:delete")
	public R delete(@RequestBody String[] ids){
		drivercarrelationService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
