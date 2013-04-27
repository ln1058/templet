package com.luke.scaffolding.service;

import java.io.Serializable;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.luke.scaffolding.dao.UserDao;
import com.luke.scaffolding.dao.UserJdbcDao;
import com.luke.scaffolding.entity.User;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private UserDao userDao;
	@Autowired
	private UserJdbcDao userJdbcDao;
//	@Resource
//	public void setUserDao(UserDao userDao) {
//		this.userDao = userDao;
//	}
	@Override
	public User getUser(Integer id) {
		return userDao.getUser(id);
	}

	public Map<String, Object> getUserMap(Integer id){
		return userJdbcDao.getUser(id);
	}
	public Serializable addUser(User user){
		return userDao.getHibernateTemplate().save(user);
	}
}
