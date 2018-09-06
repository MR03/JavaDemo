package pw.mr03.api;

/**
 * Created by Administrator on 2018/3/23.
 */
public enum Code {
    // 成功
    SUCCESS("0000", "操作成功"),
    // 失败
    FAILURE("1000", "操作失败"),
    // 请求
    PARAMS_LACK("2000", "缺少参数"),
    // 响应
    // 其它
    ;


    private final String code;
    private final String msg;

    private Code(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }
    public String getMsg() {
        return msg;
    }


//    SUCCESS_ADD("0001", "SUCCESS_ADD", "添加成功"),
//    SUCCESS_EDIT("0002", "SUCCESS_EDIT", "编辑成功"),
//    SUCCESS_FIND("0003", "SUCCESS_FIND", "查询成功"),
//    SUCCESS_DELETE("0004", "SUCCESS_DELETE", "删除成功"),
//    SUCCESS_REGISTER("0005", "SUCCESS_REGISTER", "新用户注册成功"),
//    SUCCESS_LOGIN("0006", "SUCCESS_LOGIN", "登录成功"),
//    SUCCESS_DELETE_SECTION("0007", "SUCCESS_DELETE_SECTION", "部分删除成功"),
//

//    FAILURE_ADD("1001", "FAILURE_ADD", "添加失败"),
//    FAILURE_EDIT("1002", "FAILURE_EDIT", "编辑失败"),
//    FAILURE_FIND("1003", "FAILURE_FIND", "查询失败"),
//    FAILURE_DELETE("1004", "FAILURE_DELETE", "删除失败"),
//    FAILURE_REGISTER_EXISTED("1005", "FAILURE_REGISTER_EXISTED", "注册失败,用户已存在"),
//    FAILURE_LOGIN_NOTEXIST("1006", "FAILURE_LOGIN_NOTEXIST", "登录失败,该用户不存在"),
//    FAILURE_LOGIN_PWDERROR("1007", "FAILURE_LOGIN_PWDERROR", "登录失败,密码错误"),
//    FAILURE_USER_ADD_EXISTED("1008", "FAILURE_USER_ADD_EXISTED", "添加失败,该用户已经存在"),
//

//    DB_DATA_ERROR("2001", "DB_DATA_ERROR", "表数据异常"),
//    DB_OPERATE_FAILURE("2002", "DB_OPERATE_FAILURE", "数据库处理失败"),
//
//    LOGIN_NOT("3000", "LOGIN_NOT", "该用户没有登录"),
//    BUILD_NOW("3001", "BUILD_NOW", "接口正在开发")
//            ;
}
