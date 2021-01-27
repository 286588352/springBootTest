package com.example.springboottest2.response;


import com.example.springboottest2.utils.ServiceError;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class Result implements Serializable {

    private String code;

    private String msg;

    private Object data;

    private static String OK_CODE = "0";

    public static Result OK(Object data) {
        return Result.builder()
                .code(OK_CODE)
                .msg("Success")
                .data(data)
                .build();
    }

    public static Result OK() {
        return OK(null);
    }

    public static Result FAIL(ServiceError error) {
        return Result.builder()
                .code(error.getCode())
                .msg(error.getMessage())
                .build();
    }

    public static Result FAIL(ServiceError error, String msg) {
        return Result.builder()
                .code(error.getCode())
                .msg(error.getMessage() + ":" + msg)
                .build();
    }

    public static Result FAIL(String code, String msg) {
        return Result.builder()
                .code(code)
                .msg(msg)
                .build();
    }



}
