package xin.cymall.service;

import xin.cymall.entity.Companyinventorydetail;

import java.util.List;
import java.util.Map;

/**
 * 对客户的库存明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface CompanyinventorydetailService {
	
	Companyinventorydetail get(String cominvendId);
	
	List<Companyinventorydetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Companyinventorydetail companyinventorydetail);
	
	void update(Companyinventorydetail companyinventorydetail);
	
	void delete(String cominvendId);
	
	void deleteBatch(String[] cominvendIds);

    void updateState(String[] ids, String stateValue);
}
