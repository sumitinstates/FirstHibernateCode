package com.sumit;

import org.hibernate.Session;

public class EmployeeService {
	
	 public void add(Employee e) {
		 Session session = SessionProvider.getSession();
		 session.beginTransaction();
		 session.save(e);
		 
		 session.getTransaction().commit(); 
	 }

}
