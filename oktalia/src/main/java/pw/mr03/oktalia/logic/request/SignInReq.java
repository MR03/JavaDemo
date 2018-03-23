package pw.mr03.oktalia.logic.request;

/**
 * Created by Administrator on 2017/12/29.
 */
public class SignInReq {

    private String realname;

    private String password;


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
}
