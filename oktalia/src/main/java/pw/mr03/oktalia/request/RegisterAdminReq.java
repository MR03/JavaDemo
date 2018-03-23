package pw.mr03.oktalia.request;

/**
 * Created by Administrator on 2017/12/29.
 */
public class RegisterAdminReq {

    private String realname;

    private String pwd;

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
