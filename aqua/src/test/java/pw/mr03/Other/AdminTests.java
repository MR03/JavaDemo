package pw.mr03.Other;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import pw.mr03.logic.AdminLogic;
import pw.mr03.service.AdminService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminTests {

    @Autowired
    private AdminService adminService;

    @Autowired
    private AdminLogic adminLogic;

	@Test
    public void test() {
        Assert.assertEquals(adminLogic.get().getCode(), "1000");
    }
}
