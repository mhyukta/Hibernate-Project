package com.jsp.hibernate.Hibernate_Queries;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;



public class App 
{
    public static void main( String[] args )
    {
    	Configuration cfg = new Configuration().configure().addAnnotatedClass(Product.class);
    	SessionFactory sf = cfg.buildSessionFactory();
    	
    	Session session=sf.openSession();
    	Transaction tran=session.beginTransaction();
    	
    	
//    	Fetch Operation
//    	Query<Product> query=session.createQuery("SELECT P FROM Product P");
//    	List<Product> products=query.list();
    	
    	
//    	Getting the Specific details
//    	Query<String> query=session.createQuery("SELECT P.productName FROM Product P");
//    	List<String> products=query.list();
    	
//    	for(Product product:products) {
//    		System.out.println(product);
//    	}
//    	for(String product:products) {
//    		System.out.println(product);
//    	}
    	
    	
//    	Update Operation
//    	Query<Product> query=session.createQuery("Update Product p SET p.productPrice=1000 where p.productId=1");
//    	int rowUpdated =query.executeUpdate();
//    	
//    	if(rowUpdated>0)
//    	{
//    		System.out.println(rowUpdated+"data updated!!");
//    	}else {
//    		System.out.println("Data not updated!!");
//    	}
    	
//    	Delete Operation
    	Query<Product> query=session.createQuery("Delete Product p where p.productId=3");
    	int rowDeleted =query.executeUpdate();
    	
    	if(rowDeleted>0)
    	{
    		System.out.println(rowDeleted+"data deleted!!");
    	}else {
    		System.out.println("Data not deleted!!");
    	}
    	
    	
    	
    	
    	tran.commit();
    	session.close();
    	sf.close();
    	
    }
}
