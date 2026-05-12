package com.apigateway.service;

import com.apigateway.dto.UserResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    public List<UserResponse> getUsers() {

        return Arrays.asList(
                new UserResponse(
                        1L,
                        "Swathi",
                        "swathi@gmail.com"
                ),

                new UserResponse(
                        2L,
                        "Rahul",
                        "rahul@gmail.com"
                )
        );
    }
}