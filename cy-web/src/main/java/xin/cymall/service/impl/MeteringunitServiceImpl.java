package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.MeteringunitDao;
import xin.cymall.entity.Meteringunit;
import xin.cymall.service.MeteringunitService;




@Service("meteringunitService")
@Transactional
public class MeteringunitServiceImpl implements MeteringunitService {
	@Autowired
	private MeteringunitDao meteringunitDao;
	
	@Override
	public Meteringunit get(String unitId){
		return meteringunitDao.get(unitId);
	}

	@Override
	public List<Meteringunit> getList(Map<String, Object> map){
		return meteringunitDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return meteringunitDao.getCount(map);
	}

	@Override
	public void save(Meteringunit meteringunit){
		meteringunitDao.save(meteringunit);
	}

	@Override
	public void update(Meteringunit meteringunit){
		meteringunitDao.update(meteringunit);
	}

	@Override
	public void delete(String unitId){
		meteringunitDao.delete(unitId);
	}

	@Override
	public void deleteBatch(String[] unitIds){
		meteringunitDao.deleteBatch(unitIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Meteringunit meteringunit=get(id);
			meteringunit.setState(stateValue);
            update(meteringunit);
        }
    }

	@Override
	public List<Meteringunit> getMeteringUnit() {
		return meteringunitDao.getMeteringUnit();
	}

}
