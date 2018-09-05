package pw.mr03;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.util.ResourceUtils;
import pw.mr03.entity.Province;
import pw.mr03.service.ProvinceService;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ProvinceTests {

    @Autowired
    private ProvinceService provinceService;

	@Test
    public void test() {
        try {
            String jsonDataStr = FileUtils.readFileToString(ResourceUtils.
                    getFile("classpath:static/data/provinces.json"), Charset.forName("UTF-8"));
            ArrayList<Province> provinces = JSON.parseObject(jsonDataStr, new TypeReference<ArrayList<Province>>() {});
            for (Province province : provinces) {
                boolean i = provinceService.insertProvinceCell(province);
                System.out.println(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
