package pw.mr03.oktalia.entity;

/**
 * Created by Administrator on 2017/12/29.
 */
public class Admin {
    private int id;

    private String realname;

    private String password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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
