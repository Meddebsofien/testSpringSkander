package com.example.skander.Service;

import com.example.skander.Entities.User;

import java.util.List;

public interface UserService {
    public User AddUser(User user);
    public List<User> getAllUser();
    public User getUserbyId(long id);
}
