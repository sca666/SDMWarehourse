package xin.cymall.service;

import xin.cymall.entity.Inputdetail;

import java.util.List;
import java.util.Map;

/**
 * 入库单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface InputdetailService {
	
	Inputdetail get(String inputdetailId);
	
	List<Inputdetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Inputdetail inputdetail);
	
	void update(Inputdetail inputdetail);
	
	void delete(String inputdetailId);
	
	void deleteBatch(String[] inputdetailIds);

    void updateState(String[] ids, String stateValue);
}
