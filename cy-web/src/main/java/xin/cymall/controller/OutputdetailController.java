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

import xin.cymall.entity.Outputdetail;
import xin.cymall.service.OutputdetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 出库单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("outputdetail")
public class OutputdetailController {
	@Autowired
	private OutputdetailService outputdetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("outputdetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Outputdetail> outputdetailList = outputdetailService.getList(query);
		int total = outputdetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(outputdetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("outputdetail:save")
    public String add(){
        return "outputdetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("outputdetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Outputdetail outputdetail = outputdetailService.get(id);
        model.addAttribute("model",outputdetail);
        return "outputdetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{outputdetailId}")
    @RequiresPermissions("outputdetail:info")
    public R info(@PathVariable("outputdetailId") String outputdetailId){
        Outputdetail outputdetail = outputdetailService.get(outputdetailId);
        return R.ok().put("outputdetail", outputdetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存出库单明细表")
	@RequestMapping("/save")
	@RequiresPermissions("outputdetail:save")
	public R save(@RequestBody Outputdetail outputdetail){
		outputdetailService.save(outputdetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改出库单明细表")
	@RequestMapping("/update")
	@RequiresPermissions("outputdetail:update")
	public R update(@RequestBody Outputdetail outputdetail){
		outputdetailService.update(outputdetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用出库单明细表")
    @RequestMapping("/enable")
    @RequiresPermissions("outputdetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		outputdetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用出库单明细表")
    @RequestMapping("/limit")
    @RequiresPermissions("outputdetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		outputdetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除出库单明细表")
	@RequestMapping("/delete")
	@RequiresPermissions("outputdetail:delete")
	public R delete(@RequestBody String[] outputdetailIds){
		outputdetailService.deleteBatch(outputdetailIds);
		
		return R.ok();
	}
	
}
