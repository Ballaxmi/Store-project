package com.user.view;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.user.model.User;
import com.user.service.UserService;

@RestController
public class UserController {
	@Autowired
	UserService userService;

	@RequestMapping({"/user"})
	public List<User> getUser() {
		return userService.getUserData();
	}
	@PostMapping({"/usermodule1"})
	public String addUser(@RequestParam String userId, @RequestParam String userName,
			@RequestParam String cardType, @RequestParam String cardNo, @RequestParam String contact, @RequestParam String password) {
		return userService.addUser(userId, userName, cardType, cardNo,
				contact,password);
	}

	@GetMapping("/user1/{userId}")
	public String deleteUser(@PathVariable("userId") String userId) {
		return userService.deleteUser(userId);
	}

	
}