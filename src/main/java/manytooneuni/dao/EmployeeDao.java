package manytooneuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneuni.dto.Employee;

public class EmployeeDao {
	
	public EntityManager getEntityManager() {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		return entityManager;
		
	}
	
	public void updateEmployee(int id, Employee employee) {
		EntityManager entityManager = getEntityManager();
		Employee dbemployee = entityManager.find(Employee.class, id);
		if(dbemployee!=null) {
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			employee.setId(id);
			employee.setCompany(dbemployee.getCompany());
			entityManager.merge(employee);
			entityTransaction.commit();
		}else {
			System.out.println("sorry id is not prrsent");
		}
	}
	
	
	 public void findEmployee(int id) {
		 EntityManager entityManager = getEntityManager();
		 Employee dbEmployee = entityManager.find(Employee.class,id);
		 if(dbEmployee!=null) {
			System.out.println(dbEmployee);
		 }else {
			 System.out.println("sorry id is not present");
		 }
	 }
	 
	 public void deleteEmployee(int id) {
		 EntityManager entityManager = getEntityManager();
		 Employee dbEmployee = entityManager.find(Employee.class,id);
		 if(dbEmployee!=null) {
			 EntityTransaction entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			 entityManager.remove(dbEmployee);
			 entityTransaction.commit();
		 }else {
			 System.out.println("sorry id is not present");
		 }
	 }


}
