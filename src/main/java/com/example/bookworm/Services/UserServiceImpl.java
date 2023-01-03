package com.example.bookworm.Services;

import com.example.bookworm.Entities.Role;
import com.example.bookworm.Entities.UserEntity;
import com.example.bookworm.Repos.RoleRepo;
import com.example.bookworm.Repos.UserRepo;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service @RequiredArgsConstructor @Transactional @Slf4j
public class UserServiceImpl implements UserService{
    private final UserRepo userRepo;
    private final RoleRepo roleRepo;
    @Override
    public UserEntity saveUser(UserEntity userEntity) {
        log.info("Saving new user {} to the database",userEntity.getUserName());
        return userRepo.save(userEntity);
    }

    @Override
    public Role saveRole(Role role) {
        log.info("Saving new role {} to the database",role.getName());

        return roleRepo.save(role);
    }

    @Override
    public void addRoleToUser(String userName, String roleName) {
        log.info("adding role {} to user {}",roleName,userName);

        UserEntity user = userRepo.findByUserName(userName);
        Role role = roleRepo.findByName(roleName);
        user.getRoles().add(role);
    }

    @Override
    public UserEntity getUser(String userName) {
        log.info("Fetching user {}",userName);

        return userRepo.findByUserName(userName);
    }

    @Override
    public List<UserEntity> getUsers() {
        log.info("Fetching all users");

        return userRepo.findAll();
    }
}
