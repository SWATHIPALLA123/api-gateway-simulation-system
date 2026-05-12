package com.apigateway.util;

public class Constants {

    private Constants() {

    }

    public static final String API_KEY = "12345";

    public static final String API_KEY_HEADER = "X-API-KEY";

    public static final String INVALID_API_KEY_MESSAGE =
            "Missing or Invalid API Key";

    public static final String USERS_API = "/api/users";

    public static final String ORDERS_API = "/api/orders";

    public static final String PRODUCTS_API = "/api/products";
}