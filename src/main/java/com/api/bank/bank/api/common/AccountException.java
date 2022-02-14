package com.api.bank.bank.api.common;

import lombok.Getter;

@Getter
public class AccountException extends RuntimeException{

    private ErrorCode errorCode;

    public AccountException(String message, ErrorCode errorCode) {
        super(message);
        this.errorCode = errorCode;
    }
}
