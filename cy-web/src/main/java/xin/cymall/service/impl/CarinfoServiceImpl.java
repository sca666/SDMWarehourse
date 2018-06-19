package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CarinfoDao;
import xin.cymall.entity.Carinfo;
import xin.cymall.service.CarinfoService;




@Service("carinfoService")
@Transactional
public class CarinfoServiceImpl implements CarinfoService {
	@Autowired
	private CarinfoDao carinfoDao;
	
	@Override
	public Carinfo get(String carId){
		return carinfoDao.get(carId);
	}

	@Override
	public List<Carinfo> getList(Map<String, Object> map){
		return carinfoDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return carinfoDao.getCount(map);
	}

	@Override
	public void save(Carinfo carinfo){
		carinfoDao.save(carinfo);
	}

	@Override
	public void update(Carinfo carinfo){
		carinfoDao.update(carinfo);
	}

	@Override
	public void delete(String carId){
		carinfoDao.delete(carId);
	}

	@Override
	public void deleteBatch(String[] carIds){
		carinfoDao.deleteBatch(carIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Carinfo carinfo=get(id);
			carinfo.setState(stateValue);
            update(carinfo);
        }
    }
	
}
