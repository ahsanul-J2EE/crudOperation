package com.webFlux.crudOperation.practise.repository;

import com.webFlux.crudOperation.practise.dto.EmployeeDto;
import com.webFlux.crudOperation.practise.entity.Employee;

import org.springframework.data.mongodb.repository.Query;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import reactor.core.publisher.Flux;


public interface EmployeeRepository extends ReactiveCrudRepository<Employee, String >{

    @Query("{'firstName': {$ne: null}}")
    Flux<Employee> getEmployeesWhereFirstNameNotEqualNull();


}

