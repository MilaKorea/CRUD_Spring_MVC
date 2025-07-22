package com.web.dao;

import com.web.model.User;
import java.util.List;

public interface UserDAO {
    void saveUser(User user);
    void updateUser(User user);
    void deleteUserById(Long id);
    User getUserById(Long id);
    List<User> getAllUsers();
}
