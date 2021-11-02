package hibernate03;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Fetchdt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Studentsdt11 st=new Studentsdt11();
		Studentsdt11 st1=new Studentsdt11();
		Studentsdt11 st2=new Studentsdt11();
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Studentsdt11.class);
		
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		
		st=session.get(Studentsdt11.class, 101);
	
		st1=session.get(Studentsdt11.class, 102);
		
		st2=session.get(Studentsdt11.class, 103);
		
		
		System.out.print(st);
		
		System.out.println(st1);

		System.out.println(st2);
		
		tr.commit();
		
		
		session.close();
		sf.close();
		
		
		
		
		
	}

}
