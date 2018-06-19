package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.WarehousesetdetailDao;
import xin.cymall.entity.Warehousesetdetail;
import xin.cymall.service.WarehousesetdetailService;




@Service("warehousesetdetailService")
@Transactional
public class WarehousesetdetailServiceImpl implements WarehousesetdetailService {
	@Autowired
	private WarehousesetdetailDao warehousesetdetailDao;
	
	@Override
	public Warehousesetdetail get(String housesetdetailId){
		return warehousesetdetailDao.get(housesetdetailId);
	}

	@Override
	public List<Warehousesetdetail> getList(Map<String, Object> map){
		return warehousesetdetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return warehousesetdetailDao.getCount(map);
	}

	@Override
	public void save(Warehousesetdetail warehousesetdetail){
		warehousesetdetailDao.save(warehousesetdetail);
	}

	@Override
	public void update(Warehousesetdetail warehousesetdetail){
		warehousesetdetailDao.update(warehousesetdetail);
	}

	@Override
	public void delete(String housesetdetailId){
		warehousesetdetailDao.delete(housesetdetailId);
	}

	@Override
	public void deleteBatch(String[] housesetdetailIds){
		warehousesetdetailDao.deleteBatch(housesetdetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Warehousesetdetail warehousesetdetail=get(id);
			warehousesetdetail.setState(stateValue);
            update(warehousesetdetail);
        }
    }
	
}
