package com.message.encryption.encodeDecodeAlgorithm.exception;


public class ExceptionResponse {

    private int status;
    private int code;
    private String message;

    public ExceptionResponse(int status, int code, String message) {
        this.status = status;
        this.code = code;
        this.message = message;
    }

    public int getStatus() {
        return status;
    }

    public int getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

    @Override
    public String toString() {
        return "ExceptionResponse {" +
                "status=" + status +
                ", code=" + code +
                ", message=" + message +
                '}';
    }

}
