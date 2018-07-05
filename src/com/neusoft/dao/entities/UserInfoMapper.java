package com.neusoft.dao.entities;

import java.util.List;

public interface UserInfoMapper {
void addUser(UserInfo  user);
void updateUser(UserInfo  user);
void deleteUser(int uid);
List<UserInfo>  getUsers();
UserInfo  getUserByUid(int uid);
}
