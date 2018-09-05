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
import pw.mr03.entity.City;
import pw.mr03.service.CityService;

import java.io.IOException;
import java.nio.charset.Charset;
import java.util.ArrayList;


@RunWith(SpringRunner.class)
@SpringBootTest
public class CityTests {

    @Autowired
    private CityService cityService;

	@Test
    public void test() {
        try {
            String jsonDataStr = FileUtils.readFileToString(ResourceUtils.
                    getFile("classpath:static/data/cities.json"), Charset.forName("UTF-8"));
            ArrayList<City> cities = JSON.parseObject(jsonDataStr, new TypeReference<ArrayList<City>>() {});
            for (City city : cities) {
                boolean i = cityService.insertCityCell(city);
                System.out.println(city.getName());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
