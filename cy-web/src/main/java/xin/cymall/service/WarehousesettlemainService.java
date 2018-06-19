package xin.cymall.service;

import xin.cymall.entity.Warehousesettlemain;

import java.util.List;
import java.util.Map;

/**
 * 仓库结算主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface WarehousesettlemainService {
	
	Warehousesettlemain get(String housesetmainId);
	
	List<Warehousesettlemain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Warehousesettlemain warehousesettlemain);
	
	void update(Warehousesettlemain warehousesettlemain);
	
	void delete(String housesetmainId);
	
	void deleteBatch(String[] housesetmainIds);

    void updateState(String[] ids, String stateValue);
}
