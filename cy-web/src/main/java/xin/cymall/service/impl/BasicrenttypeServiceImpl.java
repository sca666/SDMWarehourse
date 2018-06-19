package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.BasicrenttypeDao;
import xin.cymall.entity.Basicrenttype;
import xin.cymall.service.BasicrenttypeService;




@Service("basicrenttypeService")
@Transactional
public class BasicrenttypeServiceImpl implements BasicrenttypeService {
	@Autowired
	private BasicrenttypeDao basicrenttypeDao;
	
	@Override
	public Basicrenttype get(String basicrentId){
		return basicrenttypeDao.get(basicrentId);
	}

	@Override
	public List<Basicrenttype> getList(Map<String, Object> map){
		return basicrenttypeDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return basicrenttypeDao.getCount(map);
	}

	@Override
	public void save(Basicrenttype basicrenttype){
		basicrenttypeDao.save(basicrenttype);
	}

	@Override
	public void update(Basicrenttype basicrenttype){
		basicrenttypeDao.update(basicrenttype);
	}

	@Override
	public void delete(String basicrentId){
		basicrenttypeDao.delete(basicrentId);
	}

	@Override
	public void deleteBatch(String[] basicrentIds){
		basicrenttypeDao.deleteBatch(basicrentIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Basicrenttype basicrenttype=get(id);
			basicrenttype.setState(stateValue);
            update(basicrenttype);
        }
    }
	
}
