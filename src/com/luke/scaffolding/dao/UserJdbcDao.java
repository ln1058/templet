package com.luke.scaffolding.dao;

import java.util.Map;

import org.springframework.stereotype.Repository;


@Repository
public class UserJdbcDao extends BaseJdbcDao {
	public Map<String, Object> getUser(Integer id){
		String sql = "select * from user where id=?";
		return this.queryByMap(sql, new Integer[]{id});
	}
}
