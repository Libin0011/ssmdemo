package com.neusoft.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.neusoft.dao.entities.UserInfo;
import com.neusoft.service.UserInfoService;

@RequestMapping("/user")
@Controller
public class UserHandler {

	@Autowired
	private UserInfoService  userInfoService;
	
	public void setUserInfoService(UserInfoService userInfoService) {
		this.userInfoService = userInfoService;
	}

	@RequestMapping(value="/addUser",method=RequestMethod.POST)
	public  String  addUser(UserInfo user)
	{
		this.userInfoService.addUser(user);
		return "success";
	}
	@RequestMapping("/getUsers")
	public  String getUsers(Model  model)
	{
		System.out.println("aaaa");
		List<UserInfo>  users=this.userInfoService.getUsers();
		model.addAttribute("users", users);
		return "main";
	}
	@RequestMapping("/deleteUser")
	public  String deleteUser(Integer  uid)
	{
		this.userInfoService.deleteUser(uid);
		return "redirect:/user/getUsers";
	}
	
	@RequestMapping("/getUserByUid")
	public  String getUserByUid(Integer  uid,Model  model)
	{
		UserInfo  user=this.userInfoService.getUserByUid(uid);
		model.addAttribute("user", user);
		return "update";
	}
	@RequestMapping(value="/updateUser",method=RequestMethod.POST)
	public  String updateUser(UserInfo  user)
	{
		this.userInfoService.updateUser(user);
		return "redirect:/user/getUsers";
		
	}
	
}
