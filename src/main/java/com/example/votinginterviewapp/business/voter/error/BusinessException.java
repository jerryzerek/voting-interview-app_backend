package com.example.votinginterviewapp.business.voter.error;

import lombok.Getter;

@Getter
public class BusinessException extends RuntimeException {

    private final String defaultMessageCode;

    public BusinessException(String defaultMessageCode) {
        this.defaultMessageCode = defaultMessageCode;
    }
}
