package com.apigateway.service;

import com.apigateway.dto.ProductResponse;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ProductService {

    public List<ProductResponse> getProducts() {

        return Arrays.asList(
                new ProductResponse(
                        1L,
                        "Laptop",
                        55000.0
                ),

                new ProductResponse(
                        2L,
                        "Headphones",
                        2000.0
                )
        );
    }
}