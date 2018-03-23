package pw.mr03.oktalia;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pw.mr03.oktalia.request.RegisterAdminReq;
import pw.mr03.oktalia.logic.service.AdminService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class OktaliaApplicationTests {

	@Autowired
	private AdminService adminService;

	@Test
	public void contextLoads() {
		RegisterAdminReq req = new RegisterAdminReq();
		req.setMobile("34");
		req.setPwd("df");
		req.setRealname("sdf");
		adminService.addAdmin(req);
	}

}
