package com.pms.deloitte;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@SpringBootApplication
public class Main {
	
	/*@RequestMapping("/sayMessage")
	public String getMessage() {
		return "Congrats";
	}
	@RequestMapping("/sayBye")
	public String getBye() {
		return "Congrats Bye";
	}
	@RequestMapping("/sayHi")
	public String getHi() {
		return "Congrats HI";
	}*/

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}

}
