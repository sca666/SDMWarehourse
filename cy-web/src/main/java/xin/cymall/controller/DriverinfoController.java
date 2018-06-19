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

import xin.cymall.entity.Driverinfo;
import xin.cymall.service.DriverinfoService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 司机信息
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("driverinfo")
public class DriverinfoController {
	@Autowired
	private DriverinfoService driverinfoService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("driverinfo:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Driverinfo> driverinfoList = driverinfoService.getList(query);
		int total = driverinfoService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(driverinfoList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("driverinfo:save")
    public String add(){
        return "driverinfo/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("driverinfo:update")
    public String edit(Model model, @PathVariable("id") String id){
		Driverinfo driverinfo = driverinfoService.get(id);
        model.addAttribute("model",driverinfo);
        return "driverinfo/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{dirverinfoId}")
    @RequiresPermissions("driverinfo:info")
    public R info(@PathVariable("dirverinfoId") String dirverinfoId){
        Driverinfo driverinfo = driverinfoService.get(dirverinfoId);
        return R.ok().put("driverinfo", driverinfo);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存司机信息")
	@RequestMapping("/save")
	@RequiresPermissions("driverinfo:save")
	public R save(@RequestBody Driverinfo driverinfo){
		driverinfoService.save(driverinfo);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改司机信息")
	@RequestMapping("/update")
	@RequiresPermissions("driverinfo:update")
	public R update(@RequestBody Driverinfo driverinfo){
		driverinfoService.update(driverinfo);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用司机信息")
    @RequestMapping("/enable")
    @RequiresPermissions("driverinfo:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		driverinfoService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用司机信息")
    @RequestMapping("/limit")
    @RequiresPermissions("driverinfo:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		driverinfoService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除司机信息")
	@RequestMapping("/delete")
	@RequiresPermissions("driverinfo:delete")
	public R delete(@RequestBody String[] dirverinfoIds){
		driverinfoService.deleteBatch(dirverinfoIds);
		
		return R.ok();
	}
	
}
