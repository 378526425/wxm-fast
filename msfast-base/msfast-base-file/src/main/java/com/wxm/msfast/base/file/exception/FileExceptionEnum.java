package com.wxm.msfast.base.file.exception;

import com.wxm.msfast.base.common.interfaces.BaseExceptionEnumInterface;

public enum FileExceptionEnum implements BaseExceptionEnumInterface {
    FileNameLengthLimitExceeded_Exception(12001, "文件名称超长限制异常类"),
    InvalidExtension_Exception(12002,"文件校验异常"),
    FileSizeLimitExceededException(12003,"超出最大大小")
    ;

    private Integer code;
    private String msg;


    FileExceptionEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    @Override
    public Integer getCode() {
        return null;
    }

    @Override
    public String getMessage() {
        return null;
    }
}
