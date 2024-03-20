package com.example.muk_able.domain.common.enums;

import com.example.muk_able.domain.common.converter.CodeValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
//@AllArgsConstructor
public enum StatusType implements CodeValue {

    WAIT("00","WAIT"),
    CALL("01","CALL"),
    CONFIRM("02","CONFIRM"),
    CANCEL("03","CANCEL");

    private final String code;
    private final String value;

    StatusType(String code, String value) {
        this.code = code;
        this.value = value;
    }

   public String getCode() {
      return code;
   }

   public String getValue() {
      return value;
   }
}
