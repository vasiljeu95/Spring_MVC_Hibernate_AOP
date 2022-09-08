package com.vasilyeu.spring.mvc_hibernate_aop.service;

import com.vasilyeu.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.vasilyeu.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * EmployeeServiceImpl
 *
 * @author Stepan Vasilyeu
 * @since 08.09.2022
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeDAO employeeDAO;

    @Override
    @Transactional
    public List<Employee> getAllEmployees() {
        return employeeDAO.getAllEmployees();
    }
}
