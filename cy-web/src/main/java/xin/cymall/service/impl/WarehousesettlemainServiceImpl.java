package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.WarehousesettlemainDao;
import xin.cymall.entity.Warehousesettlemain;
import xin.cymall.service.WarehousesettlemainService;




@Service("warehousesettlemainService")
@Transactional
public class WarehousesettlemainServiceImpl implements WarehousesettlemainService {
	@Autowired
	private WarehousesettlemainDao warehousesettlemainDao;
	
	@Override
	public Warehousesettlemain get(String housesetmainId){
		return warehousesettlemainDao.get(housesetmainId);
	}

	@Override
	public List<Warehousesettlemain> getList(Map<String, Object> map){
		return warehousesettlemainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return warehousesettlemainDao.getCount(map);
	}

	@Override
	public void save(Warehousesettlemain warehousesettlemain){
		warehousesettlemainDao.save(warehousesettlemain);
	}

	@Override
	public void update(Warehousesettlemain warehousesettlemain){
		warehousesettlemainDao.update(warehousesettlemain);
	}

	@Override
	public void delete(String housesetmainId){
		warehousesettlemainDao.delete(housesetmainId);
	}

	@Override
	public void deleteBatch(String[] housesetmainIds){
		warehousesettlemainDao.deleteBatch(housesetmainIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Warehousesettlemain warehousesettlemain=get(id);
			warehousesettlemain.setState(stateValue);
            update(warehousesettlemain);
        }
    }
	
}
