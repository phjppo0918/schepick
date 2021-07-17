package com.schepick.repository;

import com.schepick.model.User;
import java.util.Optional;


public interface UserRepository {
    public User save(User user);
    public Optional<User> findUser();
}
