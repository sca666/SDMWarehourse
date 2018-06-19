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

import xin.cymall.entity.Inputmain;
import xin.cymall.service.InputmainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 入库单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("inputmain")
public class InputmainController {
	@Autowired
	private InputmainService inputmainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("inputmain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Inputmain> inputmainList = inputmainService.getList(query);
		int total = inputmainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(inputmainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("inputmain:save")
    public String add(){
        return "inputmain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("inputmain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Inputmain inputmain = inputmainService.get(id);
        model.addAttribute("model",inputmain);
        return "inputmain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{inputmainId}")
    @RequiresPermissions("inputmain:info")
    public R info(@PathVariable("inputmainId") String inputmainId){
        Inputmain inputmain = inputmainService.get(inputmainId);
        return R.ok().put("inputmain", inputmain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存入库单主表")
	@RequestMapping("/save")
	@RequiresPermissions("inputmain:save")
	public R save(@RequestBody Inputmain inputmain){
		inputmainService.save(inputmain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改入库单主表")
	@RequestMapping("/update")
	@RequiresPermissions("inputmain:update")
	public R update(@RequestBody Inputmain inputmain){
		inputmainService.update(inputmain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用入库单主表")
    @RequestMapping("/enable")
    @RequiresPermissions("inputmain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		inputmainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用入库单主表")
    @RequestMapping("/limit")
    @RequiresPermissions("inputmain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		inputmainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除入库单主表")
	@RequestMapping("/delete")
	@RequiresPermissions("inputmain:delete")
	public R delete(@RequestBody String[] inputmainIds){
		inputmainService.deleteBatch(inputmainIds);
		
		return R.ok();
	}
	
}
