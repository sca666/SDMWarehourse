package xin.cymall.service;

import xin.cymall.entity.Inputpopw;

import java.util.List;
import java.util.Map;

/**
 * 入库申请单与入库单对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface InputpopwService {
	
	Inputpopw get(String inputpopwId);
	
	List<Inputpopw> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Inputpopw inputpopw);
	
	void update(Inputpopw inputpopw);
	
	void delete(String inputpopwId);
	
	void deleteBatch(String[] inputpopwIds);

    void updateState(String[] ids, String stateValue);
}
