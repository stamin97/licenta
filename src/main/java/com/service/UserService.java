package com.service;

import com.licenta.model.User;

public interface UserService {

    public User findUserByEmail(String email);
    public void saveUser(User user);


}
