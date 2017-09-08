package org.practice.dto;

import java.util.List;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Employee implements InitializingBean, DisposableBean {

	private int id;

	private String name;

	private List<String> roles;

	// init-method
	// @PostConstruct
	// public void init(){
	// System.out.println("Employee bean is initialized ..");
	// }

	// destroy-method
	// @PreDestroy
	// public void destroy(){
	// System.out.println("Employee bean is destroyed ..");
	// }

	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<String> getRoles() {
		return roles;
	}

	public void setRoles(List<String> roles) {
		this.roles = roles;
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("Employee bean is destroyed ..");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Employee bean is initialized ..");
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", roles=" + roles + "]";
	}
	
}
