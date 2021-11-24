package com.user.service;

import java.util.List;
import com.user.model.User;

public interface UserService {
	
	public List<User> getUserData();
	public String addUser(String userId, String userName, String cardType, String cardNo, String contact, String password);
	public String deleteUser(String userId);
	//public List<UserModule> getUserModuleData();
	
	}