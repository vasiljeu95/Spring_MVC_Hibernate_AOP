package com.vasilyeu.spring.mvc_hibernate_aop.controller;

import com.vasilyeu.spring.mvc_hibernate_aop.dao.EmployeeDAO;
import com.vasilyeu.spring.mvc_hibernate_aop.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * MyController
 *
 * @author Stepan Vasilyeu
 * @since 08.09.2022
 */

@Controller
public class MyController {
    @Autowired
    private EmployeeDAO employeeDAO;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployee = employeeDAO.getAllEmployees();
        model.addAttribute("allEmps", allEmployee);

        return "allEmployees";
    }
}
