package xin.cymall.service;

import xin.cymall.entity.Outputapplymain;

import java.util.List;
import java.util.Map;

/**
 * 出库申请单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface OutputapplymainService {
	
	Outputapplymain get(String outputapplymainId);
	
	List<Outputapplymain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Outputapplymain outputapplymain);
	
	void update(Outputapplymain outputapplymain);
	
	void delete(String outputapplymainId);
	
	void deleteBatch(String[] outputapplymainIds);

    void updateState(String[] ids, String stateValue);
}
