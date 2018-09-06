package pw.mr03.Other;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pw.mr03.api.ApiGenerator;
import pw.mr03.api.Code;
import pw.mr03.entity.Admin;
import pw.mr03.service.AdminService;

@SpringBootTest
public class ApiTests {

	@Test
    public void test() {
        System.out.println(ApiGenerator.ok().getData());
    }
}
