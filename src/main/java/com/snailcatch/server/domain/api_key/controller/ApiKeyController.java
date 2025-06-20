package com.snailcatch.server.domain.api_key.controller;

import com.snailcatch.server.domain.api_key.service.ApiKeyService;
import com.snailcatch.server.global.dto.SuccessResponse;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/api-keys")
@RequiredArgsConstructor
public class ApiKeyController {

    private final ApiKeyService apiKeyService;

    @PostMapping
    public ResponseEntity<?> generateKey() {
        String key = apiKeyService.generateApiKey();
        SuccessResponse response = new SuccessResponse(true, "Rest API 발급", key);
        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
