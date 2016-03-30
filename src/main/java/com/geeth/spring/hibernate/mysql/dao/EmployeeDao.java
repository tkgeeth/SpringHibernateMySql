/**
 * 
 */
package com.geeth.spring.hibernate.mysql.dao;

import java.util.List;

import com.geeth.spring.hibernate.mysql.model.Employee;

/**
 * 
 * @author Geeth
 *
 */
public interface EmployeeDao {

	Employee findById(int id);

	void saveEmployee(Employee employee);

	void deleteEmployeeBySsn(String ssn);

	List<Employee> findAllEmployees();

	Employee findEmployeeBySsn(String ssn);

}