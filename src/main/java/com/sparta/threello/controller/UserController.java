package com.sparta.threello.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/users")
public class UserController {
    /*****회원가입*****/

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
