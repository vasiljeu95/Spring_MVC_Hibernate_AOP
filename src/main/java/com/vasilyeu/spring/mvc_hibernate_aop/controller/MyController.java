package com.vasilyeu.spring.mvc_hibernate_aop.controller;

import com.vasilyeu.spring.mvc_hibernate_aop.entity.Employee;
import com.vasilyeu.spring.mvc_hibernate_aop.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;
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
    private EmployeeService employeeService;

    @RequestMapping("/")
    public String showAllEmployees(Model model) {
        List<Employee> allEmployee = employeeService.getAllEmployees();
        model.addAttribute("allEmps", allEmployee);

        return "allEmployees";
    }

    @RequestMapping("/addNewEmployee")
    public String addNewEmployee(Model model) {
        Employee employee = new Employee();
        employee.setName("Stepan");
        employee.setSurName("Vasilyeu");
        employee.setDepartment("IT");
        employee.setSalary(1000);

        model.addAttribute("employee", employee);

        return "employeeInfo";
    }

    @RequestMapping("/saveEmployee")
    public String saveEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            return "employeeInfo";
        } else {
            employeeService.saveEmployee(employee);

            return "redirect:/";
        }
    }
}
