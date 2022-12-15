package services;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entity.Teacher;
import Entity.TeacherDetails;

public class Insert {

	public static void main(String[] args) {

		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		System.out.println("Created");
		Teacher t1 = null;
		t1 = new Teacher("Rahul", "P B", "Rahulpb@gmail.com");
		TeacherDetails d1 = null;
		d1 = new TeacherDetails("Bengaluru");
		t1.setTeacherDetails(d1);
		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			session.save(t1);// saving the object
			d1 = session.get(TeacherDetails.class, 1);
			System.out.println("teacher details"+ d1.getTeacher().getF_name());

//			session.createQuery("Delete from Teacher where id = 1").executeUpdate();
			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
