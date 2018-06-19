package xin.cymall.service;

import xin.cymall.entity.Companysettledetail;

import java.util.List;
import java.util.Map;

/**
 * 客户结算明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface CompanysettledetailService {
	
	Companysettledetail get(String comsetdetailId);
	
	List<Companysettledetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Companysettledetail companysettledetail);
	
	void update(Companysettledetail companysettledetail);
	
	void delete(String comsetdetailId);
	
	void deleteBatch(String[] comsetdetailIds);

    void updateState(String[] ids, String stateValue);
}
