package xin.cymall.dao;

import xin.cymall.entity.User;

import java.util.List;

public interface UserDao extends BaseDao<User> {


    List<User>   getAllUser();



}
