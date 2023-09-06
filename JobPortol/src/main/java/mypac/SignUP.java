package mypac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class login
 */
@WebServlet("/SignUP")
public class SignUP extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//create query;
	private static final String INSERT_QUERY="INSERT INTO SIGNUP VALUES(?,?,?,?)";
	
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SignUP() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest Req, HttpServletResponse Res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		//get PrinterWriter
		PrintWriter pw=Res.getWriter();
		// set content type 
		Res.setContentType("text/HTML");
		// read the from values 
		String name =Req.getParameter("name");
		String email =Req.getParameter("email");
		String password =Req.getParameter("password");
		String role =Req.getParameter("role");
		
		System.out.println("name:- "+name);
		System.out.println("email:- "+email);
		System.out.println("password:- "+password);
		System.out.println("role:- "+role);
		
		//load jdbc connection;
		try {
			Class.forName ("com.mysql.jdbc.Driver");
			} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			}
		//create the connection
		try (Connection con = DriverManager.getConnection ("jdbc:mysql://localhost:2708/jobportol","root","@Suar2708!");
		PreparedStatement ps = con.prepareStatement(INSERT_QUERY);){
			//SET VALUES
			ps.setString(1, name);
			ps.setString(2, email);
			ps.setString(3, password);
			ps.setString(4, role);
			
			//execute sql query 
			int count = ps.executeUpdate();
			if(count==0) {
				pw.println("Try again!!!");
			}else {
				pw.println("Sign-UP sucessfully!!!");
			}
			
		}catch(SQLException se) {
		pw.println(se.getMessage());
		se.printStackTrace();
		}catch(Exception e) {
		pw.println(e.getMessage());
		e.printStackTrace();
		}
		
		//close stream;
		pw.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
