package com.kbdata.jjh.controller;

import java.util.ArrayList;
import java.util.Collection;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONObject;

import com.kbdata.jjh.dao.PointDAO;
import com.kbdata.jjh.dao.UserDAO;
import com.kbdata.jjh.model.User;

@WebServlet("/Json")
public class JsonServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;
	private UserDAO dao;
	
	public void init() {
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		dao = new UserDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}

	// Json 테이터를 그리드로 반환하는 서블릿 메소드
	public String doExecute(HttpServletRequest request, HttpServletResponse response)
	    throws Exception
	    {	      
	        try
	        {        
	           
	            ArrayList<User> infoList  = (ArrayList<User>) dao.listAllUser();  // 그리드를 뿌려줄 리스트를 DB에서 가져옴
	           
	            JSONObject jsonObject = new JSONObject();            // Json 데이터를 담을 객체들 생성
	            JSONArray cell = new JSONArray();
	            User data = null;
	           
	            for(int i=0; i<infoList.size(); i++) {               // 리스트를 돌려가며 데이터 빈에 저장
	                data = (User)infoList.get(i);          
	             
	                JSONObject obj = new JSONObject();
	               
	                // 그리드에서 읽을 값을 key로 지정
	                // Json 객체에 담을 데이터를 차곡차곡 저장
	                obj.put( "U_id" , data.getU_id());
	                obj.put( "id" , data.getId());
	                obj.put( "name" , data.getName());            
	                obj.put( "phone"  ,data.getPhone());
	                obj.put( "regidate" , data.getRegidate());
	                obj.put( "cardnum" , data.getCardnum());
	                obj.put( "point" ,  data.getPoint());
	                               
	             
	                cell.put(obj);  
	            }  
	           
	            jsonObject.put("rows", cell);
	            response.setContentType("application/x-json; charset=UTF-8");
	            response.getWriter().print(jsonObject);  System.out.println("### jsonObject : "+jsonObject);
	           
	            // 리턴값은 반드시 null ! 리턴값을 주면 그리드가 인식하지 못함.
	            return null;
	 
	        }
	        finally
	        {
	 
	        }
	    }
	
}
