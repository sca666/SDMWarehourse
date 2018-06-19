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

import xin.cymall.entity.Basicrenttype;
import xin.cymall.service.BasicrenttypeService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 基本仓租类型
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("basicrenttype")
public class BasicrenttypeController {
	@Autowired
	private BasicrenttypeService basicrenttypeService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("basicrenttype:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Basicrenttype> basicrenttypeList = basicrenttypeService.getList(query);
		int total = basicrenttypeService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(basicrenttypeList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("basicrenttype:save")
    public String add(){
        return "basicrenttype/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("basicrenttype:update")
    public String edit(Model model, @PathVariable("id") String id){
		Basicrenttype basicrenttype = basicrenttypeService.get(id);
        model.addAttribute("model",basicrenttype);
        return "basicrenttype/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{basicrentId}")
    @RequiresPermissions("basicrenttype:info")
    public R info(@PathVariable("basicrentId") String basicrentId){
        Basicrenttype basicrenttype = basicrenttypeService.get(basicrentId);
        return R.ok().put("basicrenttype", basicrenttype);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存基本仓租类型")
	@RequestMapping("/save")
	@RequiresPermissions("basicrenttype:save")
	public R save(@RequestBody Basicrenttype basicrenttype){
		basicrenttypeService.save(basicrenttype);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改基本仓租类型")
	@RequestMapping("/update")
	@RequiresPermissions("basicrenttype:update")
	public R update(@RequestBody Basicrenttype basicrenttype){
		basicrenttypeService.update(basicrenttype);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用基本仓租类型")
    @RequestMapping("/enable")
    @RequiresPermissions("basicrenttype:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		basicrenttypeService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用基本仓租类型")
    @RequestMapping("/limit")
    @RequiresPermissions("basicrenttype:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		basicrenttypeService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除基本仓租类型")
	@RequestMapping("/delete")
	@RequiresPermissions("basicrenttype:delete")
	public R delete(@RequestBody String[] basicrentIds){
		basicrenttypeService.deleteBatch(basicrentIds);
		
		return R.ok();
	}
	
}
