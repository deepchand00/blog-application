package com.example.blogapp.service;

import com.example.blogapp.payloads.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;

public interface UserService {

    UserDto registerUser(UserDto userDto);

    UserDto createUser(UserDto userDto);

    UserDto updateUser(UserDto user, Integer userId);

    UserDto getUserById(Integer userId);

    List<UserDto> getAllUsers();

    void deleteUser(Integer userId);

}
