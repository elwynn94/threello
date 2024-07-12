package com.sparta.threello.dto;

import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class JoinDto {
    @NotBlank(message = "email은 필수 입력값입니다")
    private String username;
    @NotBlank(message = "password는 필수 입력값입니다")
    private String password;
}
