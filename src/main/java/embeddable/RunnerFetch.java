package embeddable;

import java.util.Arrays;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class RunnerFetch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Students st=new Students();
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Students.class);
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		
		
		Transaction tr=session.beginTransaction();
		
		String hql="select s.name,s.course.mandatary from Students s";
		
	    List<Object[]> result=session.createQuery(hql).getResultList();
		
		for(Object[] w:result) {
			
			System.out.println(Arrays.toString(w));
			
		}
		
		
		
		tr.commit();
		
		
		session.close();
		sf.close();
		
		
		
		
	}

}
