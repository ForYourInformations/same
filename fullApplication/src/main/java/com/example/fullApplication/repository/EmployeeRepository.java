package com.example.fullApplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.fullApplication.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
