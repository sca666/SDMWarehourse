package xin.cymall.service;

import xin.cymall.entity.CustomerCategory;

import java.util.List;
import java.util.Map;

/**
 * 客户分类表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:48:13
 */
public interface CustomerCategoryService {
	
	CustomerCategory get(String id);
	
	List<CustomerCategory> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(CustomerCategory customerCategory);
	
	void update(CustomerCategory customerCategory);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    void updateState(String[] ids, String stateValue);

    List<CustomerCategory> getCustomerCategpryList();
}
