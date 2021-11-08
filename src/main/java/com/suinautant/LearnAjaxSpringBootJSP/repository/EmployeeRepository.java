package com.suinautant.LearnAjaxSpringBootJSP.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.suinautant.LearnAjaxSpringBootJSP.object.Employee;

interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
