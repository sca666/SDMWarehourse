package xin.cymall.service;

import xin.cymall.entity.Inputapplydetail;

import java.util.List;
import java.util.Map;

/**
 * 入库申请明细单
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface InputapplydetailService {
	
	Inputapplydetail get(String inputapplydetailId);
	
	List<Inputapplydetail> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Inputapplydetail inputapplydetail);
	
	void update(Inputapplydetail inputapplydetail);
	
	void delete(String inputapplydetailId);
	
	void deleteBatch(String[] inputapplydetailIds);

    void updateState(String[] ids, String stateValue);
}
