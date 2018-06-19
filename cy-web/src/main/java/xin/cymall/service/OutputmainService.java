package xin.cymall.service;

import xin.cymall.entity.Outputmain;

import java.util.List;
import java.util.Map;

/**
 * 出库单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface OutputmainService {
	
	Outputmain get(String outputmainId);
	
	List<Outputmain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Outputmain outputmain);
	
	void update(Outputmain outputmain);
	
	void delete(String outputmainId);
	
	void deleteBatch(String[] outputmainIds);

    void updateState(String[] ids, String stateValue);
}
