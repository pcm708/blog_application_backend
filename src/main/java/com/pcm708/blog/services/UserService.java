package com.pcm708.blog.services;

import java.util.List;

import com.pcm708.blog.payloads.UserDto;

public interface UserService {

	UserDto registerNewUser(UserDto user);

	UserDto createUser();

	UserDto updateUser(UserDto user, Integer userId);

	UserDto getUserById(Integer userId);

	List<UserDto> getAllUsers();

	void deleteUser(Integer userId);

}
