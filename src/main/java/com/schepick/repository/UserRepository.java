package com.schepick.repository;

import com.schepick.model.User;

import java.util.Optional;

public interface UserRepository {
    Optional<User> saveDepart(String depart);
    Optional<User> saveGrade(byte Grade);
    Optional<User> saveMinorAndDoubleMajor(String minor, String doubleMajor);
    Optional<User> saveIsCosmos(boolean isCosmos);
}
