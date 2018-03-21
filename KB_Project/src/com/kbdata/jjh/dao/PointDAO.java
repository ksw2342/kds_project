package com.kbdata.jjh.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.kbdata.jjh.model.Point;

public class PointDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private Connection jdbcConnection;
	
	public PointDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}
	
	protected void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(
										jdbcURL, jdbcUsername, jdbcPassword);
		}
	}
	
	protected void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	//포인트 사용내역 등록
	public boolean insertPoint(Point point) throws SQLException {
		String sql = "INSERT INTO Point (u_id, a_num, cardnum, a_date, a_time, mem_store_num, division, point) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, point.getU_id());
		statement.setInt(2, point.getA_num());
		statement.setInt(3, point.getCardnum());
		statement.setString(4, point.getA_date());
		statement.setString(5, point.getA_time());
		statement.setInt(6, point.getMem_store_num());
		statement.setInt(7, point.getDivision());
		statement.setInt(8, point.getPoint());

		
		boolean rowInserted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	//전체 포인트원장 조회
	public List<Point> listAllPoints() throws SQLException {
		List<Point> listPoint = new ArrayList<>();
		
		String sql = "SELECT * FROM Point";
		
		connect();
		
		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		
		while (resultSet.next()) {
			int u_id = resultSet.getInt("u_id");
			int a_num = resultSet.getInt("a_num");
			int cardnum = resultSet.getInt("cardnum");
			String a_date = resultSet.getString("a_date");
			String a_time = resultSet.getString("a_time");
			int mem_store_num = resultSet.getInt("mem_store_num");
			int division = resultSet.getInt("division");
			int point = resultSet.getInt("point");

			
			Point Point = new Point(u_id, a_num, cardnum, a_date, a_time, mem_store_num, division, point);
			listPoint.add(Point);
		}
		
		return listPoint;
	}
	   public List<Point> listPointByDate(String start, String end) throws SQLException {
		      List<Point> listPoint = new ArrayList<>();
		      String sql = "select * from point"+ " where a_date between '"+start+"' and '"+end+"'";
		      
		      connect();
		      
		      Statement statement = jdbcConnection.createStatement();
		      ResultSet resultSet = statement.executeQuery(sql);
		      
		      while (resultSet.next()) {
		         int u_id = resultSet.getInt("u_id");
		         int a_num = resultSet.getInt("a_num");
		         int cardnum = resultSet.getInt("cardnum");
		         String a_date = resultSet.getString("a_date");
		         String a_time = resultSet.getString("a_time");
		         int mem_store_num = resultSet.getInt("mem_store_num");
		         int division = resultSet.getInt("division");
		         int point = resultSet.getInt("point");
		         
		         Point Point = new Point(u_id, a_num, cardnum, a_date, a_time, mem_store_num, division, point);
		         listPoint.add(Point);
		      }
		      
		      return listPoint;
		   }
		   
		   public List<Point> listPointById(String uid) throws SQLException {
		      List<Point> listPoint = new ArrayList<>();
		      String sql = "select * from point where u_id = "+uid;
		      
		      connect();
		      
		      Statement statement = jdbcConnection.createStatement();
		      ResultSet resultSet = statement.executeQuery(sql);
		      
		      while (resultSet.next()) {
		         int u_id = resultSet.getInt("u_id");
		         int a_num = resultSet.getInt("a_num");
		         int cardnum = resultSet.getInt("cardnum");
		         String a_date = resultSet.getString("a_date");
		         String a_time = resultSet.getString("a_time");
		         int mem_store_num = resultSet.getInt("mem_store_num");
		         int division = resultSet.getInt("division");
		         int point = resultSet.getInt("point");
		         
		         Point Point = new Point(u_id, a_num, cardnum, a_date, a_time, mem_store_num, division, point);
		         listPoint.add(Point);
		      }
		      
		      return listPoint;
		   }
		   
		   public List<Point> listPointByIdAndDate(String uid, String start, String end) throws SQLException {
		      List<Point> listPoint = new ArrayList<>();
		      String sql = "select * from point where u_id = '"+uid+"' and a_date between '"+start+"' and '"+end+"'";
		      
		      connect();
		      
		      Statement statement = jdbcConnection.createStatement();
		      ResultSet resultSet = statement.executeQuery(sql);
		      
		      while (resultSet.next()) {
		         int u_id = resultSet.getInt("u_id");
		         int a_num = resultSet.getInt("a_num");
		         int cardnum = resultSet.getInt("cardnum");
		         String a_date = resultSet.getString("a_date");
		         String a_time = resultSet.getString("a_time");
		         int mem_store_num = resultSet.getInt("mem_store_num");
		         int division = resultSet.getInt("division");
		         int point = resultSet.getInt("point");
		         
		         Point Point = new Point(u_id, a_num, cardnum, a_date, a_time, mem_store_num, division, point);
		         listPoint.add(Point);
		      }
		      
		      return listPoint;
		   }
		   
	/*public boolean deletePoint(Point Point) throws SQLException {
		String sql = "DELETE FROM Point where Point_id = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, Point.getId());
		
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;		
	}*/
	
	/*public boolean updatePoint(Point Point) throws SQLException {
		String sql = "UPDATE Point SET title = ?, author = ?, price = ?";
		sql += " WHERE Point_id = ?";
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setString(1, Point.getTitle());
		statement.setString(2, Point.getAuthor());
		statement.setFloat(3, Point.getPrice());
		statement.setInt(4, Point.getId());
		
		boolean rowUpdated = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowUpdated;		
	}*/
	
	/*public Point getPoint(int id) throws SQLException {
		Point Point = null;
		String sql = "SELECT * FROM Point WHERE Point_id = ?";
		
		connect();
		
		PreparedStatement statement = jdbcConnection.prepareStatement(sql);
		statement.setInt(1, id);
		
		ResultSet resultSet = statement.executeQuery();
		
		if (resultSet.next()) {
			String title = resultSet.getString("title");
			String author = resultSet.getString("author");
			float price = resultSet.getFloat("price");
			
			Point = new Point(id, title, author, price);
		}
		
		resultSet.close();
		statement.close();
		
		return Point;
	}*/
}
