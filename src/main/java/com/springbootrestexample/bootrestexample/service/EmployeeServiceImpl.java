package com.springbootrestexample.bootrestexample.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.springbootrestexample.bootrestexample.entity.EmployeeEntity;
import com.springbootrestexample.bootrestexample.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepo;

	@Override
	@Transactional
	public void upsertEmployee(final EmployeeEntity employee) {
		employeeRepo.save(employee);
	}

	@Override
	@Transactional
	public EmployeeEntity getEmployee(final Integer employeeId) {
		final Optional<EmployeeEntity> emplyee = employeeRepo.findById(employeeId);
		return emplyee.isPresent() ? emplyee.get() : null;
	}

	@Override
	@Transactional
	public List<EmployeeEntity> getAllEmployees() {
		return employeeRepo.findAll();
	}

	@Override
	@Transactional
	public void deleteEmployee(final Integer employeeId) {
		employeeRepo.deleteById(employeeId);
	}
}
