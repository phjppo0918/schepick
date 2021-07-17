package com.schepick.repository.impliment;

import com.schepick.model.User;
import com.schepick.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Optional;

@Repository
public class UserSessionRepository implements UserRepository {
    @Autowired
    private HttpServletRequest request;
    //HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.getRequestAttributes()).getRequest();
    @Override
    public User save(User user) {
        HttpSession httpSession = request.getSession();
        httpSession.setAttribute("user", user);
        return user;
    }
}
