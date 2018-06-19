package xin.cymall.controller;

import java.util.ArrayList;
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

import xin.cymall.entity.Meteringunit;
import xin.cymall.service.MeteringunitService;
import xin.cymall.utils.EnumBean;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 计量单位
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("meteringunit")
public class MeteringunitController {
	@Autowired
	private MeteringunitService meteringunitService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("meteringunit:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Meteringunit> meteringunitList = meteringunitService.getList(query);
		int total = meteringunitService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(meteringunitList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("meteringunit:save")
    public String add(){
        return "meteringunit/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("meteringunit:update")
    public String edit(Model model, @PathVariable("id") String id){
		Meteringunit meteringunit = meteringunitService.get(id);
        model.addAttribute("model",meteringunit);
        return "meteringunit/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{unitId}")
    @RequiresPermissions("meteringunit:info")
    public R info(@PathVariable("unitId") String unitId){
        Meteringunit meteringunit = meteringunitService.get(unitId);
        return R.ok().put("meteringunit", meteringunit);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存计量单位")
	@RequestMapping("/save")
	@RequiresPermissions("meteringunit:save")
	public R save(@RequestBody Meteringunit meteringunit){
		meteringunitService.save(meteringunit);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改计量单位")
	@RequestMapping("/update")
	@RequiresPermissions("meteringunit:update")
	public R update(@RequestBody Meteringunit meteringunit){
		meteringunitService.update(meteringunit);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用计量单位")
    @RequestMapping("/enable")
    @RequiresPermissions("meteringunit:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		meteringunitService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用计量单位")
    @RequestMapping("/limit")
    @RequiresPermissions("meteringunit:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		meteringunitService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除计量单位")
	@RequestMapping("/delete")
	@RequiresPermissions("meteringunit:delete")
	public R delete(@RequestBody String[] unitIds){
		meteringunitService.deleteBatch(unitIds);
		
		return R.ok();
	}

    /**
     * 获取计量单位的信息
     */
    @ResponseBody
    @RequestMapping("/getunit")
    public R getmeteringunit(){
        List<EnumBean> list = new ArrayList<>();  //new一个保存id和name的类
        List<Meteringunit> meteringunitList = meteringunitService.getMeteringUnit();
        if (meteringunitList != null && meteringunitList.size() > 0){
            for(int i = 0;i < meteringunitList.size();i++){
                EnumBean bean = new EnumBean();
                bean.setCode(meteringunitList.get(i).getUnitId());
                bean.setValue(meteringunitList.get(i).getUnitname());
                list.add(bean);
            }
        }
        return R.ok().put("data",list);
    }

	
}
