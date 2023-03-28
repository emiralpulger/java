package com.emiralpulger.springboot.cruddemo.dao;

import com.emiralpulger.springboot.cruddemo.entity.Employee;

import java.util.List;

public interface EmployeeDAO {

    List<Employee> findAll();
}
