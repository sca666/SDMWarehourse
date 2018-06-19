package xin.cymall.service;

import xin.cymall.entity.Outputapplydetail;

import java.util.List;
import java.util.Map;

/**
 * 出库申请单明细表
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:03
 */
public interface OutputapplydetailService {
	
	Outputapplydetail get(String outputapplydetailId);
	
	List<Outputapplydetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Outputapplydetail outputapplydetail);
	
	void update(Outputapplydetail outputapplydetail);
	
	void delete(String outputapplydetailId);
	
	void deleteBatch(String[] outputapplydetailIds);

    void updateState(String[] ids, String stateValue);
}
