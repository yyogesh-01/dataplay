package com.matrix.dataplay.dto;

import jakarta.persistence.Entity;
import lombok.Data;

import java.math.BigInteger;

@Data
public class UserDto {
    private String username;
    private String email;
    private String password;
    private String name;
    private BigInteger phoneNumber;
}
