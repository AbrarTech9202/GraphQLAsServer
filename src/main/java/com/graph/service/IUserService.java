package com.graph.service;

import com.graph.entity.User;

import java.util.List;

public interface IUserService {

    public User createUser(User user);

    public User getUserByUserName(String userUser);

    public List<User> getAllUsers();

    public User updateUser(int id, String userName);
}
