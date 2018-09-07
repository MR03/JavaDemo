package pw.mr03.logic;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.StringUtils;
import pw.mr03.api.Api;
import pw.mr03.api.ApiGenerator;
import pw.mr03.controller.AdminController;
import pw.mr03.domain.dto.GetAdmin;
import pw.mr03.service.AdminService;

@Component
public class AdminLogic {

    @Autowired
    private AdminService adminService;

    /**
     *
     * @return
     */
    public Api get() {
        GetAdmin admin = adminService.getAdmin();
        if (StringUtils.isEmpty(admin)) {
            return  ApiGenerator.fail("没有结果");
        }
        return ApiGenerator.ok(adminService.getAdmin());
    }
}
