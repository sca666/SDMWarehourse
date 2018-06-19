package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CompanysettlemainDao;
import xin.cymall.entity.Companysettlemain;
import xin.cymall.service.CompanysettlemainService;




@Service("companysettlemainService")
@Transactional
public class CompanysettlemainServiceImpl implements CompanysettlemainService {
	@Autowired
	private CompanysettlemainDao companysettlemainDao;
	
	@Override
	public Companysettlemain get(String comsetmainId){
		return companysettlemainDao.get(comsetmainId);
	}

	@Override
	public List<Companysettlemain> getList(Map<String, Object> map){
		return companysettlemainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return companysettlemainDao.getCount(map);
	}

	@Override
	public void save(Companysettlemain companysettlemain){
		companysettlemainDao.save(companysettlemain);
	}

	@Override
	public void update(Companysettlemain companysettlemain){
		companysettlemainDao.update(companysettlemain);
	}

	@Override
	public void delete(String comsetmainId){
		companysettlemainDao.delete(comsetmainId);
	}

	@Override
	public void deleteBatch(String[] comsetmainIds){
		companysettlemainDao.deleteBatch(comsetmainIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Companysettlemain companysettlemain=get(id);
			companysettlemain.setState(stateValue);
            update(companysettlemain);
        }
    }
	
}
