package com.webFlux.crudOperation.practise.services;

import com.webFlux.crudOperation.practise.dto.EmployeeDto;
import com.webFlux.crudOperation.practise.entity.Employee;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface EmployeeService {

    Mono<EmployeeDto> saveEmployee(EmployeeDto employeeDto);

    Mono<EmployeeDto> getEmployee(String employeeId);

    Flux<EmployeeDto> getAllEmployees();

    Flux<EmployeeDto> getEmployeesWhereFirstNameNotEqualNull();

    Mono<EmployeeDto> updateEmployee(EmployeeDto employeeDto, String employeeId);

    Mono<Void> deleteEmployee(String employeeId);



}
