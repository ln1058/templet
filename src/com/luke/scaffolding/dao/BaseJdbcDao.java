package com.luke.scaffolding.dao;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class BaseJdbcDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public List<Map<String, Object>> queryByMapList(String sql, Object[]obj){
    	return jdbcTemplate.queryForList(sql, obj);
    }
    
    public Map<String, Object> queryByMap(String sql, Object[]obj){
    	return jdbcTemplate.queryForMap(sql, obj);
    }
}
