package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.InputpopwDao;
import xin.cymall.entity.Inputpopw;
import xin.cymall.service.InputpopwService;




@Service("inputpopwService")
@Transactional
public class InputpopwServiceImpl implements InputpopwService {
	@Autowired
	private InputpopwDao inputpopwDao;
	
	@Override
	public Inputpopw get(String inputpopwId){
		return inputpopwDao.get(inputpopwId);
	}

	@Override
	public List<Inputpopw> getList(Map<String, Object> map){
		return inputpopwDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return inputpopwDao.getCount(map);
	}

	@Override
	public void save(Inputpopw inputpopw){
		inputpopwDao.save(inputpopw);
	}

	@Override
	public void update(Inputpopw inputpopw){
		inputpopwDao.update(inputpopw);
	}

	@Override
	public void delete(String inputpopwId){
		inputpopwDao.delete(inputpopwId);
	}

	@Override
	public void deleteBatch(String[] inputpopwIds){
		inputpopwDao.deleteBatch(inputpopwIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Inputpopw inputpopw=get(id);
			inputpopw.setState(stateValue);
            update(inputpopw);
        }
    }
	
}
