package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.ComsetmaindetailDao;
import xin.cymall.entity.Comsetmaindetail;
import xin.cymall.service.ComsetmaindetailService;




@Service("comsetmaindetailService")
@Transactional
public class ComsetmaindetailServiceImpl implements ComsetmaindetailService {
	@Autowired
	private ComsetmaindetailDao comsetmaindetailDao;
	
	@Override
	public Comsetmaindetail get(String comsetmaindetailId){
		return comsetmaindetailDao.get(comsetmaindetailId);
	}

	@Override
	public List<Comsetmaindetail> getList(Map<String, Object> map){
		return comsetmaindetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return comsetmaindetailDao.getCount(map);
	}

	@Override
	public void save(Comsetmaindetail comsetmaindetail){
		comsetmaindetailDao.save(comsetmaindetail);
	}

	@Override
	public void update(Comsetmaindetail comsetmaindetail){
		comsetmaindetailDao.update(comsetmaindetail);
	}

	@Override
	public void delete(String comsetmaindetailId){
		comsetmaindetailDao.delete(comsetmaindetailId);
	}

	@Override
	public void deleteBatch(String[] comsetmaindetailIds){
		comsetmaindetailDao.deleteBatch(comsetmaindetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Comsetmaindetail comsetmaindetail=get(id);
			comsetmaindetail.setState(stateValue);
            update(comsetmaindetail);
        }
    }
	
}
