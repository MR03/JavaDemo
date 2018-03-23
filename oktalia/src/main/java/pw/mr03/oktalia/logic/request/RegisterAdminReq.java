package pw.mr03.oktalia.logic.request;

/**
 * Created by Administrator on 2017/12/29.
 */
public class RegisterAdminReq {

    private String realname;

    private String password;

    private String mobile;

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
