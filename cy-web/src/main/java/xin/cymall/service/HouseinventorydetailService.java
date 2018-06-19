package xin.cymall.service;

import xin.cymall.entity.Houseinventorydetail;

import java.util.List;
import java.util.Map;

/**
 * 仓库的库存明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface HouseinventorydetailService {
	
	Houseinventorydetail get(String houseinvendId);
	
	List<Houseinventorydetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Houseinventorydetail houseinventorydetail);
	
	void update(Houseinventorydetail houseinventorydetail);
	
	void delete(String houseinvendId);
	
	void deleteBatch(String[] houseinvendIds);

    void updateState(String[] ids, String stateValue);
}
