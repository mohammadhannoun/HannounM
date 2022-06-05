package model;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;
import javax.sql.DataSource;

public class RefugeeModel{
	public LinkedList<Refugee> listRfugees(DataSource dataSource, String query){
		LinkedList<Refugee> refugeesList = new LinkedList<Refugee>();
		
		Connection connect = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		
		try {
			
			connect = dataSource.getConnection();
			
			String query_ = query;
			
			stmt = connect.createStatement();
			
			rs = stmt.executeQuery(query_);
			
			while(rs.next()) {
				refugeesList.add(new Refugee
					    (rs.getString("refugee_id"), 
						rs.getString("first_name"),
						rs.getString("last_name"),
						rs.getString("email"),
						rs.getString("phone_number"),
						rs.getString("pass"),
						rs.getString("birth_date")
						));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return refugeesList;
	}
	
	public void addRfugees(DataSource dataSource, Refugee refugee) {
		Connection connect = null;
		
		PreparedStatement stmt = null;
		
		try {
			
			connect = dataSource.getConnection();
					
			stmt = connect.prepareStatement("INSERT INTO refugee (refugee_id, first_name, last_name, email, phone_number, pass, birth_date) VALUES (?, ?, ?, ?, ?, ?, ?)");
			
			stmt.setString(1, refugee.getRefugeeId());
			stmt.setString(2, refugee.getFirstName());
			stmt.setString(3, refugee.getLastName());
			stmt.setString(4, refugee.getEmail());
			stmt.setString(5, refugee.getPhoneNumber());
			stmt.setString(6, refugee.getPassword());
			stmt.setString(7, refugee.getBirthDate());
			stmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	public void updateRfugeeInfo(DataSource dataSource, Refugee refugee) {
		Connection connect = null;
		
		PreparedStatement stmt = null;
		
		try {
			connect = dataSource.getConnection();
					
			stmt = connect.prepareStatement("UPDATE refugee SET first_name=?, last_name=?, email=?, phone_number=?, pass=?, birth_date=? WHERE refugee_id = '"+refugee.getRefugeeId()+"'");
			
			stmt.setString(1, refugee.getFirstName());
			stmt.setString(2, refugee.getLastName());
			stmt.setString(3, refugee.getEmail());
			stmt.setString(4, refugee.getPhoneNumber());
			stmt.setString(5, refugee.getPassword());
			stmt.setString(6, refugee.getBirthDate());
			stmt.execute();
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
		
}
