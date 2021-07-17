package com.schepick.repository;

import com.schepick.model.User;

import javax.servlet.http.HttpServletRequest;
import java.util.Optional;

public interface UserRepository {
    User save(User user);
}
