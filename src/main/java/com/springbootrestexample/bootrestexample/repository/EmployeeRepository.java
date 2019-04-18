package com.springbootrestexample.bootrestexample.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.springbootrestexample.bootrestexample.entity.EmployeeEntity;

public interface EmployeeRepository extends CrudRepository<EmployeeEntity, Integer> {
	@Override
	List<EmployeeEntity> findAll();
}