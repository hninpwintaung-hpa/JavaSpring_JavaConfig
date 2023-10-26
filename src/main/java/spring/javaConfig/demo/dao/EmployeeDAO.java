package spring.javaConfig.demo.dao;

import java.util.List;

import org.springframework.stereotype.Component;

import spring.javaConfig.demo.model.Employee;

public interface EmployeeDAO {
	public void insert(Employee employee);

	public void update(Employee employee);

	public List<Employee> findAll();

	public void delete(Employee e);
}
