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

import xin.cymall.entity.Raiserenttype;
import xin.cymall.service.RaiserenttypeService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 加租类型
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("raiserenttype")
public class RaiserenttypeController {
	@Autowired
	private RaiserenttypeService raiserenttypeService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("raiserenttype:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Raiserenttype> raiserenttypeList = raiserenttypeService.getList(query);
		int total = raiserenttypeService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(raiserenttypeList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("raiserenttype:save")
    public String add(){
        return "raiserenttype/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("raiserenttype:update")
    public String edit(Model model, @PathVariable("id") String id){
		Raiserenttype raiserenttype = raiserenttypeService.get(id);
        model.addAttribute("model",raiserenttype);
        return "raiserenttype/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{raiserentId}")
    @RequiresPermissions("raiserenttype:info")
    public R info(@PathVariable("raiserentId") String raiserentId){
        Raiserenttype raiserenttype = raiserenttypeService.get(raiserentId);
        return R.ok().put("raiserenttype", raiserenttype);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存加租类型")
	@RequestMapping("/save")
	@RequiresPermissions("raiserenttype:save")
	public R save(@RequestBody Raiserenttype raiserenttype){
		raiserenttypeService.save(raiserenttype);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改加租类型")
	@RequestMapping("/update")
	@RequiresPermissions("raiserenttype:update")
	public R update(@RequestBody Raiserenttype raiserenttype){
		raiserenttypeService.update(raiserenttype);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用加租类型")
    @RequestMapping("/enable")
    @RequiresPermissions("raiserenttype:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		raiserenttypeService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用加租类型")
    @RequestMapping("/limit")
    @RequiresPermissions("raiserenttype:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		raiserenttypeService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除加租类型")
	@RequestMapping("/delete")
	@RequiresPermissions("raiserenttype:delete")
	public R delete(@RequestBody String[] raiserentIds){
		raiserenttypeService.deleteBatch(raiserentIds);
		
		return R.ok();
	}
	
}
