package com.example.skander.Service;

import com.example.skander.Entities.User;
import com.example.skander.Repository.UserRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserServiceImpl implements  UserService {

    UserRepository userRepository;

    @Override
    public User AddUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> getAllUser() {
        return userRepository.findAll();
    }

    @Override
    public User getUserbyId(long id) {
        return userRepository.findById(id).get();
    }
}
