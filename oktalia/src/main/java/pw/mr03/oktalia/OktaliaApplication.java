package pw.mr03.oktalia;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("pw.mr03.oktalia.mapper")
@SpringBootApplication
public class OktaliaApplication {

	public static void main(String[] args) {
		SpringApplication.run(OktaliaApplication.class, args);
	}
}
