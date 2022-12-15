package com.javaPracticeCodes.transactionManagementDemo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Savepoint;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class App {
	public static void main(String[] args) throws Exception {
		Savepoint sp1 = null, sp2 = null;
		Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:49153/ebooks", "postgres",
				"postgrespw");
		try {
			conn.setAutoCommit(false);
			Statement stmt = conn.createStatement();
			String queryString1 = "delete from books where id = 3";
			sp1 = conn.setSavepoint();
			stmt.executeUpdate(queryString1);

			String queryString2 = "Insert into books values (4,'Kafka on the shore','Murakami',120,3)";
			sp2 = conn.setSavepoint();
			stmt.executeUpdate(queryString2);
			conn.commit();

		} catch (SQLException e) {
			conn.rollback(sp1);
			e.printStackTrace();
		} finally {
			conn.close();
		}
	}
}
