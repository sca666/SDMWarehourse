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

import xin.cymall.entity.Changebill;
import xin.cymall.service.ChangebillService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 调单表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
@Controller
@RequestMapping("changebill")
public class ChangebillController {
	@Autowired
	private ChangebillService changebillService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("changebill:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Changebill> changebillList = changebillService.getList(query);
		int total = changebillService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(changebillList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("changebill:save")
    public String add(){
        return "changebill/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("changebill:update")
    public String edit(Model model, @PathVariable("id") String id){
		Changebill changebill = changebillService.get(id);
        model.addAttribute("model",changebill);
        return "changebill/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{changebillId}")
    @RequiresPermissions("changebill:info")
    public R info(@PathVariable("changebillId") String changebillId){
        Changebill changebill = changebillService.get(changebillId);
        return R.ok().put("changebill", changebill);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存调单表")
	@RequestMapping("/save")
	@RequiresPermissions("changebill:save")
	public R save(@RequestBody Changebill changebill){
		changebillService.save(changebill);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改调单表")
	@RequestMapping("/update")
	@RequiresPermissions("changebill:update")
	public R update(@RequestBody Changebill changebill){
		changebillService.update(changebill);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用调单表")
    @RequestMapping("/enable")
    @RequiresPermissions("changebill:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		changebillService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用调单表")
    @RequestMapping("/limit")
    @RequiresPermissions("changebill:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		changebillService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除调单表")
	@RequestMapping("/delete")
	@RequiresPermissions("changebill:delete")
	public R delete(@RequestBody String[] changebillIds){
		changebillService.deleteBatch(changebillIds);
		
		return R.ok();
	}
	
}
