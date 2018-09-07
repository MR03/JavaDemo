package pw.mr03.domain.dto;

/**
 * Created by Administrator on 2018/9/5.
 */
public class GetAdmin {
    private Integer id;
    private String mobile;
    private String realName;
    private String email;

    public GetAdmin(Integer id, String mobile, String realName, String email) {
        this.id = id;
        this.mobile = mobile;
        this.realName = realName;
        this.email = email;
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
}

