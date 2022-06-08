package com.wxm.msfast.demo.common.rest.request;

import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

/**
 * @program: msfast
 * @description: 添加请求
 * @author: Mr.Wang
 * @create: 2022-06-08 16:31
 **/

@Data
public class UserAddRequest {

    @NotBlank
    private String name;

    @NotNull
    private Integer age;
}
