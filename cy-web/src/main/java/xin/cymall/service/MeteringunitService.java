package xin.cymall.service;

import xin.cymall.entity.Meteringunit;

import java.util.List;
import java.util.Map;

/**
 * 计量单位
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface MeteringunitService {
	
	Meteringunit get(String unitId);
	
	List<Meteringunit> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Meteringunit meteringunit);
	
	void update(Meteringunit meteringunit);
	
	void delete(String unitId);
	
	void deleteBatch(String[] unitIds);

    void updateState(String[] ids, String stateValue);

    List<Meteringunit> getMeteringUnit();
}
