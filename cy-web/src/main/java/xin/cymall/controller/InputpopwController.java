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

import xin.cymall.entity.Inputpopw;
import xin.cymall.service.InputpopwService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 入库申请单与入库单对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("inputpopw")
public class InputpopwController {
	@Autowired
	private InputpopwService inputpopwService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("inputpopw:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Inputpopw> inputpopwList = inputpopwService.getList(query);
		int total = inputpopwService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(inputpopwList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("inputpopw:save")
    public String add(){
        return "inputpopw/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("inputpopw:update")
    public String edit(Model model, @PathVariable("id") String id){
		Inputpopw inputpopw = inputpopwService.get(id);
        model.addAttribute("model",inputpopw);
        return "inputpopw/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{inputpopwId}")
    @RequiresPermissions("inputpopw:info")
    public R info(@PathVariable("inputpopwId") String inputpopwId){
        Inputpopw inputpopw = inputpopwService.get(inputpopwId);
        return R.ok().put("inputpopw", inputpopw);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存入库申请单与入库单对应表")
	@RequestMapping("/save")
	@RequiresPermissions("inputpopw:save")
	public R save(@RequestBody Inputpopw inputpopw){
		inputpopwService.save(inputpopw);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改入库申请单与入库单对应表")
	@RequestMapping("/update")
	@RequiresPermissions("inputpopw:update")
	public R update(@RequestBody Inputpopw inputpopw){
		inputpopwService.update(inputpopw);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用入库申请单与入库单对应表")
    @RequestMapping("/enable")
    @RequiresPermissions("inputpopw:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		inputpopwService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用入库申请单与入库单对应表")
    @RequestMapping("/limit")
    @RequiresPermissions("inputpopw:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		inputpopwService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除入库申请单与入库单对应表")
	@RequestMapping("/delete")
	@RequiresPermissions("inputpopw:delete")
	public R delete(@RequestBody String[] inputpopwIds){
		inputpopwService.deleteBatch(inputpopwIds);
		
		return R.ok();
	}
	
}
