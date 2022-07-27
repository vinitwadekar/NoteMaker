package com.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import java.util.*;

public class Update {
	Update()
	{
		Scanner sc=new Scanner(System.in);
		Configuration con=new Configuration();
		con.configure("hibernation.cfg.xml");
		SessionFactory factory=con.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		
		System.out.println("Tell the Id of Note u want to update");
		int a=sc.nextInt();


			System.out.println("Enter the content you would like to have");
			String tit=sc.nextLine();
			String qry="update Note  set content=:n where id=:i";
			Query query=session.createQuery(qry);
			query.setParameter("n", tit);
			query.setParameter("i", a);
		
			int count=query.executeUpdate();
			System.out.println(count+"Update successful");
			
		
		tx.commit();
		session.close();
		
		
		
		
		
	}

}
