package mypac;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class login extends HttpServlet {
    private static final long serialVersionUID = 1L;

    // JDBC URL, username, and password
    private static final String JDBC_URL = "jdbc:mysql://localhost:2708/jobporotl";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "@Suar2708!";

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String email = request.getParameter("email");
        String password = request.getParameter("password");
        String role = request.getParameter("role");

        try (Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:2708/jobportol","root","@Suar2708!")) {
            String query = "SELECT * FROM SignUp WHERE email = ? AND password = ? AND role = ?";
            PreparedStatement preparedStatement = connection.prepareStatement(query);
            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, role);
            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                // Successful login
            	String successMessage = "Login successful!";
                response.sendRedirect("success.jsp?message=" + successMessage);
                response.sendRedirect("success.jsp");
            } else {
                // Invalid login
                response.sendRedirect("failure.jsp");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            // Handle database connection errors
            response.sendRedirect("error.jsp");
        }
    }
}
