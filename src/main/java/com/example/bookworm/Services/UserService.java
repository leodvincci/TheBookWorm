package com.example.bookworm.Services;

import com.example.bookworm.Entities.Role;
import com.example.bookworm.Entities.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity saveUser(UserEntity userEntity);
    Role saveRole(Role role);
    void addRoleToUser(String userName, String roleName);
    UserEntity getUser(String userName);
    List<UserEntity> getUsers();
}
