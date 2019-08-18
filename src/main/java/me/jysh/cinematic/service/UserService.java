package me.jysh.cinematic.service;

import me.jysh.cinematic.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User getUserById(Long user_id);

    User pushUser(User newUser);

    User updateUser(User updatedUser, Long user_id);

    void deleteUserById(Long user_id);
}
