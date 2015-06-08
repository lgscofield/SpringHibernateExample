package com.websystique.springmvc.service;

import com.websystique.springmvc.model.Employee;
import java.util.List;

public interface EmployeeService {

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);
}