package com.neusoft.service;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.neusoft.dao.entities.UserInfo;
import com.neusoft.dao.entities.UserInfoMapper;

@Service("userInfoService")
public class UserInfoServiceImpl implements UserInfoService {

	//@Autowired
	@Resource(name="userInfoDao")
	private   UserInfoMapper   userInfoDao; 
	
	public void setUserInfoDao(UserInfoMapper userInfoDao) {
		this.userInfoDao = userInfoDao;
	}

	public void addUser(UserInfo user) {
		// TODO Auto-generated method stub
this.userInfoDao.addUser(user);
	}

	public void updateUser(UserInfo user) {
		// TODO Auto-generated method stub
this.userInfoDao.updateUser(user);
	}

	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
this.userInfoDao.deleteUser(uid);
	}

	public List<UserInfo> getUsers() {
		// TODO Auto-generated method stub
		
		return this.userInfoDao.getUsers();
	}

	public UserInfo getUserByUid(int uid) {
		// TODO Auto-generated method stub
		return this.userInfoDao.getUserByUid(uid);
	}

}
