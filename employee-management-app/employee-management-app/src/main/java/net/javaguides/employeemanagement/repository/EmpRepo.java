package net.javaguides.employeemanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.javaguides.employeemanagement.entity.Employee;

@Repository
public interface EmpRepo extends JpaRepository<Employee,Integer> {

}
