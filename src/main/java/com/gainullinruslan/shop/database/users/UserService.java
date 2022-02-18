package com.gainullinruslan.shop.database.users;

import com.gainullinruslan.shop.dto.user.User;
import com.gainullinruslan.shop.dto.user.Users;
import com.gainullinruslan.shop.exception.UserExistException;

public interface UserService {
    void addUser(User user) throws UserExistException;
    void deleteUser(String number) throws UserExistException;
    Users getUsers();
}
