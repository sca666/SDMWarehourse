package xin.cymall.service;

import xin.cymall.entity.Warehouse;

import java.util.List;
import java.util.Map;

/**
 * 仓库表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
public interface WarehouseService {
	
	Warehouse get(String warehouseId);
	
	List<Warehouse> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Warehouse warehouse);
	
	void update(Warehouse warehouse);
	
	void delete(String warehouseId);
	
	void deleteBatch(String[] warehouseIds);

    void updateState(String[] ids, String stateValue);
}
