package xin.cymall.service;

import xin.cymall.entity.CustomerUser;

import java.util.List;
import java.util.Map;

/**
 * 客户与登录用户对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-13 10:48:13
 */
public interface CustomerUserService {
	
	CustomerUser get(String id);
	
	List<CustomerUser> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(CustomerUser customerUser);
	
	void update(CustomerUser customerUser);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    void updateState(String[] ids, String stateValue);
}
