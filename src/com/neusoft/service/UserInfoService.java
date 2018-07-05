package com.neusoft.service;

import java.util.List;

import com.neusoft.dao.entities.UserInfo;

public interface UserInfoService {
	void addUser(UserInfo  user);
	void updateUser(UserInfo  user);
	void deleteUser(int uid);
	List<UserInfo>  getUsers();
	UserInfo  getUserByUid(int uid);
}
