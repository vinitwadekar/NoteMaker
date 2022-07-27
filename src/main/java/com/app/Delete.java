package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class Delete {
	Delete()
	
	{
		Scanner sc=new Scanner(System.in);
		Configuration con=new Configuration();
		con.configure("hibernation.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		System.out.println("enter id u want to delete");
		int a=sc.nextInt();
		Note n_obj=new Note();
		n_obj.setId(a);;
		session.delete(n_obj);
		tx.commit();
		System.out.println("Successfully delete a note with id : "+a);
		session.close();
		
	}

}
