package com.sparta.threello.service;

import com.sparta.threello.dto.JoinDto;
import com.sparta.threello.entity.User;
import com.sparta.threello.repository.UserRepository;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public UserService(UserRepository userRepository, BCryptPasswordEncoder bCryptPasswordEncoder) {
        this.userRepository = userRepository;
        this.bCryptPasswordEncoder = bCryptPasswordEncoder;
    }

    // 회원가입
    public void joinProcess(JoinDto joinDTO) {
        String username = joinDTO.getUsername();
        String password = joinDTO.getPassword();

        Boolean isExist = userRepository.existsByUsername(username);

        if (isExist) {
            return;
        }

        User user = new User();

        user.setUsername(username);
        user.setPassword(bCryptPasswordEncoder.encode(password));
        user.setRole("ROLE_ADMIN");

        userRepository.save(user);

    }
}