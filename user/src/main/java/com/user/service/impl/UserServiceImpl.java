package com.user.service.impl;


import java.util.List;

    import java.util.Optional;

    import org.springframework.beans.factory.annotation.Autowired;
    import org.springframework.stereotype.Service;

    import com.user.model.User;
    import com.user.repo.UserRepository;
    import com.user.service.UserService;
    
    @Service
    public class UserServiceImpl implements UserService {
    @Autowired
    UserRepository userrepo;

    @Override
    public List<User> getUserData() {
    return userrepo.findAll();
    }
    public String addUser(String userId,String userName,String cardType,String cardNo,
    		String contact,String password) {
    
    User user= new User();
    user.setUserId(userId);
    user.setUserName(userName);
    user.setCardType(cardType);
    user.setCardNo(cardNo);
   
    user.setContact(contact);
    user.setPassword(password);
	
    userrepo.save(user);
    return "Data Saved SuccessFully..";
    }

    @Override
    public String deleteUser(String userId) {
    Optional<User> user = userrepo.findById(userId);
    if(user.isPresent()) {
    userrepo.delete(user.get());
    }
    return "Data Deleted Successfully...";
    }

    }