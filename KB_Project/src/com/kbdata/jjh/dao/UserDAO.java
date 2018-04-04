package com.kbdata.jjh.dao;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.json.JSONStringer;

import com.kbdata.jjh.model.User;

public class UserDAO {
	private String jdbcURL;
	private String jdbcUsername;
	private String jdbcPassword;
	private java.sql.Connection jdbcConnection;
	
	public UserDAO() {
		super();
	}
	
	public UserDAO(String jdbcURL, String jdbcUsername, String jdbcPassword) {
		this.jdbcURL = jdbcURL;
		this.jdbcUsername = jdbcUsername;
		this.jdbcPassword = jdbcPassword;
	}

	public void connect() throws SQLException {
		if (jdbcConnection == null || jdbcConnection.isClosed()) {
			try {
				Class.forName("org.mariadb.jdbc.Driver");
			} catch (ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
		}
	}

	public void disconnect() throws SQLException {
		if (jdbcConnection != null && !jdbcConnection.isClosed()) {
			jdbcConnection.close();
		}
	}
	
	
	public List<User> listAllUser() throws SQLException{
		List<User> listUser = new ArrayList<>();
		String sql = "select u_id, id, name, phone, regi_date, cast(card_num as character) as card_num, point from user";
		
		connect();

		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int u_id = resultSet.getInt("u_id");
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");
			String phone = resultSet.getString("phone");

			Date regi_date = resultSet.getDate("regi_date");
			String card_num = resultSet.getString("card_num");
			int point = resultSet.getInt("point");
			
			User user = new User(u_id,id,name,phone,regi_date,card_num,point);

			listUser.add(user);
		}

		return listUser;
	}

	public List<User> listUserByDate(String start, String end) throws SQLException {
		List<User> listUser = new ArrayList<>();

		String sql = "select u_id, id, name, phone, regi_date, cast(card_num as character) as card_num, point from user"
				+ " where regi_date between '"+start+"' and '"+end+"'";
		
		connect();

		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int u_id = resultSet.getInt("u_id");
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");
			String phone = resultSet.getString("phone");
			Date regi_date = resultSet.getDate("regi_date");
			String card_num = resultSet.getString("card_num");
			int point = resultSet.getInt("point");
			
			User user = new User(u_id,id,name,phone,regi_date,card_num,point);

			listUser.add(user);
		}

		return listUser;
	}

	public void insertUser(User newUser) throws SQLException {
		// TODO Auto-generated method stub
		String id = newUser.getId();
		String name = newUser.getName();
		String phone = newUser.getPhone();
		String sql ="insert into user(id,name,phone,regi_date,card_num,point) values('"+id+"','"+name+"','"+phone+"',curdate(),4037111111111111 + RAND() * 888888888888,10000000)";
		
		connect();

		Statement statement = jdbcConnection.createStatement();
		statement.execute(sql);
	}

	public User getUserByUid(int uid) throws SQLException {
		User user = null;
		String sql = "select u_id, id, name, phone, regi_date, cast(cardnum as character) as card_num, point from user"
				+ " where u_id = " + uid;

		connect();

		Statement statement = jdbcConnection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);

		while (resultSet.next()) {
			int u_id = resultSet.getInt("u_id");
			String id = resultSet.getString("id");
			String name = resultSet.getString("name");
			String phone = resultSet.getString("phone");
			String regi_date = resultSet.getString("regidate");
			String card_num = resultSet.getString("card_num");
			int point = resultSet.getInt("point");

			user = new User(u_id, id, name, phone, regi_date, card_num, point);
			
		}
		
		return user;
	}

}
