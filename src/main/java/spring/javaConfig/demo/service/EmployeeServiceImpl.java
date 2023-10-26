package spring.javaConfig.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import spring.javaConfig.demo.dao.EmployeeDAO;
import spring.javaConfig.demo.model.Employee;

@Component
public class EmployeeServiceImpl implements EmployeeService{
	private EmployeeDAO employeeDAO;

	@Autowired
	public EmployeeServiceImpl(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void insert(Employee employee) {
		employeeDAO.insert(employee);
	}

	public void update(Employee employee) {
		employeeDAO.update(employee);
	}

	public List<Employee> findAll() {
       return employeeDAO.findAll();
	}
	public void delete(Employee employee) {
		employeeDAO.delete(employee);
	}
}
