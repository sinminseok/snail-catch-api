package com.snailcatch.server.global.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class SuccessResponse<T> {
    private boolean success;
    private T message;
    private T data;
}
