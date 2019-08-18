package me.jysh.cinematic.service.impl;

import me.jysh.cinematic.model.User;
import me.jysh.cinematic.repository.UserRepository;
import me.jysh.cinematic.service.UserService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Primary
public class UserServiceImpl implements UserService {
    private UserRepository userRepository;

    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
