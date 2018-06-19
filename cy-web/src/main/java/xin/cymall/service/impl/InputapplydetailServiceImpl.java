package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.InputapplydetailDao;
import xin.cymall.entity.Inputapplydetail;
import xin.cymall.service.InputapplydetailService;




@Service("inputapplydetailService")
@Transactional
public class InputapplydetailServiceImpl implements InputapplydetailService {
	@Autowired
	private InputapplydetailDao inputapplydetailDao;
	
	@Override
	public Inputapplydetail get(String inputapplydetailId){
		return inputapplydetailDao.get(inputapplydetailId);
	}

	@Override
	public List<Inputapplydetail> getList(Map<String, Object> map){
		return inputapplydetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return inputapplydetailDao.getCount(map);
	}

	@Override
	public void save(Inputapplydetail inputapplydetail){
		inputapplydetailDao.save(inputapplydetail);
	}

	@Override
	public void update(Inputapplydetail inputapplydetail){
		inputapplydetailDao.update(inputapplydetail);
	}

	@Override
	public void delete(String inputapplydetailId){
		inputapplydetailDao.delete(inputapplydetailId);
	}

	@Override
	public void deleteBatch(String[] inputapplydetailIds){
		inputapplydetailDao.deleteBatch(inputapplydetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Inputapplydetail inputapplydetail=get(id);
			inputapplydetail.setState(stateValue);
            update(inputapplydetail);
        }
    }
	
}
