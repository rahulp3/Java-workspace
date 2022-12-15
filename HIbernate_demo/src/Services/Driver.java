package Services;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import entity.Teacher;

public class Driver {

	public static void main(String[] args) {
		
		System.out.println("Connecting to database");
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;
		/*
		 * addAnnotatedClass method can be used instead of mapping property in hibernate config file
		 * SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Teacher.class).buildSessionFactory();
		 */
		System.out.println("Created");
		Teacher t1 = null;
		TeacherDetails d1 = null;
		t1 = new Teacher("rana","P B","ranapb@gmail.com");//to insert data into the table 
		d1 = new TeacherDetails("Bengaluru");
		t1.setTeacherDetails(d1);
		try {
		session = factory.getCurrentSession();
		tx = session.beginTransaction();
		session.save(t1);//saving the object
		session.createQuery("Delete from Teacher where id = 1").executeUpdate();

//		t1= session.get(Teacher.class, 1);//getting an object from the database
//		System.out.println("Teacher Name : "+t1.getEmail());
//		List<Teacher> t_list = session.createQuery("From Teacher").list();//querying the table sntx: session_obj.createQuery("From ClassName")
//		for(Teacher t:t_list) {
//			System.out.println(t);
//		}
		tx.commit();
		}catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		}finally {
			session.close();
		}
		
		//Updating a record using HQL
//		try {
//			session = factory.getCurrentSession();
//			tx = session.beginTransaction();
//			//method 1
//			t1= session.get(Teacher.class, 1);//getting an object from the database
//			t1.setL_name("Pattath");
//			session.update(t1);
//			//method 2
//			session.createQuery("Update Teacher set email='test@gmail.com' where id = 2").executeUpdate();
//			List<Teacher> t_list = session.createQuery("From Teacher").list();//querying the table sntx: session_obj.createQuery("From ClassName")
//			for(Teacher t:t_list) {
//				System.out.println(t);
//			}
//			tx.commit();
//			}catch (Exception e) {
//				e.printStackTrace();
//				tx.rollback();
//			}finally {
//				session.close();
//			}
//		
//		//Deleting a record using HQL
//		try {
//			session = factory.getCurrentSession();
//			tx = session.beginTransaction();
//			//method 1
//			t1= session.get(Teacher.class, 1);//getting an object from the database
//			session.delete(t1);
//			//method 2
//			session.createQuery("Delete from Teacher where id = 2").executeUpdate();
//			List<Teacher> t_list = session.createQuery("From Teacher").list();//querying the table sntx: session_obj.createQuery("From ClassName")
//			for(Teacher t:t_list) {
//				System.out.println(t);
//			}
//			tx.commit();
//			}catch (Exception e) {
//				e.printStackTrace();
//				tx.rollback();
//			}finally {
//				session.close();
//			}
	}

}
