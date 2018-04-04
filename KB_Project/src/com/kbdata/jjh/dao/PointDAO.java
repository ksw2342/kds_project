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
import com.kbdata.jjh.model.User;

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
   public void insertPoint(Point newPoint) throws SQLException{
      // TODO Auto-generated method stub
	   System.out.println("insertPoint() 호출됨");
   
      int u_id = newPoint.getU_id(); 
      int a_num = newPoint.getA_num();
      int cardnum = newPoint.getCardnum(); 
      String a_date = newPoint.getA_date();
      String a_time = newPoint.getA_time();
      int mem_store_num = newPoint.getMem_store_num(); 
      String division = newPoint.getDivision();
      int point = newPoint.getPoint();
      
      System.out.println("getPrevPoint()");
      int prev_point = getPrevPoint(u_id);
      
      System.out.println("prev_point : " + prev_point);
      int after_point = 0;
      
      if(division.equals("00")) {//차감
         after_point = prev_point - point;
         updateUserPoint(u_id, after_point);
         System.out.println("결과 : "+ point +"원 차감 후 " + after_point);

      }else { //복원
         after_point = prev_point + point;
         updateUserPoint(u_id, after_point);
         System.out.println("결과 : "+ point +"원 복원 후 " + after_point);
      }
      
      //포인트 테이블에는 계산없이 insert
      String sql ="insert into point(u_id, a_num, cardnum, a_date, a_time, mem_store_num, division, point) "
      		+ "values( '"+u_id+"' , '"+a_num+"', '"+cardnum+"', '"+a_date+"', '"+a_time+"', '"+mem_store_num+"', '"+division+"', '"+point+"')";
      
      connect();
      
      Statement statement = jdbcConnection.createStatement();
      statement.execute(sql);
      
      System.out.println("Point Inserted");
      
   }
   
   private void updateUserPoint(int user_id, int after_point) throws SQLException {
      // TODO Auto-generated method stub
      String sql = "UPDATE User SET point = '"+after_point+"' WHERE u_id = '"+user_id+"' ";
      
      connect();
      
      Statement statement = jdbcConnection.createStatement();
      statement.executeUpdate(sql);

      statement.close();
      disconnect();
            
   }
   
   public int getPrevPoint(int user_id) throws SQLException {
      String sql = "SELECT point FROM user WHERE u_id = '"+user_id+"'";
      
      int cur_point = 0;
      
      connect();
      
      Statement statement = jdbcConnection.createStatement();
      ResultSet resultSet = statement.executeQuery(sql);
      
      while (resultSet.next()) {
    	  System.out.println("hello");
    	  cur_point = resultSet.getInt("point");
      }
     
       System.out.println("user_id : " + user_id);
       System.out.println("cur_point : " + cur_point);

      return cur_point;
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
         String division = resultSet.getString("division");
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
               String division = resultSet.getString("division");
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
               String division = resultSet.getString("division");
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
               String division = resultSet.getString("division");
               int point = resultSet.getInt("point");
               
               Point Point = new Point(u_id, a_num, cardnum, a_date, a_time, mem_store_num, division, point);
               listPoint.add(Point);
            }
            
            return listPoint;
         }
         
     
      
     /* public boolean updateUserPoint2(int point) throws SQLException {
         String sql = "UPDATE User SET point = point+ ? WHERE Point_id = ?";
         connect();
         
         PreparedStatement statement = jdbcConnection.prepareStatement(sql);
         statement.setString(1, point.getTitle());

         
         boolean rowUpdated = statement.executeUpdate() > 0;
         statement.close();
         disconnect();
         return rowUpdated;      
      }
      
         */
      
         
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
   
   
   

}