package pw.mr03.oktalia.api;

/**
 * Created by Administrator on 2018/3/23.
 */
public class ApiFactory {

    private static final Api api = new Api();

    /**
     * 成功返回,没有data,msg相同
     */
    public static final Api ok() {
        api.setCode(Code.SUCCESS.getCode());
        api.setMsg(Code.SUCCESS.getMsg());
        api.setData("");
        return api;
    }

    /**
     * 成功返回,有data,msg相同
     */
    public static final Api ok(Object data) {
        api.setCode(Code.SUCCESS.getCode());
        api.setMsg(Code.SUCCESS.getMsg());
        api.setData(data);
        return api;
    }

    /**
     * 失败返回,没有data,msg相同
     */
    public static final Api fail() {
        api.setCode(Code.FAILURE.getCode());
        api.setMsg(Code.FAILURE.getMsg());
        api.setData("");
        return api;
    }

    /**
     * 失败返回,没有data,msg不同
     */
    public static final Api fail(String msg) {
        api.setCode(Code.FAILURE.getCode());
        api.setMsg(msg);
        api.setData("");
        return api;
    }

    /**
     * 设置
     */
    public static final Api set(Code code, Object data) {
        api.setCode(code.getCode());
        api.setMsg(code.getMsg());
        api.setData(data);
        return api;
    }
}
