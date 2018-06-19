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

import xin.cymall.entity.Inputapplymain;
import xin.cymall.service.InputapplymainService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 入库申请主单
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("inputapplymain")
public class InputapplymainController {
	@Autowired
	private InputapplymainService inputapplymainService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("inputapplymain:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Inputapplymain> inputapplymainList = inputapplymainService.getList(query);
		int total = inputapplymainService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(inputapplymainList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("inputapplymain:save")
    public String add(){
        return "inputapplymain/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("inputapplymain:update")
    public String edit(Model model, @PathVariable("id") String id){
		Inputapplymain inputapplymain = inputapplymainService.get(id);
        model.addAttribute("model",inputapplymain);
        return "inputapplymain/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{inputapplymainId}")
    @RequiresPermissions("inputapplymain:info")
    public R info(@PathVariable("inputapplymainId") String inputapplymainId){
        Inputapplymain inputapplymain = inputapplymainService.get(inputapplymainId);
        return R.ok().put("inputapplymain", inputapplymain);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存入库申请主单")
	@RequestMapping("/save")
	@RequiresPermissions("inputapplymain:save")
	public R save(@RequestBody Inputapplymain inputapplymain){
		inputapplymainService.save(inputapplymain);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改入库申请主单")
	@RequestMapping("/update")
	@RequiresPermissions("inputapplymain:update")
	public R update(@RequestBody Inputapplymain inputapplymain){
		inputapplymainService.update(inputapplymain);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用入库申请主单")
    @RequestMapping("/enable")
    @RequiresPermissions("inputapplymain:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		inputapplymainService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用入库申请主单")
    @RequestMapping("/limit")
    @RequiresPermissions("inputapplymain:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		inputapplymainService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除入库申请主单")
	@RequestMapping("/delete")
	@RequiresPermissions("inputapplymain:delete")
	public R delete(@RequestBody String[] inputapplymainIds){
		inputapplymainService.deleteBatch(inputapplymainIds);
		
		return R.ok();
	}
	
}
