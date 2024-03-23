package manytooneuni.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import manytooneuni.dto.Company;

public class CompanyDao {
	
	 public EntityManager getEntityManager() {
	 EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
	 EntityManager entityManager = entityManagerFactory.createEntityManager();
	 return entityManager;
		 
	 }
	 
	 
	 public void updateCompany(int id, Company company) {
		 EntityManager entityManager = getEntityManager();
		 Company dbcompany = entityManager.find(Company.class, id);
		 if(dbcompany!=null) {
			 EntityTransaction entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			 company.setId(id);
			 entityManager.merge(company);
			 entityTransaction.commit();
		 }else {
			 System.out.println("sorry id is not present");
		 }
	 }
	 
	 
	 public void findCompany(int id) {
		 EntityManager entityManager = getEntityManager();
		 Company dbcompany = entityManager.find(Company.class, id);
		 if(dbcompany!=null) {
			System.out.println(dbcompany);
		 }else {
			 System.out.println("sorry id is not present");
		 }
	 }
	 
	 public void deleteCompany(int id) {
		 EntityManager entityManager = getEntityManager();
		 Company dbcompany = entityManager.find(Company.class, id);
		 if(dbcompany!=null) {
			 EntityTransaction entityTransaction = entityManager.getTransaction();
			 entityTransaction.begin();
			 entityManager.remove(dbcompany);
			 entityTransaction.commit();
		 }else {
			 System.out.println("sorry id is not present");
		 }
	 }

}
