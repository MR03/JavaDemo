package pw.mr03.oktalia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pw.mr03.oktalia.entity.Admin;
import pw.mr03.oktalia.logic.service.AdminService;
import pw.mr03.oktalia.request.RegisterAdminReq;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminServiceTests {

	@Autowired
	private AdminService adminService;

	@Test
	public void addAdmin() {
		RegisterAdminReq req = new RegisterAdminReq();
		req.setMobile("15008260209");
		req.setPwd("123");
		req.setRealname("test");
		Integer admin = adminService.addAdmin(req);
		System.out.println(admin);
	}

	@Test
	public void loginAdmin() {

		Admin admin = adminService.getAdmin("15008260209");
		System.out.println(admin.getRealname());
	}
}
