package com.sparta.threello.controller;

import com.sparta.threello.dto.JoinDto;
import com.sparta.threello.service.UserService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    /*****회원가입*****/
    @PostMapping
    public String joinPage(JoinDto joinDTO) {
        userService.joinProcess(joinDTO);
        return "ok";
    }

    /*****회원탈퇴*****/

    /*****로그인*****/
    @PostMapping("/login")
    public String loginPage() {
        return "login";
    }

    /*****로그아웃*****/
    @PostMapping("/logout")
    public String logoutPage() {
        return "logout";
    }
}
