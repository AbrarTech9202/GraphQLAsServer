package com.graph.repo;

import com.graph.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

    public User getUserByUserName(String userUser);
}
