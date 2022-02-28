package ca.com.crud.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.spi.DirStateFactory.Result;

import ca.com.crud.factory.ConnectionFctory;
import ca.com.crud.model.Contact;

public class ContactDao {
	// Method created to "save" the data coming from SQL Server DB
	public void save (Contact contact) {
		// Assign the SQL Server QUERY code in a variable String
		String sql = "INSERT INTO Contacts(ContactName, Age, RegistrationDate)" + "VALUES(?, ?, ?)";
		
		// Create a null connection variable
		Connection conn = null;
		// Create a staging variable null 
		PreparedStatement pstm = null;
		
		// Here we put the codes to save in SQL database 
		try {
			// This method was created at "public class ConnetionFactory". Assign it to variable
			conn = ConnectionFctory.createConnectionSQLServer();
			
			// String declaration coming from "SQL Server DB" assign in a variable
			pstm = conn.prepareStatement(sql);
			
			// Add first value fetched from SQL Contacts table = ContactName
			pstm.setString(1, contact.getContactName());
			
			// Add second values fetched from SQL Contacts table = Age
			pstm.setInt(2, contact.getAge());
			
			// Add third value fetched from SQL Contacts table = RegistrationDate of type Date
			pstm.setDate(3, new Date(contact.getRegistrationDate().getTime()));
			
			// Method to execute the complete query String coming from SQL Server
			pstm.execute();
			
		} catch (Exception e) {
			e.printStackTrace();
			// Here we use a method to close the connections
		} finally {
			try {
				if (pstm != null) { // If variable PSTM is different from null, then close connection
					pstm.close();
				}
				if (conn != null) { // If variable CONN is different from null, then close connection
					conn.close();
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
	}
	
	// Crate a list method to contacts
	public List<Contact> getContacts() {
		// Assign the SQL Server SELECT code in a variable String
		String sql = "SELECT * FROM Contacts";
		
		List<Contact> contacts = new ArrayList<Contact>();
		
		Connection conn = null;
		PreparedStatement pstm = null;
		
		ResultSet rset = null;
		
		try {
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
			try {
				
				if (rset != null) {
					rset.close();
				}
				if (pstm != null) {
					pstm.close();
				}
				if (conn != null) {
					conn.close();
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return contacts;
	}
}
