package com.study.git.utils;

/**
 * @author TangFD@HF 2018/11/27
 */
public class JsonResult<T> {
    private boolean success = true;
    private String message;
    private String status;
    private T data;

    public JsonResult(boolean success, String status, String message) {
        this.message = message;
        this.status = status;
        this.success = success;
    }

    public JsonResult(boolean success, String message) {
        this.message = message;
        this.success = success;
    }

    public JsonResult() {
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isSuccess() {
        return success;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }
}
