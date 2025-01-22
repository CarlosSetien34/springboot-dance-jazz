package com.example.jazzapp.application;

import com.example.jazzapp.domain.entity.User;

public interface UserAccessServiceAdapter {

    Boolean shouldUserAccess(String username, String password);

    User createUser(User user);

    User updateUser(User user);
}
