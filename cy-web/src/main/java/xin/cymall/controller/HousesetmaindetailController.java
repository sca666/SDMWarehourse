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

import xin.cymall.entity.Housesetmaindetail;
import xin.cymall.service.HousesetmaindetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 仓库主表与明细表对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
@Controller
@RequestMapping("housesetmaindetail")
public class HousesetmaindetailController {
	@Autowired
	private HousesetmaindetailService housesetmaindetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("housesetmaindetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Housesetmaindetail> housesetmaindetailList = housesetmaindetailService.getList(query);
		int total = housesetmaindetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(housesetmaindetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("housesetmaindetail:save")
    public String add(){
        return "housesetmaindetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("housesetmaindetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Housesetmaindetail housesetmaindetail = housesetmaindetailService.get(id);
        model.addAttribute("model",housesetmaindetail);
        return "housesetmaindetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{housesetmaindetailId}")
    @RequiresPermissions("housesetmaindetail:info")
    public R info(@PathVariable("housesetmaindetailId") String housesetmaindetailId){
        Housesetmaindetail housesetmaindetail = housesetmaindetailService.get(housesetmaindetailId);
        return R.ok().put("housesetmaindetail", housesetmaindetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存仓库主表与明细表对应表")
	@RequestMapping("/save")
	@RequiresPermissions("housesetmaindetail:save")
	public R save(@RequestBody Housesetmaindetail housesetmaindetail){
		housesetmaindetailService.save(housesetmaindetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改仓库主表与明细表对应表")
	@RequestMapping("/update")
	@RequiresPermissions("housesetmaindetail:update")
	public R update(@RequestBody Housesetmaindetail housesetmaindetail){
		housesetmaindetailService.update(housesetmaindetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用仓库主表与明细表对应表")
    @RequestMapping("/enable")
    @RequiresPermissions("housesetmaindetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		housesetmaindetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用仓库主表与明细表对应表")
    @RequestMapping("/limit")
    @RequiresPermissions("housesetmaindetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		housesetmaindetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除仓库主表与明细表对应表")
	@RequestMapping("/delete")
	@RequiresPermissions("housesetmaindetail:delete")
	public R delete(@RequestBody String[] housesetmaindetailIds){
		housesetmaindetailService.deleteBatch(housesetmaindetailIds);
		
		return R.ok();
	}
	
}
