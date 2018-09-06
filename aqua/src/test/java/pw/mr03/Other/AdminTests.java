package pw.mr03.Other;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pw.mr03.entity.Admin;
import pw.mr03.service.AdminService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTests {

    @Autowired
    private AdminService adminService;

	@Test
    public void test() {
        Admin admin = new Admin(null, "2123", "23", "23", "23");
        adminService.addNewAdmin(admin);
    }
}
