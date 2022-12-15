package com.practiceCodes.java_connectivity_demo;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * Hello world!
 *.getConnection()
 */
public class App 
{
    public static void main( String[] args )
    {
        try {
        	//Select operation
        	Connection conn = DriverManager.getConnection("jdbc:postgresql://localhost:49153/ebooks","postgres","postgrespw");
        	Statement stmt = conn.createStatement();
        	String queryString1 = "Select title from books";
        	ResultSet rs =  stmt.executeQuery(queryString1);
        	while(rs.next()) {
        		System.out.println(rs.getString(1));
        	}
        	
        	//Insert operation 
        	String queryString2 = "Insert into books values(?,?,?,?,?)";
        	PreparedStatement prstmt = conn.prepareStatement(queryString2);
        	prstmt.setInt(1, 2);
        	prstmt.setString(2, "Alchemist");
        	prstmt.setString(3, "Paulo cohelo");
        	prstmt.setFloat(4, 175);
        	prstmt.setInt(5, 3);
        	prstmt.executeUpdate();
        	
        	//Delete operation
        	String queryString3 = "Delete from books where title = ?";
        	PreparedStatement prstmt2 = conn.prepareStatement(queryString3);
        	prstmt2.setString(1, "Alchemist");
        	prstmt2.executeUpdate();
        	
        	//Update operation
        	String queryString4 = "Update books set price = ? where title = ?";
        	PreparedStatement prstmt3 = conn.prepareStatement(queryString4);
        	prstmt3.setInt(1, 200);
        	prstmt3.setString(2, "Alchemist");
        	prstmt3.executeUpdate();
        	System.err.println();
        	 
        }catch(Exception e) {
        	e.printStackTrace();
        }  
    }
}
