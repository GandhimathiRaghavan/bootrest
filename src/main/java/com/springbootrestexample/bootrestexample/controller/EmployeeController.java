package com.springbootrestexample.bootrestexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springbootrestexample.bootrestexample.entity.EmployeeEntity;
import com.springbootrestexample.bootrestexample.service.EmployeeService;

@RestController
@RequestMapping("/employees")
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	@PostMapping
	public void addEmployee(@RequestBody final EmployeeEntity employee) {
		employeeService.upsertEmployee(employee);
	}

	@GetMapping("/{employeeId}")
	public EmployeeEntity getEmployee(@PathVariable("employeeId") final Integer employeeId) {
		return employeeService.getEmployee(employeeId);
	}

	@GetMapping
	public List<EmployeeEntity> getAllEmployees(ModelMap map) {
		return employeeService.getAllEmployees();
	}

	@PutMapping("/{employeeId}")
	public void updateEmployee(@RequestBody final EmployeeEntity employee) {
		employeeService.upsertEmployee(employee);
	}

	@DeleteMapping("/{employeeId}")
	public void deleteEmplyee(@PathVariable("employeeId") final Integer employeeId) {
		employeeService.deleteEmployee(employeeId);
	}
}
