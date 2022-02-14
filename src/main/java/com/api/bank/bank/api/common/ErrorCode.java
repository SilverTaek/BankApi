package com.api.bank.bank.api.common;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum ErrorCode {

    BANKING_ERROR_100(400, "BANKING_ERROR_100", "잘못된 계좌 정보"),
    BANKING_ERROR_101(422, "BANKING_ERROR_101", "등록할 수 없는 계좌"),
    BANKING_ERROR_999(500, "BANKING_ERROR_999", "일시적으로 사용 불가");

    private int status;
    private String errorCode;
    private String message;

}
