package com.apigateway.interceptor;

import com.apigateway.exception.MissingApiKeyException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.HandlerInterceptor;

@Component
public class ApiKeyInterceptor implements HandlerInterceptor {

    private static final String API_KEY = "12345";

    @Override
    public boolean preHandle(HttpServletRequest request,
                             HttpServletResponse response,
                             Object handler) {

        String apiKey = request.getHeader("X-API-KEY");

        if (apiKey == null || !apiKey.equals(API_KEY)) {

            throw new MissingApiKeyException(
                    "Missing or Invalid API Key"
            );
        }

        return true;
    }
}