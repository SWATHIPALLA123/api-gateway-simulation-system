package com.apigateway.controller;

import com.apigateway.dto.OrderResponse;
import com.apigateway.dto.ProductResponse;
import com.apigateway.dto.UserResponse;
import com.apigateway.service.LogService;
import com.apigateway.service.OrderService;
import com.apigateway.service.ProductService;
import com.apigateway.service.UserService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class GatewayController {

    private final UserService userService;
    private final OrderService orderService;
    private final ProductService productService;
    private final LogService logService;

    public GatewayController(UserService userService,
                             OrderService orderService,
                             ProductService productService,
                             LogService logService) {

        this.userService = userService;
        this.orderService = orderService;
        this.productService = productService;
        this.logService = logService;
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponse>> getUsers() {

        logService.saveLog("/api/users", "GET", 200);

        return ResponseEntity.ok(userService.getUsers());
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getOrders() {

        logService.saveLog("/api/orders", "GET", 200);

        return ResponseEntity.ok(orderService.getOrders());
    }

    @GetMapping("/products")
    public ResponseEntity<List<ProductResponse>> getProducts() {

        logService.saveLog("/api/products", "GET", 200);

        return ResponseEntity.ok(productService.getProducts());
    }
}