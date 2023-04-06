/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.java.fetch.data.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
/**
 *
 * @author Futuremind
 */
public class Fetch_User_Servlet extends HttpServlet{
    private static final long serialVersionUID = 1L;
       
   
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/icbt", "loan_admin", "asd@123");
		   
		    PreparedStatement ps = con.prepareStatement("select * from register");
		    
		    out.print("<table width=100% border=2>");
		    out.print("<caption><h1><b>USER DETAILS<b></h1></caption>");	
		    
		    ResultSet rs=ps.executeQuery();
		    
		    ResultSetMetaData rsmd = (ResultSetMetaData) rs.getMetaData();
		    int totalColumn = rsmd.getColumnCount();
		    out.print("<tr>");
		    for(int i=1; i<=totalColumn; i++) {
		    	out.print("<th>"+rsmd.getColumnName(i)+"</th>");
		    }
		    
		    out.print("<tr>");
		    while(rs.next()) {
		    	out.print("<tr><td>"+rs.getString(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+
		    			"</td><td>"+rs.getString(5)+"</td><td>"+rs.getString(6)+"</td></tr>");
		    }
		    out.print("</table>");
		    
		    
		}catch (Exception e) {
			out.print(e);			
		}
		
	}
}
