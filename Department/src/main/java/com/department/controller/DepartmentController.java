package com.department.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

	@GetMapping("getDepartment")
	public String getDepartment() {
		return "Get Department";
	}
	@RequestMapping("/")
    public String index() {
        return "Spring Boot Department Example";
    }
}
