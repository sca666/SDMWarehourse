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

import xin.cymall.entity.Companysettledetail;
import xin.cymall.service.CompanysettledetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 客户结算明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("companysettledetail")
public class CompanysettledetailController {
	@Autowired
	private CompanysettledetailService companysettledetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("companysettledetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Companysettledetail> companysettledetailList = companysettledetailService.getList(query);
		int total = companysettledetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(companysettledetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("companysettledetail:save")
    public String add(){
        return "companysettledetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("companysettledetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Companysettledetail companysettledetail = companysettledetailService.get(id);
        model.addAttribute("model",companysettledetail);
        return "companysettledetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{comsetdetailId}")
    @RequiresPermissions("companysettledetail:info")
    public R info(@PathVariable("comsetdetailId") String comsetdetailId){
        Companysettledetail companysettledetail = companysettledetailService.get(comsetdetailId);
        return R.ok().put("companysettledetail", companysettledetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存客户结算明细表")
	@RequestMapping("/save")
	@RequiresPermissions("companysettledetail:save")
	public R save(@RequestBody Companysettledetail companysettledetail){
		companysettledetailService.save(companysettledetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改客户结算明细表")
	@RequestMapping("/update")
	@RequiresPermissions("companysettledetail:update")
	public R update(@RequestBody Companysettledetail companysettledetail){
		companysettledetailService.update(companysettledetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用客户结算明细表")
    @RequestMapping("/enable")
    @RequiresPermissions("companysettledetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		companysettledetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用客户结算明细表")
    @RequestMapping("/limit")
    @RequiresPermissions("companysettledetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		companysettledetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除客户结算明细表")
	@RequestMapping("/delete")
	@RequiresPermissions("companysettledetail:delete")
	public R delete(@RequestBody String[] comsetdetailIds){
		companysettledetailService.deleteBatch(comsetdetailIds);
		
		return R.ok();
	}
	
}
