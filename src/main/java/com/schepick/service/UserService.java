package com.schepick.service;

import com.schepick.model.User;
import com.schepick.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User join(User user) {
        userRepository.save(user);
        return user;
    }

    public Optional<User> findOne() {
        Optional<User> user = userRepository.findUser();
        return user;
    }
}
