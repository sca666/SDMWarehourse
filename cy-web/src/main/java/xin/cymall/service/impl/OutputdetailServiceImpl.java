package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.OutputdetailDao;
import xin.cymall.entity.Outputdetail;
import xin.cymall.service.OutputdetailService;




@Service("outputdetailService")
@Transactional
public class OutputdetailServiceImpl implements OutputdetailService {
	@Autowired
	private OutputdetailDao outputdetailDao;
	
	@Override
	public Outputdetail get(String outputdetailId){
		return outputdetailDao.get(outputdetailId);
	}

	@Override
	public List<Outputdetail> getList(Map<String, Object> map){
		return outputdetailDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return outputdetailDao.getCount(map);
	}

	@Override
	public void save(Outputdetail outputdetail){
		outputdetailDao.save(outputdetail);
	}

	@Override
	public void update(Outputdetail outputdetail){
		outputdetailDao.update(outputdetail);
	}

	@Override
	public void delete(String outputdetailId){
		outputdetailDao.delete(outputdetailId);
	}

	@Override
	public void deleteBatch(String[] outputdetailIds){
		outputdetailDao.deleteBatch(outputdetailIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Outputdetail outputdetail=get(id);
			outputdetail.setState(stateValue);
            update(outputdetail);
        }
    }
	
}
