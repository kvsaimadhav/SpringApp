package com.ntc.saimadhav.training8.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
//import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ntc.saimadhav.training8.vo.EmployeeVo;

@RestController
public class EmployeeControllerTest {
	
//	@GetMapping(path="/employees", produces="application/json")
//	@CrossOrigin(origins = "*")
//	public String getEmployee() {
//		return "Hello World";
//	}
	
	@GetMapping(path="/employees", produces="application/json")
	public String getEmployee(@RequestParam("empname") String employeeName) {
		return employeeName;
	}
	
	@PostMapping(path="/employees", consumes="application/json", produces="application/json" )
	public EmployeeVo saveEmployee(@RequestBody EmployeeVo employeeVo) {
		return employeeVo;
	}
	
	@PutMapping(path="/employees", consumes="application/json", produces="application/json")
	public EmployeeVo updateEmployee(@RequestBody EmployeeVo employeeVo) {
		employeeVo.setName("Robert Johnson");
		employeeVo.setId(23489339L);
		return employeeVo;
	}
}
