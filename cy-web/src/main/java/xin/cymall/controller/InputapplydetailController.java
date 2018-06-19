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

import xin.cymall.entity.Inputapplydetail;
import xin.cymall.service.InputapplydetailService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 入库申请明细单
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("inputapplydetail")
public class InputapplydetailController {
	@Autowired
	private InputapplydetailService inputapplydetailService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("inputapplydetail:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Inputapplydetail> inputapplydetailList = inputapplydetailService.getList(query);
		int total = inputapplydetailService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(inputapplydetailList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("inputapplydetail:save")
    public String add(){
        return "inputapplydetail/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("inputapplydetail:update")
    public String edit(Model model, @PathVariable("id") String id){
		Inputapplydetail inputapplydetail = inputapplydetailService.get(id);
        model.addAttribute("model",inputapplydetail);
        return "inputapplydetail/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{inputapplydetailId}")
    @RequiresPermissions("inputapplydetail:info")
    public R info(@PathVariable("inputapplydetailId") String inputapplydetailId){
        Inputapplydetail inputapplydetail = inputapplydetailService.get(inputapplydetailId);
        return R.ok().put("inputapplydetail", inputapplydetail);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存入库申请明细单")
	@RequestMapping("/save")
	@RequiresPermissions("inputapplydetail:save")
	public R save(@RequestBody Inputapplydetail inputapplydetail){
		inputapplydetailService.save(inputapplydetail);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改入库申请明细单")
	@RequestMapping("/update")
	@RequiresPermissions("inputapplydetail:update")
	public R update(@RequestBody Inputapplydetail inputapplydetail){
		inputapplydetailService.update(inputapplydetail);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用入库申请明细单")
    @RequestMapping("/enable")
    @RequiresPermissions("inputapplydetail:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		inputapplydetailService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用入库申请明细单")
    @RequestMapping("/limit")
    @RequiresPermissions("inputapplydetail:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		inputapplydetailService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除入库申请明细单")
	@RequestMapping("/delete")
	@RequiresPermissions("inputapplydetail:delete")
	public R delete(@RequestBody String[] inputapplydetailIds){
		inputapplydetailService.deleteBatch(inputapplydetailIds);
		
		return R.ok();
	}
	
}
