package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.InputmainDao;
import xin.cymall.entity.Inputmain;
import xin.cymall.service.InputmainService;




@Service("inputmainService")
@Transactional
public class InputmainServiceImpl implements InputmainService {
	@Autowired
	private InputmainDao inputmainDao;
	
	@Override
	public Inputmain get(String inputmainId){
		return inputmainDao.get(inputmainId);
	}

	@Override
	public List<Inputmain> getList(Map<String, Object> map){
		return inputmainDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return inputmainDao.getCount(map);
	}

	@Override
	public void save(Inputmain inputmain){
		inputmainDao.save(inputmain);
	}

	@Override
	public void update(Inputmain inputmain){
		inputmainDao.update(inputmain);
	}

	@Override
	public void delete(String inputmainId){
		inputmainDao.delete(inputmainId);
	}

	@Override
	public void deleteBatch(String[] inputmainIds){
		inputmainDao.deleteBatch(inputmainIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Inputmain inputmain=get(id);
			inputmain.setState(stateValue);
            update(inputmain);
        }
    }
	
}
