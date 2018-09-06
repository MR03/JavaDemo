package pw.mr03.entity;

import java.util.Date;

/**
 * Created by Administrator on 2018/9/5.
 */
public class Admin {
    private Integer id;
    private String mobile;
    private String realName;
    private String email;
    private String password;
    private Date lastLoginTime;
    private String lastLoginIp;
    private Integer isDelete;

    public Admin(Integer id, String mobile) {
        this.id = id;
        this.mobile = mobile;
    }

    public Admin(Integer id, String mobile, String realName, String email, String password) {
        this.id = id;
        this.mobile = mobile;
        this.realName = realName;
        this.email = email;
        this.password = password;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

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

    public Date getLastLoginTime() {
        return lastLoginTime;
    }

    public void setLastLoginTime(Date lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    public String getLastLoginIp() {
        return lastLoginIp;
    }

    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    public Integer getIsDelete() {
        return isDelete;
    }

    public void setIsDelete(Integer isDelete) {
        this.isDelete = isDelete;
    }
}
