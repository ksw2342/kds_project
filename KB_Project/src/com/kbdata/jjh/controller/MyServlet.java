package com.kbdata.jjh.controller;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.List;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.goebl.david.Response;
import com.goebl.david.Webb;
import com.google.gson.*;


import com.kbdata.jjh.dao.PointDAO;
import com.kbdata.jjh.dao.UserDAO;
import com.kbdata.jjh.model.Point;
import com.kbdata.jjh.model.User;

@WebServlet("/MyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDao;
	private PointDAO pointDao;
	

	public void init() {
		
		String jdbcURL = getServletContext().getInitParameter("jdbcURL");
		String jdbcUsername = getServletContext().getInitParameter("jdbcUsername");
		String jdbcPassword = getServletContext().getInitParameter("jdbcPassword");

		userDao = new UserDAO(jdbcURL, jdbcUsername, jdbcPassword);
		pointDao = new PointDAO(jdbcURL, jdbcUsername, jdbcPassword);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getServletPath();
		
		
		try {
			switch (action) {
			case "/input":
				insertUser(request, response);
				break;
			case "/list":
				if (request.getParameter("start").isEmpty()) {
					listAllUser(request, response);
				} else {
					listUserByDate(request, response);
					System.out.println(request.getParameter("start") + " ~ " + request.getParameter("end"));
				}
				break;
			case "/point":
				if (request.getParameter("uid").isEmpty()) {
					if (request.getParameter("start").isEmpty()) {
						listAllPoint(request, response);
					} else {
						listPointByDate(request, response);
					}
				} 
				else {
					if (request.getParameter("start").isEmpty()) {
						listPointById(request, response);
					} else {
						listPointByIdAndDate(request, response);
					}
				}
				break;
			case "/reqUser":
				getRandUserByUid(request, response);
				break;
			case "/test":
				test(request,response);
				break;
			}
		} catch (SQLException ex) {
			throw new ServletException(ex);
		}
	}
	
	
	// TNDM �� �������� �޼ҵ� 
	private void test(HttpServletRequest request, HttpServletResponse response) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader input = new BufferedReader(new InputStreamReader(request.getInputStream()));
		StringBuilder builder = new StringBuilder();
		String buffer;
		while ((buffer = input.readLine()) != null) {
			if (builder.length() > 0) {
				builder.append("\n");
			}
			builder.append(buffer);
		}
		String jsonUser = builder.toString();
		System.out.println(jsonUser);
		Gson gson = new Gson();
		User user = gson.fromJson(jsonUser, User.class);
		System.out.println(user.getName());
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	private void getRandUserByUid(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException, SQLException {
		Random rand = new Random();
		int uid = rand.nextInt(8)+2000000;
		
		User user = userDao.getUserByUid(uid);
		
		gson gson = new Gson();
//		JSONObject jsonUser = new JSONObject(gson.toJson(user));
		String stringUser = gson.toJson(user);
		
		
		
		System.out.println(stringUser);

		Webb webb = Webb.create();
		Response<String> result = webb.post("http://192.168.0.40:8080/test/")
		    .useCaches(false)
		    .body(stringUser)
		    .asString();
		System.out.println(result.getBody());
	}
	
	private void listAllUser(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		
		List<User> listUser = userDao.listAllUser();
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/inqueryInputForm.jsp");
		dispatcher.forward(request, response);
	}

	private void listUserByDate(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String start = request.getParameter("start");
		String end = request.getParameter("end");

		List<User> listUser = userDao.listUserByDate(start, end);
		request.setAttribute("listUser", listUser);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/inqueryInputForm.jsp");
		dispatcher.forward(request, response);
	}
	
	private void insertUser(HttpServletRequest request, HttpServletResponse response) throws SQLException, IOException {
		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String phone = request.getParameter("phone");

		User newUser = new User(id, name, phone);
		userDao.insertUser(newUser);
	}

	private void listAllPoint(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		List<Point> listPoint = pointDao.listAllPoints();
		request.setAttribute("listPoint", listPoint);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/pointForm.jsp");
		dispatcher.forward(request, response);
	}

	private void listPointByDate(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String start = request.getParameter("start");
		String end = request.getParameter("end");

		List<Point> listPoint = pointDao.listPointByDate(start, end);
		request.setAttribute("listPoint", listPoint);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/pointForm.jsp");
		dispatcher.forward(request, response);
	}

	private void listPointById(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String uid = request.getParameter("uid");

		List<Point> listPoint = pointDao.listPointById(uid);
		request.setAttribute("listPoint", listPoint);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/pointForm.jsp");
		dispatcher.forward(request, response);
	}

	private void listPointByIdAndDate(HttpServletRequest request, HttpServletResponse response)
			throws SQLException, IOException, ServletException {
		String uid = request.getParameter("uid");
		String start = request.getParameter("start");
		String end = request.getParameter("end");

		List<Point> listPoint = pointDao.listPointByIdAndDate(uid, start, end);
		request.setAttribute("listPoint", listPoint);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/views/pointForm.jsp");
		dispatcher.forward(request, response);
	}
}
