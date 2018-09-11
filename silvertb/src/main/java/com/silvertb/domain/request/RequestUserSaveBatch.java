package com.silvertb.domain.request;

import javax.validation.constraints.NotBlank;

/**
 * Created by Administrator on 2018/9/6.
 */
public class RequestUserSaveBatch {
    @NotBlank(message = "电话不能为空")
    private String mobile;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
