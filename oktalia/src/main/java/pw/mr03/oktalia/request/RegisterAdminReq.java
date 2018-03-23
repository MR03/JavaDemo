package pw.mr03.oktalia.request;

import javax.validation.constraints.NotBlank;

/**
 * Created by Administrator on 2017/12/29.
 */
public class RegisterAdminReq {

    @NotBlank(message = "姓名不能为空")
    private String realname;
    @NotBlank(message = "密码不能为空")
    private String pwd;
    @NotBlank(message = "电话不能为空")
    private String mobile;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
