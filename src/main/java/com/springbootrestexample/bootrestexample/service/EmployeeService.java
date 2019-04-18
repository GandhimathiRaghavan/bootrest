package com.springbootrestexample.bootrestexample.service;

import java.util.List;

import com.springbootrestexample.bootrestexample.entity.EmployeeEntity;

public interface EmployeeService {
	public void upsertEmployee(EmployeeEntity employee);

	public EmployeeEntity getEmployee(Integer employeeId);

	public List<EmployeeEntity> getAllEmployees();

	public void deleteEmployee(Integer employeeId);
}
