package com.sparta.threello.entity;

import com.sparta.threello.enums.UserStatus;
import com.sparta.threello.enums.UserType;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

//    @Column(nullable = false)
//    private String name;

    @Column(nullable = false, unique = true)
    private String username;

    @Column(nullable = false)
    private String password;

    private String refreshToken;

//    @Setter
//    @Column
//    private String refreshToken;

    //회원 상태 (ACTIVATE-활동 / DEACTIVATE-탈퇴)
//    @Column(nullable = false)
//    @Setter
//    private UserStatus userStatus;

    private String role;

//    //회원 권한 (MANAGER-보드생성 가능 / USER-보드생성 불가능)
//    @Column(nullable = false)
//    @Setter
//    private UserType userType;
//
//    //BoardMember 과 조인
//    @OneToMany(mappedBy = "user",cascade = CascadeType.ALL, orphanRemoval = true)
//    private List<BoardMember> boardMemberList = new ArrayList<>();
}