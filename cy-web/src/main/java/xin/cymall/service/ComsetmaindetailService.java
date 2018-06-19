package xin.cymall.service;

import xin.cymall.entity.Comsetmaindetail;

import java.util.List;
import java.util.Map;

/**
 * 客户主表与明细表对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface ComsetmaindetailService {
	
	Comsetmaindetail get(String comsetmaindetailId);
	
	List<Comsetmaindetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Comsetmaindetail comsetmaindetail);
	
	void update(Comsetmaindetail comsetmaindetail);
	
	void delete(String comsetmaindetailId);
	
	void deleteBatch(String[] comsetmaindetailIds);

    void updateState(String[] ids, String stateValue);
}
