package pw.mr03;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("pw.mr03.mapper")
@SpringBootApplication
public class OilApplication {

	public static void main(String[] args) {
		SpringApplication.run(OilApplication.class, args);
	}
}
