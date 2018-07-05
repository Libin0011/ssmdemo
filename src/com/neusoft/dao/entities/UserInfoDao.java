package com.neusoft.dao.entities;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.stereotype.Repository;

@Repository("userInfoDao")
public class UserInfoDao implements UserInfoMapper{

	private  SqlSessionTemplate  sqlSessionTemplete;

	public void setSqlSessionTemplete(SqlSessionTemplate sqlSessionTemplete) {
		this.sqlSessionTemplete = sqlSessionTemplete;
	}

	public void addUser(UserInfo user) {
		// TODO Auto-generated method stub
		String statement="com.neusoft.dao.UserInfoMapper.addUser";
		this.sqlSessionTemplete.insert(statement, user);
	}

	public void updateUser(UserInfo user) {
		// TODO Auto-generated method stub
		String statement="com.neusoft.dao.UserInfoMapper.updateUser";
		this.sqlSessionTemplete.update(statement, user);
	
	}

	public void deleteUser(int uid) {
		// TODO Auto-generated method stub
		String statement="com.neusoft.dao.UserInfoMapper.deleteUser";
		this.sqlSessionTemplete.delete(statement,uid);
	}

	public List<UserInfo> getUsers() {
		// TODO Auto-generated method stub
		String statement="com.neusoft.dao.UserInfoMapper.getUsers";
		
		return this.sqlSessionTemplete.selectList(statement);
	}

	public UserInfo getUserByUid(int uid) {
		// TODO Auto-generated method stub\
		
		String statement="com.neusoft.dao.UserInfoMapper.getUserByUid";
		return this.sqlSessionTemplete.selectOne(statement, uid);
	}
	
}
