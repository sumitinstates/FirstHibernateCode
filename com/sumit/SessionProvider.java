package com.sumit;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionProvider {
	
	private static Session session;

	public static Session getSession() {
		SessionFactory sf= new Configuration().configure().buildSessionFactory();
		session = sf.openSession();
		return session;
	}


}

