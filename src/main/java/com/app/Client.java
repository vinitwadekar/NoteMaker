package com.app;
import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import java.util.*;

public class Client {
	public static void main(String []args)
	{
		int ch=0;
		System.out.println("Welcome to Note Maker");
		System.out.println("What would you like to do");
		System.out.println(" 1.Add a note\n 2.Delete a note\n 3.All\n 4.Update");
		
		Scanner sc=new Scanner(System.in);
		ch=sc.nextInt();
		switch(ch)
		{
		case 1:
			Add a=new Add();
		break;
		
		case 2:
			Delete d=new Delete();
			break;
			
		case 3:
			All al=new All();
		break;
		case 4:
			Update u=new Update();
			break;
			default:
				System.out.println("Enter appropriate choice");
		
			
		}
		//Delete d=new Delete();
		
		
		
	}

}
