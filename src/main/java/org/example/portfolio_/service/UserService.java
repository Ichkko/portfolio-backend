package org.example.portfolio_.service;

import org.example.portfolio_.model.User;

import java.util.List;
import java.util.Optional;

public interface UserService {
    // Create
    User addUser(User user);
    // read
    List<User> getUsers();
     Optional<User> getUser(int id);

    //update
    User updateUser(User user);

    //delete
    void deleteUserById(int id);


}
