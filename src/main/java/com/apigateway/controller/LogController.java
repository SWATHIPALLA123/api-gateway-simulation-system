package com.apigateway.controller;

import com.apigateway.entity.RequestLog;
import com.apigateway.service.LogService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/logs")
public class LogController {

    private final LogService logService;

    public LogController(LogService logService) {
        this.logService = logService;
    }

    @GetMapping
    public ResponseEntity<List<RequestLog>> getLogs() {

        return ResponseEntity.ok(logService.getAllLogs());
    }
}