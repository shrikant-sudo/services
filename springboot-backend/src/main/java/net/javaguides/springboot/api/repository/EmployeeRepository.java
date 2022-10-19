package net.javaguides.springboot.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import net.javaguides.springboot.api.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long>{

}
