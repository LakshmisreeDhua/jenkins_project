package com.cts.first;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@SpringBootApplication
public class JenkinsProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(JenkinsProjectApplication.class, args);
	}
   @GetMapping("/demo")
   public String demoproject() {
	   return "I have done successfully";
	   }

}
