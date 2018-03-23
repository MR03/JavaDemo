package pw.mr03.oktalia.request;

import javax.validation.constraints.NotBlank;

/**
 * Created by Administrator on 2017/12/29.
 */
public class SignInReq {
    @NotBlank(message = "号码不能为空")
    private String mobile;
    @NotBlank(message = "密码不能为空")
    private String pwd;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
