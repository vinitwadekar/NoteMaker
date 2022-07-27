package com.app;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Add {
	Add()
	{
		Scanner sc=new Scanner(System.in);
		Random rn=new Random();
		
		
		
		Configuration con=new Configuration();
		con.configure("hibernation.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		int nid=rn.nextInt(100);
		Note n_obj=new Note();
		n_obj.setId(nid);
		System.out.println("add a title");
		String tit=sc.nextLine();
		n_obj.setTitle(tit);
		System.out.println("write content");
		
		String cont=sc.nextLine();
		n_obj.setContent(cont);
		session.persist(n_obj);
		tx.commit();
		System.out.println("success");
		System.out.println("your note id is "+nid);
		System.out.println("Have a good day!!!!");
		session.close();
		
	}

}
