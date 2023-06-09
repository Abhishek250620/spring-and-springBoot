package com.hibernate.project1;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main( String[] args )
	{
		Student std=new Student();
		std.setUsn(3);
		std.setName("Jerry");
		std.setMarks(99.2);

		Configuration cfg =	new Configuration();
		cfg.configure("com/hibernate/project1/hibernate.cfg.xml");
		SessionFactory sf=cfg.buildSessionFactory();		//jdbc connection
		Session session=sf.openSession();
		Transaction tns= session.beginTransaction();
		session.save(std);
		tns.commit();
		session.close();
		sf.close();
	}
}
