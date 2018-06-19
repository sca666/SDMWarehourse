package xin.cymall.service;

import xin.cymall.entity.Raiserenttype;

import java.util.List;
import java.util.Map;

/**
 * 加租类型
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface RaiserenttypeService {
	
	Raiserenttype get(String raiserentId);
	
	List<Raiserenttype> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Raiserenttype raiserenttype);
	
	void update(Raiserenttype raiserenttype);
	
	void delete(String raiserentId);
	
	void deleteBatch(String[] raiserentIds);

    void updateState(String[] ids, String stateValue);
}
