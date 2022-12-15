package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.TeacherDetails;

public class Delete {

	public static void main(String[] args) {

		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			TeacherDetails t1 = session.get(TeacherDetails.class,1);
//			session.createQuery("Delete from TeacherDetails where id = 1").executeUpdate();
			session.delete(t1);
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
