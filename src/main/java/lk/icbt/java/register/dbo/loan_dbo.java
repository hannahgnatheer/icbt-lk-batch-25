/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lk.icbt.java.register.dbo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import lk.icbt.java.register.funct.loan_funct;


/**
 *
 * @author Futuremind
 */
public class loan_dbo {
    public int registerLoan(loan_funct loan) throws ClassNotFoundException {
        String INSERT_USERS_SQL = "INSERT INTO loanrequest" +
            "  (id, fullname, customer_id, date_of_birth, product_category, brand, price, no_product, total_amount, advance_amount, balance_amount, no_instalment, amount_instalment, date_instalment) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?);";

        int result = 0;

        Class.forName("com.mysql.jdbc.Driver");

        try (Connection connection = DriverManager
            .getConnection("jdbc:mysql://localhost:3306/icbt", "loan_admin", "asd@123");

            // Step 2:Create a statement using connection object
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_USERS_SQL)) {
            preparedStatement.setInt(1, 0);
            preparedStatement.setString(2, loan.getFullname());
            preparedStatement.setString(3, loan.getCustomer_id());
            preparedStatement.setString(4, loan.getDate_of_birth());
            preparedStatement.setString(5, loan.getProduct_category());
            preparedStatement.setString(6, loan.getBrand());
            preparedStatement.setString(7, loan.getPrice());
            preparedStatement.setString(8, loan.getNo_product());
            preparedStatement.setString(9, loan.getTotal_amount());
            preparedStatement.setString(10, loan.getAdvance_amount());
            preparedStatement.setString(11, loan.getBalance_amount());
            preparedStatement.setString(12, loan.getNo_instalment());
            preparedStatement.setString(13, loan.getDate_instalment());
            

            System.out.println(preparedStatement);
            // Step 3: Execute the query or update query
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
