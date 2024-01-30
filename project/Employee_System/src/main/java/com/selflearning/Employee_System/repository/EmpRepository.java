package com.selflearning.Employee_System.repository;

import com.selflearning.Employee_System.model.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmpRepository extends JpaRepository<Emp, Integer> {

}
