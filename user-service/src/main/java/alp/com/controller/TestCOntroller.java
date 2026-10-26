package alp.com.controller;

import java.sql.Timestamp;
import java.util.Date;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestCOntroller {

	@GetMapping("/test")
	public String helloWord() {
		return "HelloWord" + new Timestamp(new Date().getTime());
	}

}
