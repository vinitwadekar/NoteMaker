package com.app;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class All {
	All(){
	Configuration con=new Configuration();
	con.configure("hibernation.cfg.xml");
	SessionFactory factory=con.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tx=session.beginTransaction();
	Query q = session.createQuery("from Note");
	List<Note> list = q.list();
	for (Note note : list)
	{
		System.out.println("ID : "+note.getId()+" Title : "+note.getTitle());
		//System.out.println("Title"+note.getTitle());
		System.out.println(note.getContent());
		
	}
	}
	

}
