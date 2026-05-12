package com.apigateway.service;

import com.apigateway.entity.RequestLog;
import com.apigateway.repository.RequestLogRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class LogService {

    private final RequestLogRepository requestLogRepository;

    public LogService(RequestLogRepository requestLogRepository) {
        this.requestLogRepository = requestLogRepository;
    }

    public void saveLog(String requestPath,
                        String method,
                        int status) {

        RequestLog requestLog = new RequestLog();

        requestLog.setRequestPath(requestPath);
        requestLog.setMethod(method);
        requestLog.setTimestamp(LocalDateTime.now());
        requestLog.setStatus(status);

        requestLogRepository.save(requestLog);
    }

    public List<RequestLog> getAllLogs() {

        return requestLogRepository.findAll();
    }
}