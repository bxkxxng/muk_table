//package com.example.muk_able.core.common.response;
//
//import lombok.Data;
//
//@Data
//public class CommonResponse<T> {
//
//    private T data;
//    private String message;
//    private String code;
//
//    public CommonResponse(T data, ResponseCode code) {
//        this.data = data;
//        this.message = code.getMessage();
//        this.code = code.getCode();
//    }
//
//    public CommonResponse(ResponseCode code) {
//        this.data = null;
//        this.message = code.getMessage();
//        this.code = code.getCode();
//    }
//
//    public static CommonResponse of(final ResponseCode code) { return new CommonResponse((code));}
//}