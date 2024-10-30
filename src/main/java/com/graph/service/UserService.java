package com.graph.service;

import com.graph.entity.User;
import com.graph.repo.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserService implements IUserService {

    private final UserRepository userRepository;

    @Override
    public User createUser(User user) {
       return userRepository.save(user);
    }

    @Override
    public User getUserByUserName(String userUser) {
        return userRepository.getUserByUserName(userUser);
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    @Override
    public User updateUser(int id,  String userName) {
        User user = userRepository.findById(id).orElseThrow(() -> new RuntimeException("User not found" + id));
        user.setUserName(userName);
        return userRepository.save(user);
    }
}
