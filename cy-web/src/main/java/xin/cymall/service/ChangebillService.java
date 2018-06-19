package xin.cymall.service;

import xin.cymall.entity.Changebill;

import java.util.List;
import java.util.Map;

/**
 * 调单表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
public interface ChangebillService {
	
	Changebill get(String changebillId);
	
	List<Changebill> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Changebill changebill);
	
	void update(Changebill changebill);
	
	void delete(String changebillId);
	
	void deleteBatch(String[] changebillIds);

    void updateState(String[] ids, String stateValue);
}
