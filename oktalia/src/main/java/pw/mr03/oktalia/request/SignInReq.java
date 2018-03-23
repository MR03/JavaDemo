package pw.mr03.oktalia.request;

/**
 * Created by Administrator on 2017/12/29.
 */
public class SignInReq {

    private String realname;

    private String pwd;

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
}
