package com.matrix.dataplay.service;

import com.matrix.dataplay.dto.AuthResponse;
import com.matrix.dataplay.dto.UserDto;
import com.matrix.dataplay.model.UserEntity;
import com.matrix.dataplay.repository.UserRepository;
import com.matrix.dataplay.security.JwtUtil;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtUtil jwtUtil;

    public AuthResponse register(UserDto userDto){
        UserEntity userEntity= new UserEntity();
        userEntity.setEmail(userDto.getEmail());
        userEntity.setUsername(userDto.getUsername());
        userEntity.setName(userDto.getName());
        userEntity.setPassword(passwordEncoder.encode(userDto.getPassword()));

        userRepository.save(userEntity);
        String token = jwtUtil.generateToken(userEntity.getEmail());

        return new AuthResponse(token);
    }

}
