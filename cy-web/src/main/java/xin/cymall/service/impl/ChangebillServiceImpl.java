package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.ChangebillDao;
import xin.cymall.entity.Changebill;
import xin.cymall.service.ChangebillService;




@Service("changebillService")
@Transactional
public class ChangebillServiceImpl implements ChangebillService {
	@Autowired
	private ChangebillDao changebillDao;
	
	@Override
	public Changebill get(String changebillId){
		return changebillDao.get(changebillId);
	}

	@Override
	public List<Changebill> getList(Map<String, Object> map){
		return changebillDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return changebillDao.getCount(map);
	}

	@Override
	public void save(Changebill changebill){
		changebillDao.save(changebill);
	}

	@Override
	public void update(Changebill changebill){
		changebillDao.update(changebill);
	}

	@Override
	public void delete(String changebillId){
		changebillDao.delete(changebillId);
	}

	@Override
	public void deleteBatch(String[] changebillIds){
		changebillDao.deleteBatch(changebillIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Changebill changebill=get(id);
			changebill.setState(stateValue);
            update(changebill);
        }
    }
	
}
