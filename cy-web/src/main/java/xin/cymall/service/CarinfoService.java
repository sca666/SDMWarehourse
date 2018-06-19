package xin.cymall.service;

import xin.cymall.entity.Carinfo;

import java.util.List;
import java.util.Map;

/**
 * 车辆信息
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface CarinfoService {
	
	Carinfo get(String carId);
	
	List<Carinfo> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Carinfo carinfo);
	
	void update(Carinfo carinfo);
	
	void delete(String carId);
	
	void deleteBatch(String[] carIds);

    void updateState(String[] ids, String stateValue);
}
