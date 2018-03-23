package pw.mr03.oktalia.entity;

import com.fasterxml.jackson.annotation.JsonView;

/**
 * Created by Administrator on 2017/12/29.
 */
public class Admin {
    public interface SimpleView {};

    private int id;

    private String realname;

    private String pwd;

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

    @JsonView(SimpleView.class)
    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }
}
