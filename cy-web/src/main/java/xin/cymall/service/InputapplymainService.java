package xin.cymall.service;

import xin.cymall.entity.Inputapplymain;

import java.util.List;
import java.util.Map;

/**
 * 入库申请主单
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface InputapplymainService {
	
	Inputapplymain get(String inputapplymainId);
	
	List<Inputapplymain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Inputapplymain inputapplymain);
	
	void update(Inputapplymain inputapplymain);
	
	void delete(String inputapplymainId);
	
	void deleteBatch(String[] inputapplymainIds);

    void updateState(String[] ids, String stateValue);
}
