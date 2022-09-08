package com.vasilyeu.spring.mvc_hibernate_aop.entity;

import lombok.Data;

import javax.persistence.*;

/**
 * employee
 *
 * @author Stepan Vasilyeu
 * @since 08.09.2022
 */
@Data
@Entity
@Table(name = "employees")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id", nullable = false)
    private Long id;

    @Column(name = "name")
    private String name;
    @Column(name = "surname")
    private String surName;
    @Column(name = "department")
    private String department;
    @Column(name = "salary")
    private int salary;

    public Employee() {
    }

    public Employee(Long id, String name, String surName, String department, int salary) {
        this.id = id;
        this.name = name;
        this.surName = surName;
        this.department = department;
        this.salary = salary;
    }
}
