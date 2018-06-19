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

import xin.cymall.entity.Inputdetail;
import xin.cymall.service.InputdetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 入库单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("inputdetail")
public class InputdetailController {
	@Autowired
	private InputdetailService inputdetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("inputdetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Inputdetail> inputdetailList = inputdetailService.getList(query);
		int total = inputdetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(inputdetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("inputdetail:save")
    public String add(){
        return "inputdetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("inputdetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Inputdetail inputdetail = inputdetailService.get(id);
        model.addAttribute("model",inputdetail);
        return "inputdetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{inputdetailId}")
    @RequiresPermissions("inputdetail:info")
    public R info(@PathVariable("inputdetailId") String inputdetailId){
        Inputdetail inputdetail = inputdetailService.get(inputdetailId);
        return R.ok().put("inputdetail", inputdetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存入库单明细表")
	@RequestMapping("/save")
	@RequiresPermissions("inputdetail:save")
	public R save(@RequestBody Inputdetail inputdetail){
		inputdetailService.save(inputdetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改入库单明细表")
	@RequestMapping("/update")
	@RequiresPermissions("inputdetail:update")
	public R update(@RequestBody Inputdetail inputdetail){
		inputdetailService.update(inputdetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用入库单明细表")
    @RequestMapping("/enable")
    @RequiresPermissions("inputdetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		inputdetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用入库单明细表")
    @RequestMapping("/limit")
    @RequiresPermissions("inputdetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		inputdetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除入库单明细表")
	@RequestMapping("/delete")
	@RequiresPermissions("inputdetail:delete")
	public R delete(@RequestBody String[] inputdetailIds){
		inputdetailService.deleteBatch(inputdetailIds);
		
		return R.ok();
	}
	
}
