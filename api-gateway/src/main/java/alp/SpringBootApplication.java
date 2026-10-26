package alp;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@org.springframework.boot.autoconfigure.SpringBootApplication
@RestController
@EnableEurekaServer
public class SpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootApplication.class, args);
	}

	@GetMapping("/test")
	public String getMethodName() {
		return new String("test");
	}
	
	
}