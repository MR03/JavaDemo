package pw.mr03.oktalia.api;

import com.sun.org.apache.xpath.internal.SourceTree;

/**
 * Created by Administrator on 2018/3/23.
 */
public class ApiFactory {
    public static final Api getApi(String msg) {
        Api api = new Api();
        api.setCode("0000");
        api.setMsg(msg);
        api.setData("");
        return api;
    }

    public static final Api getApi(String code, String msg) {
        Api api = new Api();
        api.setCode(code);
        api.setMsg(msg);
        api.setData("");
        return api;
    }
}
