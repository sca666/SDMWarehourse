package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
import java.util.Map;

import xin.cymall.dao.CategoryDao;
import xin.cymall.entity.Category;
import xin.cymall.service.CategoryService;




@Service("categoryService")
@Transactional
public class CategoryServiceImpl implements CategoryService {
	@Autowired
	private CategoryDao categoryDao;
	
	@Override
	public Category get(String categoryId){
		return categoryDao.get(categoryId);
	}

	@Override
	public List<Category> getList(Map<String, Object> map){
		return categoryDao.getList(map);
	}

	@Override
	public int getCount(Map<String, Object> map){
		return categoryDao.getCount(map);
	}

	@Override
	public void save(Category category){
		categoryDao.save(category);
	}

	@Override
	public void update(Category category){
		categoryDao.update(category);
	}

	@Override
	public void delete(String categoryId){
		categoryDao.delete(categoryId);
	}

	@Override
	public void deleteBatch(String[] categoryIds){
		categoryDao.deleteBatch(categoryIds);
	}

    @Override
    public void updateState(String[] ids,String stateValue) {
        for (String id:ids){
			Category category=get(id);
			category.setState(stateValue);
            update(category);
        }
    }

	@Override
	public List<Category> categorySelectAll() {
		return categoryDao.categorySelectAll();
	}

	@Override
	public List<Category> getparentIdZeroList(Map<String, Object> map) {
		return categoryDao.getparentIdZeroList(map);
	}

	@Override
	public int getcodenum(Category category) {
		List<Category> categoryList = categoryDao.getcodeList(category);
		int num = categoryList.size();
		return  num;
	}


}
