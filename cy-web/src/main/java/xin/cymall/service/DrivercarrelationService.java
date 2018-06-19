package xin.cymall.service;

import xin.cymall.entity.Drivercarrelation;

import java.util.List;
import java.util.Map;

/**
 * 车辆与司机关联表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface DrivercarrelationService {
	
	Drivercarrelation get(String id);
	
	List<Drivercarrelation> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Drivercarrelation drivercarrelation);
	
	void update(Drivercarrelation drivercarrelation);
	
	void delete(String id);
	
	void deleteBatch(String[] ids);

    void updateState(String[] ids, String stateValue);
}
