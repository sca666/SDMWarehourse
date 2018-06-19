package xin.cymall.service;

import xin.cymall.entity.Commodity;

import java.util.List;
import java.util.Map;

/**
 * 商品
 * 
 * @author chenyi
 * @email 228112142@qq.com
 * @date 2018-06-12 20:54:04
 */
public interface CommodityService {
	
	Commodity get(String commodityId);
	
	List<Commodity> getList(Map<String, Object> map);
	
	int getCount(Map<String, Object> map);
	
	void save(Commodity commodity);
	
	void update(Commodity commodity);
	
	void delete(String commodityId);
	
	void deleteBatch(String[] commodityIds);

    void updateState(String[] ids, String stateValue);

    int getcodenum(Commodity commodity);
}
