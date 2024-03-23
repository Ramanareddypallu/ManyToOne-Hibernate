package manytooneuni.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.internal.util.compare.ComparableComparator;

import manytooneuni.dao.CompanyDao;
import manytooneuni.dao.EmployeeDao;
import manytooneuni.dto.Company;
import manytooneuni.dto.Employee;

public class EmpCompanyCont {

	public static void main(String[] args) {


	/*	Company company = new Company();
		company.setId(1);
		company.setName("Tcs");
		company.setGst("TCS@123");
		
		Employee employee = new Employee();
		employee.setId(1);
		employee.setName("Ramana Reddy");
		employee.setAddress("bangolre");
		employee.setCompany(company);
		
		Employee employee2 = new Employee();
		employee2.setId(2);
		employee2.setName("pavithra Reddy");
		employee2.setAddress("banhglore");
		employee2.setCompany(company);
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("ram");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(company);
		entityManager.persist(employee);
		entityManager.persist(employee2);
		entityTransaction.commit();
        */
		
		Employee employee = new Employee();
		employee.setName("Ram Reddy");
		employee.setAddress("hyderabad");
		
	/*	Company company = new Company();
		company.setName("IBM");
		company.setGst("IBM@123");
		
		CompanyDao dao = new CompanyDao();
		dao.updateCompany(1, company);
		*/
		
		
	/*	EmployeeDao dao = new EmployeeDao();
		dao.updateEmployee(1, employee);
		*/
		
	/*	CompanyDao dao = new CompanyDao();
		dao.findCompany(1);
		
		EmployeeDao dao1 = new EmployeeDao();
		dao1.findEmployee(2);
		*/
		
	/*	EmployeeDao dao1 = new EmployeeDao();
		dao1.deleteEmployee(1);
		*/
		CompanyDao dao = new CompanyDao();
		dao.deleteCompany(1);
	}

}
