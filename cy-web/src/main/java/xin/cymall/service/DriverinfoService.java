package xin.cymall.service;

import xin.cymall.entity.Driverinfo;

import java.util.List;
import java.util.Map;

/**
 * 司机信息
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface DriverinfoService {
	
	Driverinfo get(String dirverinfoId);
	
	List<Driverinfo> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Driverinfo driverinfo);
	
	void update(Driverinfo driverinfo);
	
	void delete(String dirverinfoId);
	
	void deleteBatch(String[] dirverinfoIds);

    void updateState(String[] ids, String stateValue);
}
