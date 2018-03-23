package pw.mr03.oktalia.mapper;

import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.request.RegisterAdminReq;

import java.util.List;

/**
 * Created by Administrator on 2017/12/29.
 */
public interface AdminMapper {

    List<Admin> getById(Integer id);

    Integer addAdmin(RegisterAdminReq req);


}
