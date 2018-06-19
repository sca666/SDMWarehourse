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

import xin.cymall.entity.Outputpopw;
import xin.cymall.service.OutputpopwService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 出库申请单与出库单对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("outputpopw")
public class OutputpopwController {
	@Autowired
	private OutputpopwService outputpopwService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("outputpopw:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Outputpopw> outputpopwList = outputpopwService.getList(query);
		int total = outputpopwService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(outputpopwList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("outputpopw:save")
    public String add(){
        return "outputpopw/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("outputpopw:update")
    public String edit(Model model, @PathVariable("id") String id){
		Outputpopw outputpopw = outputpopwService.get(id);
        model.addAttribute("model",outputpopw);
        return "outputpopw/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{outputpopwId}")
    @RequiresPermissions("outputpopw:info")
    public R info(@PathVariable("outputpopwId") String outputpopwId){
        Outputpopw outputpopw = outputpopwService.get(outputpopwId);
        return R.ok().put("outputpopw", outputpopw);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存出库申请单与出库单对应表")
	@RequestMapping("/save")
	@RequiresPermissions("outputpopw:save")
	public R save(@RequestBody Outputpopw outputpopw){
		outputpopwService.save(outputpopw);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改出库申请单与出库单对应表")
	@RequestMapping("/update")
	@RequiresPermissions("outputpopw:update")
	public R update(@RequestBody Outputpopw outputpopw){
		outputpopwService.update(outputpopw);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用出库申请单与出库单对应表")
    @RequestMapping("/enable")
    @RequiresPermissions("outputpopw:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		outputpopwService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用出库申请单与出库单对应表")
    @RequestMapping("/limit")
    @RequiresPermissions("outputpopw:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		outputpopwService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除出库申请单与出库单对应表")
	@RequestMapping("/delete")
	@RequiresPermissions("outputpopw:delete")
	public R delete(@RequestBody String[] outputpopwIds){
		outputpopwService.deleteBatch(outputpopwIds);
		
		return R.ok();
	}
	
}
