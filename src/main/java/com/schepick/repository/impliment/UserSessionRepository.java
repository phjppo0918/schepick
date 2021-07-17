package com.schepick.repository.impliment;

import com.schepick.model.User;
import com.schepick.repository.UserRepository;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpSession;
import java.util.Optional;

@Repository
public class UserSessionRepository implements UserRepository {

    @Override
    public Optional<User> saveDepart(String depart) {

        return Optional.empty();
    }

    @Override
    public Optional<User> saveGrade(byte Grade) {
        return Optional.empty();
    }

    @Override
    public Optional<User> saveMinorAndDoubleMajor(String minor, String doubleMajor) {
        return Optional.empty();
    }

    @Override
    public Optional<User> saveIsCosmos(boolean isCosmos) {
        return Optional.empty();
    }
}
