package xin.cymall.service;

import xin.cymall.entity.Warehousesetdetail;

import java.util.List;
import java.util.Map;

/**
 * 仓库结算明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface WarehousesetdetailService {
	
	Warehousesetdetail get(String housesetdetailId);
	
	List<Warehousesetdetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Warehousesetdetail warehousesetdetail);
	
	void update(Warehousesetdetail warehousesetdetail);
	
	void delete(String housesetdetailId);
	
	void deleteBatch(String[] housesetdetailIds);

    void updateState(String[] ids, String stateValue);
}
