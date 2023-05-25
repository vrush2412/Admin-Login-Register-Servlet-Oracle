package HomeSer;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Model.Adminlogin;
import linkcodeServices.AdminloginImpl;
///import linkcodeServices.LoginImpl;

/**
 * Servlet implementation class AdminloginSer
 */
@WebServlet("/AdminloginSer")
public class AdminloginSer extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminloginSer() {
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
  
        
        String uname = request.getParameter("uname");
        String password = request.getParameter("Pass");
        
        Adminlogin aobj= new Adminlogin();
        //AdminloginImpl log=new AdminloginImpl();
          aobj.setUname(uname);
          aobj.setPassword(password);

         // boolean b=log.Validateuser(aobj);
          if(uname.equals("Admin")) {
        	  
          
          if(password.equals("Admin")) {
        	  response.sendRedirect("AdminD.jsp");
        	  out.println("Welcome to admin dashboard"); 
          }
          }
          else {
        	  response.sendRedirect("Home.jsp");
          }
          
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
