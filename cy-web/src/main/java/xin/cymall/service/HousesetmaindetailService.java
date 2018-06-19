package xin.cymall.service;

import xin.cymall.entity.Housesetmaindetail;

import java.util.List;
import java.util.Map;

/**
 * 仓库主表与明细表对应表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:02
 */
public interface HousesetmaindetailService {
	
	Housesetmaindetail get(String housesetmaindetailId);
	
	List<Housesetmaindetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Housesetmaindetail housesetmaindetail);
	
	void update(Housesetmaindetail housesetmaindetail);
	
	void delete(String housesetmaindetailId);
	
	void deleteBatch(String[] housesetmaindetailIds);

    void updateState(String[] ids, String stateValue);
}
