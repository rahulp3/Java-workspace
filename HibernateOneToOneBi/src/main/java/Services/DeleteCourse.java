package Services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entities.Course;

public class DeleteCourse {

	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		
		Course c1 = null;
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			c1 = session.get(Course.class, 2);
			if(c1!=null) {
				session.delete(c1);
			}
			tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
