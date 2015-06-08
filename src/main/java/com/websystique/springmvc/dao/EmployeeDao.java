package com.websystique.springmvc.dao;

import com.websystique.springmvc.model.Employee;
import java.util.List;

public interface EmployeeDao {

    void saveEmployee(Employee employee);

    List<Employee> findAllEmployees();

    void deleteEmployeeBySsn(String ssn);
}