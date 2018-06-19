package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.DriverinfoDao;
import xin.cymall.entity.Driverinfo;
import xin.cymall.service.DriverinfoService;




@Service("driverinfoService")
@Transactional
public class DriverinfoServiceImpl implements DriverinfoService {
	@Autowired
	private DriverinfoDao driverinfoDao;
	
	@Override
	public Driverinfo get(String dirverinfoId){
		return driverinfoDao.get(dirverinfoId);
	}

	@Override
	public List<Driverinfo> getList(Map<String, Object> map){
		return driverinfoDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return driverinfoDao.getCount(map);
	}

	@Override
	public void save(Driverinfo driverinfo){
		driverinfoDao.save(driverinfo);
	}

	@Override
	public void update(Driverinfo driverinfo){
		driverinfoDao.update(driverinfo);
	}

	@Override
	public void delete(String dirverinfoId){
		driverinfoDao.delete(dirverinfoId);
	}

	@Override
	public void deleteBatch(String[] dirverinfoIds){
		driverinfoDao.deleteBatch(dirverinfoIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Driverinfo driverinfo=get(id);
			driverinfo.setState(stateValue);
            update(driverinfo);
        }
    }
	
}
