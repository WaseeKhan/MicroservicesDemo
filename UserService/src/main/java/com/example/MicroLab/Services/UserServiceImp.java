package com.example.MicroLab.Services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lucifer.MicroLab.entity.User;

@Service
public class UserServiceImp implements UserService{
	
	//Fake User List
	
	List<User> list = List.of(
			new User(1344L,"Waseem", "123456"),
			new User(1345L,"Rohit", "123456"),
			new User(1346L,"Ayaan", "123456")
			);

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return this.list.stream().filter(user->user.getUserId().equals(id)).findAny().orElse(null);
	}
	

}
