package com.neusoft.dao.entities;

//实体类
public class UserInfo {
private  int uid;//用户编号
private String username;//用户名
private String password;//密码
private double  salary;


public UserInfo() {
	super();
	// TODO Auto-generated constructor stub
}





public UserInfo(int uid, String username, String password, double salary) {
	super();
	this.uid = uid;
	this.username = username;
	this.password = password;
	this.salary = salary;
}





public int getUid() {
	return uid;
}
public void setUid(int uid) {
	this.uid = uid;
}
public String getUsername() {
	return username;
}
public void setUsername(String username) {
	this.username = username;
}
public String getPassword() {
	return password;
}
public void setPassword(String password) {
	this.password = password;
}


public double getSalary() {
	return salary;
}





public void setSalary(double salary) {
	this.salary = salary;
}





@Override
public String toString() {
	return "UserInfo [uid=" + uid + ", username=" + username + ", password="
			+ password + ", salary=" + salary + "]";
}








}
