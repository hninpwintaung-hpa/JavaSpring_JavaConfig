package spring.javaConfig.demo;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import spring.javaConfig.demo.controller.EmployeeController;

@Configuration
@ComponentScan(basePackages = "spring.javaConfig.demo")
public class AppConfig {
	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		EmployeeController controller = (EmployeeController) context.getBean(EmployeeController.class);
		//controller.addEmployee();
		//controller.updateEmployee();
		controller.getAllEmployee();
		//controller.deleteEmployee();
		context.close();
	}
}
