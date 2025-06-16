package com.matrix.dataplay.dto;

import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
public class AuthResponse {
    private String token;

    public AuthResponse(String token) {
    }
}
