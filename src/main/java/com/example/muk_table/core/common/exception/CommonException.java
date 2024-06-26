package com.example.muk_table.core.common.exception;

import com.example.muk_table.core.common.response.CommonResponse;
import java.io.IOException;
import lombok.Getter;

@Getter
public class CommonException extends IOException {

    private final CommonResponse responseCode;

    public CommonException(CommonResponse responseCode) {
        super(responseCode.getMessage());
        this.responseCode = responseCode;
    }
}
