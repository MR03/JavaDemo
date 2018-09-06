package pw.mr03.domain.request;

import javax.validation.constraints.NotBlank;

/**
 * Created by Administrator on 2018/9/6.
 */
public class ReqAdminAdd {
    @NotBlank(message = "电话不能为空")
    private String mobile;
    @NotBlank(message = "姓名不能为空")
    private String realName;
    @NotBlank(message = "邮箱不能为空")
    private String email;
    @NotBlank(message = "密码不能为空")
    private String password;

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
