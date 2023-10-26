package spring.javaConfig.demo.controller;

import java.util.List;

import org.springframework.stereotype.Component;

import spring.javaConfig.demo.model.Employee;
import spring.javaConfig.demo.service.EmployeeService;

@Component
public class EmployeeController {
	
	private EmployeeService employeeService;
	private Employee employee;
	
	public EmployeeController(EmployeeService employeeService) {
		this.employeeService = employeeService;
	}
	public void addEmployee() {
	    employee = new Employee();
	    employee.setId(4);
	    employee.setName("Ma Yamone May");
	    employee.setEmail("yamone@gmail.com");
	    employee.setPhone("0884324");
	    employee.setAddress("Mawlamyine");
		employeeService.insert(employee);
	}
	public void updateEmployee() {
		employee = new Employee();
		employee.setId(3);
		employee.setPhone("0832332");
		employee.setAddress("Belin");
		employeeService.update(employee);
	}
	public void getAllEmployee(){
		List<Employee> employee= employeeService.findAll();
		for(Employee e : employee) {
			System.out.println("Employee name :" + e.getName()+ " ," + e.getEmail() + ", "+ e.getPhone() +", " +e.getAddress());		}
	}
	public void deleteEmployee() {
		employee = new Employee();
		employee.setId(2);
		employeeService.delete(employee);
	}
	public void doWork() {
		System.out.println("Hello");
	}
}
