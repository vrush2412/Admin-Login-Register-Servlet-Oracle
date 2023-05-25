package HomeSer;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.RegisterHere;
import linkcodeServices.LoginImpl;
import linkcodeServices.RegisterHereImpl;
import linkcodeds.DataSource;

/**
 * Servlet implementation class LoginPage
 */
@WebServlet("/LoginPage")
public class LoginPage extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginPage() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		  
                                              
        HttpSession session = request.getSession();// Get the session object
  
        
        String uname = request.getParameter("u_name");
        String password = request.getParameter("Pass");
        
        Model.LoginPage lobj= new Model.LoginPage();
        LoginImpl log=new LoginImpl();
          lobj.setU_name(uname);
          lobj.setPass(password);
          
          boolean b=log.Validateuser(lobj);
          
       
        // Get User entered details from the request using request parameter.
       // DataSource dsa=new DataSource();
      // ResultSet resultSet = null;
		// String uname="";
		   //String passward="";
//		   try {
//			   Connection con=dsa.getConnection();
//			   statement=con.createStatement();
//					 Resultset=  
//					   
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
       // while(resultSet.next())
        	
        if (password.equals(password)) {
            session.setAttribute("u_name", uname);
            response.sendRedirect("Dashboard.jsp?name=" + uname);
        }
        // If the password is wrong, display the error message on the login page.
        else {
            RequestDispatcher rd = request.getRequestDispatcher("Login.jsp");
            out.println("<font color=red>Password is wrong.</font>");
            rd.include(request, response);
        }
        out.close();
      
         //Close the print writer object
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}
	// Validate the password - If password is correct, 
    // set the user in this session
    // and redirect to welcome page
}
