package xin.cymall.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import xin.cymall.dao.UserDao;
import xin.cymall.entity.User;
import xin.cymall.service.UserService;

import java.util.List;

@Service("UserService")
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;


    @Override
    public List<User> getAllUser() {
        return userDao.getAllUser();
    }
}
