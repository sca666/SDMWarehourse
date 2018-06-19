package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CommodityDao;
import xin.cymall.entity.Commodity;
import xin.cymall.service.CommodityService;




@Service("commodityService")
@Transactional
public class CommodityServiceImpl implements CommodityService {
	@Autowired
	private CommodityDao commodityDao;
	
	@Override
	public Commodity get(String commodityId){
		return commodityDao.get(commodityId);
	}

	@Override
	public List<Commodity> getList(Map<String, Object> map){
		return commodityDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return commodityDao.getCount(map);
	}

	@Override
	public void save(Commodity commodity){
		commodityDao.save(commodity);
	}

	@Override
	public void update(Commodity commodity){
		commodityDao.update(commodity);
	}

	@Override
	public void delete(String commodityId){
		commodityDao.delete(commodityId);
	}

	@Override
	public void deleteBatch(String[] commodityIds){
		commodityDao.deleteBatch(commodityIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Commodity commodity=get(id);
			commodity.setState(stateValue);
            update(commodity);
        }
    }

	@Override
	public int getcodenum(Commodity commodity) {
		List<Commodity> commodityList = commodityDao.getcodenum(commodity);
		int num = commodityList.size();
		return num;
	}

}
