package com.graph.resource;

import com.graph.entity.User;
import com.graph.service.IUserService;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
@RequiredArgsConstructor
public class UserController {

    private final IUserService userService;

    @MutationMapping
    public User createUser(User user) {
        return userService.createUser(user);
    }
    @QueryMapping
    public User getUserByUserName(String userUser) {
        return userService.getUserByUserName(userUser);
    }
    @QueryMapping
    public List<User> getAllUsers()
    {
        return userService.getAllUsers();
    }
    @MutationMapping
    public User updateUser(int id,  String userName)
    {
        return userService.updateUser(id, userName);
    }
}
