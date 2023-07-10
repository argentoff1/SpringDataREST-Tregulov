package com.parinosmaxim.spring.spring.springboot.spring_data_rest.dao;

import com.parinosmaxim.spring.spring.springboot.spring_data_rest.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

// Помимо дефолтно доступных методов, можно добавлять свои.
// Spring Boot поможет выбрать название, предложит варианты
@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
