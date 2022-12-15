package Services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entities.Course;
import Entities.Student;

public class InsertStudentAndCourses {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		
		Student s1 = null;
		Course c1 = null;
		
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			s1 = session.get(Student.class, 1);
			c1 = new Course("Java");
			s1.add(c1);
			session.save(s1);
			session.save(c1);
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
