package xin.cymall.service;

import xin.cymall.entity.Inputmain;

import java.util.List;
import java.util.Map;

/**
 * 入库单主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface InputmainService {
	
	Inputmain get(String inputmainId);
	
	List<Inputmain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Inputmain inputmain);
	
	void update(Inputmain inputmain);
	
	void delete(String inputmainId);
	
	void deleteBatch(String[] inputmainIds);

    void updateState(String[] ids, String stateValue);
}
