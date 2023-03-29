package com.emiralpulger.springboot.cruddemo.service;

import com.emiralpulger.springboot.cruddemo.dao.EmployeeRepository;
import com.emiralpulger.springboot.cruddemo.entity.Employee;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    private EmployeeRepository employeeRepository;

    public EmployeeServiceImpl(EmployeeRepository theEmployeeRepository){
        employeeRepository = theEmployeeRepository;
    }

    @Override
    public List<Employee> findAll() {
        return employeeRepository.findAll();
    }

    @Override
    public Employee findById(int theId) {
        Optional<Employee> results = employeeRepository.findById(theId);

       Employee theEmployee = null;
        if (results.isPresent()){
            theEmployee = results.get();
        }
        else {
            // we didn't find the employee
            throw  new RuntimeException("Dİd not find employee id - " + theId);
        }

        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {
        return employeeRepository.save(theEmployee);
    }

    @Override
    public void deleteById(int theId) {
        employeeRepository.deleteById(theId);

    }
}
