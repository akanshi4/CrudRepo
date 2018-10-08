package com.example.learningJPA;

import com.example.learningJPA.employee.model.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class JpaTest {
	private static EntityManager em;

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence
				.createEntityManagerFactory("EmployeePU");
		em = emf.createEntityManager();

		createEmployee(1, "Ravi", "Raj", "Textile");
		createEmployee(2, "Amit", "Raj", "IT");
		createEmployee(3, "Nitish", "Kumar", "Marketing");

	}

	private static void createEmployee(int id, String firstName,
									   String lastName, String dept) {

	}
}