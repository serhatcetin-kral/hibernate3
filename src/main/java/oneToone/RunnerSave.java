package oneToone;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import hibernate03.Studentsdt11;

public class RunnerSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Books book=new Books();
		StudentsOne st=new StudentsOne();
		
		
		st.setBook(book);
		st.setId(101);
		st.setName("murat");
		
		
		book.setBook_id(1001);
		book.setBook_name("pinokia");
		book.setStudent(st);
		
		
	
		
		
		
		Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(StudentsOne.class).addAnnotatedClass(Books.class);
		SessionFactory sf=con.buildSessionFactory();
		
		Session session=sf.openSession();
		
		
		Transaction tr=session.beginTransaction();
		
		
		session.save(st);
		session.save(book);
		
		
		
		tr.commit();
		session.close();
		sf.close();
		
		
		
		
		
		
	}

}




