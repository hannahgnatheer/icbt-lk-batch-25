/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.java.register.dbo;

import jakarta.servlet.annotation.WebServlet;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.icbt.java.register.funct.user_funct;

/**
 *
 * @author Futuremind
 */

public class user_dbo {
    public int registerUser(user_funct user) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO register" +
            "  (fullname, email, date_of_birth, username, password, confirm) VALUES " +
            " (?, ?, ?, ?,?,?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/icbt", "loan_admin", "asd@123");

            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {           
            preparedStatement.setString(1, user.getFullname());
            preparedStatement.setString(2, user.getEmail());
            preparedStatement.setString(3, user.getDateofbirth());
            preparedStatement.setString(4, user.getUsername());
            preparedStatement.setString(5, user.getPassword());
            preparedStatement.setString(6, user.getConfirm());

            System.out.println(preparedStatement);
      
            result = preparedStatement.executeUpdate();
            

        } catch (SQLException e) {            
            printSQLException(e);
        }
        return result;
    }
	private void printSQLException(SQLException ex) {
        for (Throwable e: ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
