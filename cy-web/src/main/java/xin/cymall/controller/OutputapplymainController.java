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

import xin.cymall.entity.Outputapplymain;
import xin.cymall.service.OutputapplymainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 出库申请单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("outputapplymain")
public class OutputapplymainController {
	@Autowired
	private OutputapplymainService outputapplymainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("outputapplymain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Outputapplymain> outputapplymainList = outputapplymainService.getList(query);
		int total = outputapplymainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(outputapplymainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("outputapplymain:save")
    public String add(){
        return "outputapplymain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("outputapplymain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Outputapplymain outputapplymain = outputapplymainService.get(id);
        model.addAttribute("model",outputapplymain);
        return "outputapplymain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{outputapplymainId}")
    @RequiresPermissions("outputapplymain:info")
    public R info(@PathVariable("outputapplymainId") String outputapplymainId){
        Outputapplymain outputapplymain = outputapplymainService.get(outputapplymainId);
        return R.ok().put("outputapplymain", outputapplymain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存出库申请单主表")
	@RequestMapping("/save")
	@RequiresPermissions("outputapplymain:save")
	public R save(@RequestBody Outputapplymain outputapplymain){
		outputapplymainService.save(outputapplymain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改出库申请单主表")
	@RequestMapping("/update")
	@RequiresPermissions("outputapplymain:update")
	public R update(@RequestBody Outputapplymain outputapplymain){
		outputapplymainService.update(outputapplymain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用出库申请单主表")
    @RequestMapping("/enable")
    @RequiresPermissions("outputapplymain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		outputapplymainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用出库申请单主表")
    @RequestMapping("/limit")
    @RequiresPermissions("outputapplymain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		outputapplymainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除出库申请单主表")
	@RequestMapping("/delete")
	@RequiresPermissions("outputapplymain:delete")
	public R delete(@RequestBody String[] outputapplymainIds){
		outputapplymainService.deleteBatch(outputapplymainIds);
		
		return R.ok();
	}
	
}
