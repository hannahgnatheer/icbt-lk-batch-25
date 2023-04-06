/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.java.register.controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import lk.icbt.java.register.dbo.user_dbo;
import lk.icbt.java.register.funct.user_funct;

@WebServlet("/newregister")
/**
 *
 * @author Futuremind
 */

public class User_servlet extends HttpServlet  {
    private static final long serialVersionUID = 1L;
       
	private final user_dbo userdbo = new user_dbo();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("Register.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String fullname = request.getParameter("fullname");
        String email = request.getParameter("email");
        String date_of_birth = request.getParameter("date_of_birth");
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String confirm = request.getParameter("confirm");

        user_funct user = new user_funct();
        user.setFullname(fullname);
        user.setEmail(email);
        user.setDateofbirth(date_of_birth);
        user.setUsername(username);
        user.setPassword(password);
        user.setConfirm(confirm);

        try {
            userdbo.registerUser(user);
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
		dispatcher.forward(request, response);
	}
}
