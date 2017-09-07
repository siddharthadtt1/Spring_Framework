package org.practice;

import org.practice.dto.Employee;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpringFramework {

	public static void main(String[] args) {
		AbstractApplicationContext applicationContext = new ClassPathXmlApplicationContext(
				"spring_conf.xml");
		
		applicationContext.registerShutdownHook();

		Employee employee = (Employee) applicationContext.getBean("empId");
		System.out.println("Employee : " + employee);
		
		Employee employee2 = (Employee) applicationContext.getBean("empId");
		System.out.println("Employee " + employee2);
		
	}

}
