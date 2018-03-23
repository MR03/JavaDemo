package pw.mr03.oktalia.mapper;

import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.request.RegisterAdminReq;

/**
 * Created by Administrator on 2017/12/29.
 */
public interface AdminMapper {

    int addAdmin(RegisterAdminReq req);

    Admin getAdmin(String mobile);
}
