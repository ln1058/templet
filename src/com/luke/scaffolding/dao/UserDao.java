package com.luke.scaffolding.dao;

import org.springframework.stereotype.Repository;

import com.luke.scaffolding.entity.User;


@Repository
public class UserDao extends BaseHibernateDao{
	
	public User getUser(Integer id){
		return (User) this.getHibernateTemplate().get(User.class, id);
	}
	
}
