package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.LinkedList;

import javax.sql.DataSource;

public class VideoModel {
	
	public LinkedList<Video> listVideos(DataSource dataSource, String query){
		LinkedList<Video> videosList = new LinkedList<Video>();
		
		Connection connect = null;
		
		Statement stmt = null;
		
		ResultSet rs = null;
		
		
		try {
			
			connect = dataSource.getConnection();
			
			stmt = connect.createStatement();
			
			rs = stmt.executeQuery(query);
			
			while(rs.next()) {
				videosList.add(new Video
					    (rs.getInt("video_id"),
						rs.getString("address"),
						rs.getString("category_name"),
						rs.getString("video_discription"),
						rs.getString("refugee_id")
						));
			}
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return videosList;
	}
	
	public void addVideo(DataSource dataSource, String address, String categoryName, String videpDescription, String refugeeIDFK) {
		Connection connect = null;
		
		PreparedStatement stmt = null;
		
		try {
			
			connect = dataSource.getConnection();
					
			stmt = connect.prepareStatement("INSERT INTO videos (address, category_name, video_discription, refugee_id) VALUES (?, ?, ?, ?)");
			
			stmt.setString(1, address);
			stmt.setString(2, categoryName);
			stmt.setString(3, videpDescription);
			stmt.setString(4, refugeeIDFK);

			stmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void removeVideo(DataSource dataSource, Integer videoId) {
		Connection connect = null;
		
		PreparedStatement stmt = null;
		
		try {
			
			connect = dataSource.getConnection();
					
			stmt = connect.prepareStatement("DELETE FROM videos WHERE video_id=?");
			
			stmt.setInt(1, videoId);
	
			stmt.execute();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
