package com.example.bookworm.Controllers;

import com.example.bookworm.Entities.UserEntity;
import com.example.bookworm.Services.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@RequiredArgsConstructor
@AllArgsConstructor
public class UserController {
    @Autowired
    UserService userService;
    @GetMapping("/users")
    public ResponseEntity< List<UserEntity> > getTheUsers(){
        return ResponseEntity.ok().body(userService.getUsers());
    }
}
