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

import xin.cymall.entity.Customer;
import xin.cymall.service.CustomerService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 客户表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("customer")
public class CustomerController {
	@Autowired
	private CustomerService customerService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("customer:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Customer> customerList = customerService.getList(query);
		int total = customerService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(customerList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("customer:save")
    public String add(){
        return "customer/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("customer:update")
    public String edit(Model model, @PathVariable("id") String id){
		Customer customer = customerService.get(id);
        model.addAttribute("model",customer);
        return "customer/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{id}")
    @RequiresPermissions("customer:info")
    public R info(@PathVariable("id") String id){
        Customer customer = customerService.get(id);
        return R.ok().put("customer", customer);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存客户表")
	@RequestMapping("/save")
	@RequiresPermissions("customer:save")
	public R save(@RequestBody Customer customer){
		customerService.save(customer);
		
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改客户表")
	@RequestMapping("/update")
	@RequiresPermissions("customer:update")
	public R update(@RequestBody Customer customer){
		customerService.update(customer);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用客户表")
    @RequestMapping("/enable")
    @RequiresPermissions("customer:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		customerService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用客户表")
    @RequestMapping("/limit")
    @RequiresPermissions("customer:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		customerService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除客户表")
	@RequestMapping("/delete")
	@RequiresPermissions("customer:delete")
	public R delete(@RequestBody String[] ids){
		customerService.deleteBatch(ids);
		
		return R.ok();
	}
	
}
