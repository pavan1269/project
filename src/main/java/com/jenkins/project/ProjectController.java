package com.jenkins.project;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProjectController {

	@GetMapping("/hello")
	public String returnMsg() {
		return "Hello World!!!";
	}
}
