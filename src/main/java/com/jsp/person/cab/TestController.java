package com.jsp.person.cab;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestController {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("AKASH");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
Person person=new Person();
		
		Cab cab=new Cab();
		
		Person p1=new Person();
		
	
		p1.setName("Akash");
		p1.setEmail("akash@gmail.com");
		p1.setC_no(123456l);
	
		Person p2=new Person();
		p2.setName("Ajay");
		p2.setEmail("ajay@gmail.com");
		p2.setC_no(1234536l);
	
		Person p3=new Person();
		p3.setName("Amar");
		p3.setEmail("amar@gmail.com");
		p3.setC_no(1234566l);
	
		
		ArrayList< Person>p11=new ArrayList();
		p11.add(p1);
		p11.add(p2);
		p11.add(p3);
		
		
		
		Cab c1=new Cab();
		c1.setName("TATA");
		c1.setType("RED");
		
		Cab c2=new Cab();
		c2.setName("MARUTI");
		c2.setType("Normal");
		
		Cab c3=new Cab();
		c3.setName("MAH");
		c3.setType("BIG");
		
		
		ArrayList< Cab>a1=new ArrayList();
		a1.add(c1);
		a1.add(c2);
		a1.add(c3);
	
//		person.setName("Akash");
//		person.setEmail("akash@gmail.com");
//		person.setC_no(9892195830l);
		person.setCabs(a1);
		
		
		cab.setPersons(p11);
		
		entityTransaction.begin();
		entityManager.persist(p1);
		entityManager.persist(p2);
		entityManager.persist(p3);
		entityManager.persist(c1);
		entityManager.persist(c2);
		entityManager.persist(c3);
	

		entityTransaction.commit();
		System.out.println("all good");

	}

}
