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

import xin.cymall.entity.Carinfo;
import xin.cymall.service.CarinfoService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 车辆信息
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("carinfo")
public class CarinfoController {
	@Autowired
	private CarinfoService carinfoService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("carinfo:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Carinfo> carinfoList = carinfoService.getList(query);
		int total = carinfoService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(carinfoList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("carinfo:save")
    public String add(){
        return "carinfo/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("carinfo:update")
    public String edit(Model model, @PathVariable("id") String id){
		Carinfo carinfo = carinfoService.get(id);
        model.addAttribute("model",carinfo);
        return "carinfo/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{carId}")
    @RequiresPermissions("carinfo:info")
    public R info(@PathVariable("carId") String carId){
        Carinfo carinfo = carinfoService.get(carId);
        return R.ok().put("carinfo", carinfo);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存车辆信息")
	@RequestMapping("/save")
	@RequiresPermissions("carinfo:save")
	public R save(@RequestBody Carinfo carinfo){
		carinfoService.save(carinfo);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改车辆信息")
	@RequestMapping("/update")
	@RequiresPermissions("carinfo:update")
	public R update(@RequestBody Carinfo carinfo){
		carinfoService.update(carinfo);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用车辆信息")
    @RequestMapping("/enable")
    @RequiresPermissions("carinfo:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		carinfoService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用车辆信息")
    @RequestMapping("/limit")
    @RequiresPermissions("carinfo:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		carinfoService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除车辆信息")
	@RequestMapping("/delete")
	@RequiresPermissions("carinfo:delete")
	public R delete(@RequestBody String[] carIds){
		carinfoService.deleteBatch(carIds);
		
		return R.ok();
	}
	
}
