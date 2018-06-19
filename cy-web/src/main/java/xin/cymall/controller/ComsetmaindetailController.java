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

import xin.cymall.entity.Comsetmaindetail;
import xin.cymall.service.ComsetmaindetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 客户主表与明细表对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
@Controller
@RequestMapping("comsetmaindetail")
public class ComsetmaindetailController {
	@Autowired
	private ComsetmaindetailService comsetmaindetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("comsetmaindetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Comsetmaindetail> comsetmaindetailList = comsetmaindetailService.getList(query);
		int total = comsetmaindetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(comsetmaindetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("comsetmaindetail:save")
    public String add(){
        return "comsetmaindetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("comsetmaindetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Comsetmaindetail comsetmaindetail = comsetmaindetailService.get(id);
        model.addAttribute("model",comsetmaindetail);
        return "comsetmaindetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{comsetmaindetailId}")
    @RequiresPermissions("comsetmaindetail:info")
    public R info(@PathVariable("comsetmaindetailId") String comsetmaindetailId){
        Comsetmaindetail comsetmaindetail = comsetmaindetailService.get(comsetmaindetailId);
        return R.ok().put("comsetmaindetail", comsetmaindetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存客户主表与明细表对应表")
	@RequestMapping("/save")
	@RequiresPermissions("comsetmaindetail:save")
	public R save(@RequestBody Comsetmaindetail comsetmaindetail){
		comsetmaindetailService.save(comsetmaindetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改客户主表与明细表对应表")
	@RequestMapping("/update")
	@RequiresPermissions("comsetmaindetail:update")
	public R update(@RequestBody Comsetmaindetail comsetmaindetail){
		comsetmaindetailService.update(comsetmaindetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用客户主表与明细表对应表")
    @RequestMapping("/enable")
    @RequiresPermissions("comsetmaindetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		comsetmaindetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用客户主表与明细表对应表")
    @RequestMapping("/limit")
    @RequiresPermissions("comsetmaindetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		comsetmaindetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除客户主表与明细表对应表")
	@RequestMapping("/delete")
	@RequiresPermissions("comsetmaindetail:delete")
	public R delete(@RequestBody String[] comsetmaindetailIds){
		comsetmaindetailService.deleteBatch(comsetmaindetailIds);
		
		return R.ok();
	}
	
}
