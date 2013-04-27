package com.luke.scaffolding.service;

import java.io.Serializable;
import java.util.Map;

import com.luke.scaffolding.entity.User;

public interface UserService {

	public User getUser(Integer id);
	public Serializable addUser(User user);
	public Map<String, Object> getUserMap(Integer id);
}
