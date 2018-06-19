package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.InputdetailDao;
import xin.cymall.entity.Inputdetail;
import xin.cymall.service.InputdetailService;




@Service("inputdetailService")
@Transactional
public class InputdetailServiceImpl implements InputdetailService {
	@Autowired
	private InputdetailDao inputdetailDao;
	
	@Override
	public Inputdetail get(String inputdetailId){
		return inputdetailDao.get(inputdetailId);
	}

	@Override
	public List<Inputdetail> getList(Map<String, Object> map){
		return inputdetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return inputdetailDao.getCount(map);
	}

	@Override
	public void save(Inputdetail inputdetail){
		inputdetailDao.save(inputdetail);
	}

	@Override
	public void update(Inputdetail inputdetail){
		inputdetailDao.update(inputdetail);
	}

	@Override
	public void delete(String inputdetailId){
		inputdetailDao.delete(inputdetailId);
	}

	@Override
	public void deleteBatch(String[] inputdetailIds){
		inputdetailDao.deleteBatch(inputdetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Inputdetail inputdetail=get(id);
			inputdetail.setState(stateValue);
            update(inputdetail);
        }
    }
	
}
