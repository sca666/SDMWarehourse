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

import xin.cymall.entity.Commodity;
import xin.cymall.service.CommodityService;
import xin.cymall.utils.PageUtils;
import xin.cymall.utils.Query;
import xin.cymall.utils.R;


/**
 * 商品
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
@Controller
@RequestMapping("commodity")
public class CommodityController {
	@Autowired
	private CommodityService commodityService;
	
	/**
	 * 列表
	 */
    @ResponseBody
	@RequestMapping("/list")
	@RequiresPermissions("commodity:list")
	public R list(@RequestParam Map<String, Object> params){
		//查询列表数据
        Query query = new Query(params);

		List<Commodity> commodityList = commodityService.getList(query);
		int total = commodityService.getCount(query);
		
		PageUtils pageUtil = new PageUtils(commodityList, total, query.getLimit(), query.getPage());
		
		return R.ok().put("page", pageUtil);
	}

    /**
     * 跳转到新增页面
     **/
    @RequestMapping("/add")
    @RequiresPermissions("commodity:save")
    public String add(){
        return "commodity/add.jsp";
    }

    /**
     *   跳转到修改页面
     **/
    @RequestMapping("/edit/{id}")
    @RequiresPermissions("commodity:update")
    public String edit(Model model, @PathVariable("id") String id){
		Commodity commodity = commodityService.get(id);
        model.addAttribute("model",commodity);
        return "commodity/edit.jsp";
    }

	/**
	 * 信息
	 */
    @ResponseBody
    @RequestMapping("/info/{commodityId}")
    @RequiresPermissions("commodity:info")
    public R info(@PathVariable("commodityId") String commodityId){
        Commodity commodity = commodityService.get(commodityId);
        return R.ok().put("commodity", commodity);
    }

    /**
	 * 保存
	 */
    @ResponseBody
    @SysLog("保存商品")
	@RequestMapping("/save")
	@RequiresPermissions("commodity:save")
	public R save(@RequestBody Commodity commodity){
        if(commodityService.getcodenum(commodity)>0){
            return R.error("the code is Already exist,please input different!");
            //return  R.error("编号已存在！");
        }
		commodityService.save(commodity);
		return R.ok();
	}
	
	/**
	 * 修改
	 */
    @ResponseBody
    @SysLog("修改商品")
	@RequestMapping("/update")
	@RequiresPermissions("commodity:update")
	public R update(@RequestBody Commodity commodity){
		commodityService.update(commodity);
		
		return R.ok();
	}

    /**
     * 启用
     */
    @ResponseBody
    @SysLog("启用商品")
    @RequestMapping("/enable")
    @RequiresPermissions("commodity:update")
    public R enable(@RequestBody String[] ids){
        String stateValue=StateEnum.ENABLE.getCode();
		commodityService.updateState(ids,stateValue);
        return R.ok();
    }
    /**
     * 禁用
     */
    @ResponseBody
    @SysLog("禁用商品")
    @RequestMapping("/limit")
    @RequiresPermissions("commodity:update")
    public R limit(@RequestBody String[] ids){
        String stateValue=StateEnum.LIMIT.getCode();
		commodityService.updateState(ids,stateValue);
        return R.ok();
    }
	
	/**
	 * 删除
	 */
    @ResponseBody
    @SysLog("删除商品")
	@RequestMapping("/delete")
	@RequiresPermissions("commodity:delete")
	public R delete(@RequestBody String[] commodityIds){
		commodityService.deleteBatch(commodityIds);
		
		return R.ok();
	}
	
}
