package xin.cymall.service;

import xin.cymall.entity.Outputpopw;

import java.util.List;
import java.util.Map;

/**
 * 出库申请单与出库单对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface OutputpopwService {
	
	Outputpopw get(String outputpopwId);
	
	List<Outputpopw> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Outputpopw outputpopw);
	
	void update(Outputpopw outputpopw);
	
	void delete(String outputpopwId);
	
	void deleteBatch(String[] outputpopwIds);

    void updateState(String[] ids, String stateValue);
}
