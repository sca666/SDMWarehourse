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

import xin.cymall.entity.Outputapplydetail;
import xin.cymall.service.OutputapplydetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 出库申请单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("outputapplydetail")
public class OutputapplydetailController {
	@Autowired
	private OutputapplydetailService outputapplydetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("outputapplydetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Outputapplydetail> outputapplydetailList = outputapplydetailService.getList(query);
		int total = outputapplydetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(outputapplydetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("outputapplydetail:save")
    public String add(){
        return "outputapplydetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("outputapplydetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Outputapplydetail outputapplydetail = outputapplydetailService.get(id);
        model.addAttribute("model",outputapplydetail);
        return "outputapplydetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{outputapplydetailId}")
    @RequiresPermissions("outputapplydetail:info")
    public R info(@PathVariable("outputapplydetailId") String outputapplydetailId){
        Outputapplydetail outputapplydetail = outputapplydetailService.get(outputapplydetailId);
        return R.ok().put("outputapplydetail", outputapplydetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存出库申请单明细表")
	@RequestMapping("/save")
	@RequiresPermissions("outputapplydetail:save")
	public R save(@RequestBody Outputapplydetail outputapplydetail){
		outputapplydetailService.save(outputapplydetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改出库申请单明细表")
	@RequestMapping("/update")
	@RequiresPermissions("outputapplydetail:update")
	public R update(@RequestBody Outputapplydetail outputapplydetail){
		outputapplydetailService.update(outputapplydetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用出库申请单明细表")
    @RequestMapping("/enable")
    @RequiresPermissions("outputapplydetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		outputapplydetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用出库申请单明细表")
    @RequestMapping("/limit")
    @RequiresPermissions("outputapplydetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		outputapplydetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除出库申请单明细表")
	@RequestMapping("/delete")
	@RequiresPermissions("outputapplydetail:delete")
	public R delete(@RequestBody String[] outputapplydetailIds){
		outputapplydetailService.deleteBatch(outputapplydetailIds);
		
		return R.ok();
	}
	
}
