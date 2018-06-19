package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.InputapplymainDao;
import xin.cymall.entity.Inputapplymain;
import xin.cymall.service.InputapplymainService;




@Service("inputapplymainService")
@Transactional
public class InputapplymainServiceImpl implements InputapplymainService {
	@Autowired
	private InputapplymainDao inputapplymainDao;
	
	@Override
	public Inputapplymain get(String inputapplymainId){
		return inputapplymainDao.get(inputapplymainId);
	}

	@Override
	public List<Inputapplymain> getList(Map<String, Object> map){
		return inputapplymainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return inputapplymainDao.getCount(map);
	}

	@Override
	public void save(Inputapplymain inputapplymain){
		inputapplymainDao.save(inputapplymain);
	}

	@Override
	public void update(Inputapplymain inputapplymain){
		inputapplymainDao.update(inputapplymain);
	}

	@Override
	public void delete(String inputapplymainId){
		inputapplymainDao.delete(inputapplymainId);
	}

	@Override
	public void deleteBatch(String[] inputapplymainIds){
		inputapplymainDao.deleteBatch(inputapplymainIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Inputapplymain inputapplymain=get(id);
			inputapplymain.setState(stateValue);
            update(inputapplymain);
        }
    }
	
}
