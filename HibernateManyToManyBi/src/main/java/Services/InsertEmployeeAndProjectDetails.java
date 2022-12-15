package Services;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import Entities.Employee;
import Entities.Project;

public class InsertEmployeeAndProjectDetails {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = null;
		Transaction tx = null;

		try {
			session = factory.getCurrentSession();
			tx = session.beginTransaction();
			Employee e1 = new Employee("Rahul");
			Project p1 = new Project("PG-Clean up"), p2 = new Project("Experience");
			session.save(p1);
			session.save(p2);

			List<Project> projectList1 = new ArrayList<Project>();
			projectList1.add(p1);
			projectList1.add(p2);
			e1.setProject(projectList1);
			session.save(e1);

			tx.commit();
		} catch (Exception e) {
			e.printStackTrace();
			tx.rollback();
		} finally {
			session.close();
		}

	}

}
