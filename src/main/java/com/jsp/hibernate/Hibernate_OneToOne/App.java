package com.jsp.hibernate.Hibernate_OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class App 
{
    public static void main( String[] args )
    {
    	Person person=new Person();
    	person.setPersonId(102);
    	person.setPersonName("Tom");
    	
    	
    	Aadhar aadhar=new Aadhar();
    	aadhar.setAadharId(2);
    	aadhar.setAadharNo(1234567890786l);
    	
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Aadhar.class).addAnnotatedClass(Person.class);//if you want to give the custom names then pass this in the configure method 
    	SessionFactory sf = cfg.buildSessionFactory();
    	Session session = sf.openSession();
		Transaction tran = session.beginTransaction();
		
		person.setAadhar(aadhar);
		
		session.save(person);
		session.save(aadhar);
		
		tran.commit();
		session.close();
		sf.close();
    	
    	
    }
    
}
