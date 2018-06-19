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

import xin.cymall.entity.Outputmain;
import xin.cymall.service.OutputmainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 出库单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("outputmain")
public class OutputmainController {
	@Autowired
	private OutputmainService outputmainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("outputmain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Outputmain> outputmainList = outputmainService.getList(query);
		int total = outputmainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(outputmainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("outputmain:save")
    public String add(){
        return "outputmain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("outputmain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Outputmain outputmain = outputmainService.get(id);
        model.addAttribute("model",outputmain);
        return "outputmain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{outputmainId}")
    @RequiresPermissions("outputmain:info")
    public R info(@PathVariable("outputmainId") String outputmainId){
        Outputmain outputmain = outputmainService.get(outputmainId);
        return R.ok().put("outputmain", outputmain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存出库单主表")
	@RequestMapping("/save")
	@RequiresPermissions("outputmain:save")
	public R save(@RequestBody Outputmain outputmain){
		outputmainService.save(outputmain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改出库单主表")
	@RequestMapping("/update")
	@RequiresPermissions("outputmain:update")
	public R update(@RequestBody Outputmain outputmain){
		outputmainService.update(outputmain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用出库单主表")
    @RequestMapping("/enable")
    @RequiresPermissions("outputmain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		outputmainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用出库单主表")
    @RequestMapping("/limit")
    @RequiresPermissions("outputmain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		outputmainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除出库单主表")
	@RequestMapping("/delete")
	@RequiresPermissions("outputmain:delete")
	public R delete(@RequestBody String[] outputmainIds){
		outputmainService.deleteBatch(outputmainIds);
		
		return R.ok();
	}
	
}
