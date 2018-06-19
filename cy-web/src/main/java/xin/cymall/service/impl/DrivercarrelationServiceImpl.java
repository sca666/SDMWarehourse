package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.DrivercarrelationDao;
import xin.cymall.entity.Drivercarrelation;
import xin.cymall.service.DrivercarrelationService;




@Service("drivercarrelationService")
@Transactional
public class DrivercarrelationServiceImpl implements DrivercarrelationService {
	@Autowired
	private DrivercarrelationDao drivercarrelationDao;
	
	@Override
	public Drivercarrelation get(String id){
		return drivercarrelationDao.get(id);
	}

	@Override
	public List<Drivercarrelation> getList(Map<String, Object> map){
		return drivercarrelationDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return drivercarrelationDao.getCount(map);
	}

	@Override
	public void save(Drivercarrelation drivercarrelation){
		drivercarrelationDao.save(drivercarrelation);
	}

	@Override
	public void update(Drivercarrelation drivercarrelation){
		drivercarrelationDao.update(drivercarrelation);
	}

	@Override
	public void delete(String id){
		drivercarrelationDao.delete(id);
	}

	@Override
	public void deleteBatch(String[] ids){
		drivercarrelationDao.deleteBatch(ids);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Drivercarrelation drivercarrelation=get(id);
			drivercarrelation.setState(stateValue);
            update(drivercarrelation);
        }
    }
	
}
