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

	// Json �����͸� �׸���� ��ȯ�ϴ� ���� �޼ҵ�
	public String doExecute(HttpServletRequest request, HttpServletResponse response)
	    throws Exception
	    {	      
	        try
	        {        
	           
	            ArrayList<User> infoList  = (ArrayList<User>) dao.listAllUser();  // �׸��带 �ѷ��� ����Ʈ�� DB���� ������
	           
	            JSONObject jsonObject = new JSONObject();            // Json �����͸� ���� ��ü�� ����
	            JSONArray cell = new JSONArray();
	            User data = null;
	           
	            for(int i=0; i<infoList.size(); i++) {               // ����Ʈ�� �������� ������ �� ����
	                data = (User)infoList.get(i);          
	             
	                JSONObject obj = new JSONObject();
	               
	                // �׸��忡�� ���� ���� key�� ����
	                // Json ��ü�� ���� �����͸� �������� ����
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
	           
	            // ���ϰ��� �ݵ�� null ! ���ϰ��� �ָ� �׸��尡 �ν����� ����.
	            return null;
	 
	        }
	        finally
	        {
	 
	        }
	    }
	
}
