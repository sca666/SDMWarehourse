package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.RaiserenttypeDao;
import xin.cymall.entity.Raiserenttype;
import xin.cymall.service.RaiserenttypeService;




@Service("raiserenttypeService")
@Transactional
public class RaiserenttypeServiceImpl implements RaiserenttypeService {
	@Autowired
	private RaiserenttypeDao raiserenttypeDao;
	
	@Override
	public Raiserenttype get(String raiserentId){
		return raiserenttypeDao.get(raiserentId);
	}

	@Override
	public List<Raiserenttype> getList(Map<String, Object> map){
		return raiserenttypeDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return raiserenttypeDao.getCount(map);
	}

	@Override
	public void save(Raiserenttype raiserenttype){
		raiserenttypeDao.save(raiserenttype);
	}

	@Override
	public void update(Raiserenttype raiserenttype){
		raiserenttypeDao.update(raiserenttype);
	}

	@Override
	public void delete(String raiserentId){
		raiserenttypeDao.delete(raiserentId);
	}

	@Override
	public void deleteBatch(String[] raiserentIds){
		raiserenttypeDao.deleteBatch(raiserentIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Raiserenttype raiserenttype=get(id);
			raiserenttype.setState(stateValue);
            update(raiserenttype);
        }
    }
	
}
