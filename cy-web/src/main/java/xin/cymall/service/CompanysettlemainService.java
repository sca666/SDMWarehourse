package xin.cymall.service;

import xin.cymall.entity.Companysettlemain;

import java.util.List;
import java.util.Map;

/**
 * 客户结算主表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface CompanysettlemainService {
	
	Companysettlemain get(String comsetmainId);
	
	List<Companysettlemain> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Companysettlemain companysettlemain);
	
	void update(Companysettlemain companysettlemain);
	
	void delete(String comsetmainId);
	
	void deleteBatch(String[] comsetmainIds);

    void updateState(String[] ids, String stateValue);
}
