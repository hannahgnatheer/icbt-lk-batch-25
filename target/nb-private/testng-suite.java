/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.java.auth.login.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Futuremind
 */
public class Admin_login_Servlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
       
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		try {
			PrintWriter out=response.getWriter();
			response.setContentType("text/html");
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/loan?allowPublicKeyRetrieval=true&useSSL=false", "root", "root");
		    String n=request.getParameter("admin_id");
		    String p=request.getParameter("password");
		    PreparedStatement ps = con.prepareStatement("select admin_id from admin where admin_id=? and password=?");
		    ps.setString(1, n);
		    ps.setString(2, p);
		    ResultSet rs=ps.executeQuery();
		    if(rs.next()) {
		    	RequestDispatcher rd=request.getRequestDispatcher("admin.jsp");
		    	rd.forward(request, response);
		    }
		    else {
		    	out.println("<h1>Login failed !!<h1>");
		    }
		}catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			
			e.printStackTrace();
		};
		
	}
}
