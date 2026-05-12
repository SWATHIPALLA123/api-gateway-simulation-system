package com.apigateway.service;

import com.apigateway.dto.OrderResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class OrderService {

    public List<OrderResponse> getOrders() {

        return Arrays.asList(
                new OrderResponse(
                        101L,
                        "Laptop",
                        55000.0
                ),

                new OrderResponse(
                        102L,
                        "Mobile",
                        25000.0
                )
        );
    }
}