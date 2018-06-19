package xin.cymall.service;

import xin.cymall.entity.Basicrenttype;

import java.util.List;
import java.util.Map;

/**
 * 基本仓租类型
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface BasicrenttypeService {
	
	Basicrenttype get(String basicrentId);
	
	List<Basicrenttype> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Basicrenttype basicrenttype);
	
	void update(Basicrenttype basicrenttype);
	
	void delete(String basicrentId);
	
	void deleteBatch(String[] basicrentIds);

    void updateState(String[] ids, String stateValue);
}
