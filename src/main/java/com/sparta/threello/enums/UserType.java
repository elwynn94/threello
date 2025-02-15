package com.sparta.threello.enums;

import lombok.Getter;

@Getter
public enum UserType {
    ADMIN("MANAGER"),
    USER("USER");

    private final String type;

    UserType(String type) {
        this.type = type;
    }
}