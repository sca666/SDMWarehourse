package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.WarehouseDao;
import xin.cymall.entity.Warehouse;
import xin.cymall.service.WarehouseService;




@Service("warehouseService")
@Transactional
public class WarehouseServiceImpl implements WarehouseService {
	@Autowired
	private WarehouseDao warehouseDao;
	
	@Override
	public Warehouse get(String warehouseId){
		return warehouseDao.get(warehouseId);
	}

	@Override
	public List<Warehouse> getList(Map<String, Object> map){
		return warehouseDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return warehouseDao.getCount(map);
	}

	@Override
	public void save(Warehouse warehouse){
		warehouseDao.save(warehouse);
	}

	@Override
	public void update(Warehouse warehouse){
		warehouseDao.update(warehouse);
	}

	@Override
	public void delete(String warehouseId){
		warehouseDao.delete(warehouseId);
	}

	@Override
	public void deleteBatch(String[] warehouseIds){
		warehouseDao.deleteBatch(warehouseIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Warehouse warehouse=get(id);
			warehouse.setState(stateValue);
            update(warehouse);
        }
    }
	
}
