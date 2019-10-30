package com.springboot.garage.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.garage.model.Employee;

public interface EmployeeDAO extends JpaRepository<Employee, Long> {

}
