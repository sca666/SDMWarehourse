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

import xin.cymall.entity.Houseinventorydetail;
import xin.cymall.service.HouseinventorydetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 仓库的库存明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("houseinventorydetail")
public class HouseinventorydetailController {
	@Autowired
	private HouseinventorydetailService houseinventorydetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("houseinventorydetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Houseinventorydetail> houseinventorydetailList = houseinventorydetailService.getList(query);
		int total = houseinventorydetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(houseinventorydetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("houseinventorydetail:save")
    public String add(){
        return "houseinventorydetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("houseinventorydetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Houseinventorydetail houseinventorydetail = houseinventorydetailService.get(id);
        model.addAttribute("model",houseinventorydetail);
        return "houseinventorydetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{houseinvendId}")
    @RequiresPermissions("houseinventorydetail:info")
    public R info(@PathVariable("houseinvendId") String houseinvendId){
        Houseinventorydetail houseinventorydetail = houseinventorydetailService.get(houseinvendId);
        return R.ok().put("houseinventorydetail", houseinventorydetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存仓库的库存明细表")
	@RequestMapping("/save")
	@RequiresPermissions("houseinventorydetail:save")
	public R save(@RequestBody Houseinventorydetail houseinventorydetail){
		houseinventorydetailService.save(houseinventorydetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改仓库的库存明细表")
	@RequestMapping("/update")
	@RequiresPermissions("houseinventorydetail:update")
	public R update(@RequestBody Houseinventorydetail houseinventorydetail){
		houseinventorydetailService.update(houseinventorydetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用仓库的库存明细表")
    @RequestMapping("/enable")
    @RequiresPermissions("houseinventorydetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		houseinventorydetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用仓库的库存明细表")
    @RequestMapping("/limit")
    @RequiresPermissions("houseinventorydetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		houseinventorydetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除仓库的库存明细表")
	@RequestMapping("/delete")
	@RequiresPermissions("houseinventorydetail:delete")
	public R delete(@RequestBody String[] houseinvendIds){
		houseinventorydetailService.deleteBatch(houseinvendIds);
		
		return R.ok();
	}
	
}
