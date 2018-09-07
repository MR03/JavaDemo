package pw.mr03.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pw.mr03.domain.dto.GetAdmin;
import pw.mr03.entity.Admin;
import pw.mr03.mapper.AdminMapper;
import pw.mr03.utils.Common;

/**
 * Created by Administrator on 2017/12/29.
 */

@Service
public class AdminService {

    @Autowired
    private AdminMapper adminMapper;

    public boolean addNewAdmin(Admin admin) {
        Admin payload = new Admin(null, admin.getMobile(), admin.getRealName(), admin.getEmail(), Common.md5(admin.getPassword()));
        boolean result = adminMapper.insertAdmin(payload);
        return result;
    }

    public GetAdmin getAdmin() {
        GetAdmin admin = adminMapper.getAdmin();
        return admin;
    }
}
