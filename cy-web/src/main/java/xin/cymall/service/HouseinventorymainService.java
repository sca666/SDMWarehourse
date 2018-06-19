package xin.cymall.service;

import xin.cymall.entity.Houseinventorymain;

import java.util.List;
import java.util.Map;

/**
 * 仓库的库存主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface HouseinventorymainService {
	
	Houseinventorymain get(String houseinvenmId);
	
	List<Houseinventorymain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Houseinventorymain houseinventorymain);
	
	void update(Houseinventorymain houseinventorymain);
	
	void delete(String houseinvenmId);
	
	void deleteBatch(String[] houseinvenmIds);

    void updateState(String[] ids, String stateValue);
}
