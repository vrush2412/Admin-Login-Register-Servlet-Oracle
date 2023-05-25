
package HomeSer;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.RegisterHere;
import linkcodeServices.RegisterHereImpl;
//import .Register;
//import jdk.vm.ci.code.Register;

/**
 * Servlet implementation class RegisterController
 */
@WebServlet("/RegisterController")
public class RegisterController extends HttpServlet {
	//private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String regno=request.getParameter("regno");
		String fname=request.getParameter("fname");
		String mobno=request.getParameter("mobno");
		String uname=request.getParameter("uname");
		String pass=request.getParameter("pass");
		String amount=request.getParameter("Amount");
		
		RegisterHere reg=new RegisterHere(Integer.parseInt(regno), fname, mobno, uname, pass, Double.parseDouble(amount));
		List<RegisterHere>lst=new ArrayList<RegisterHere>();
		lst.add(reg);
		
		RegisterHereImpl rdao=new RegisterHereImpl();
		int i=rdao.createRecord(lst);
		if(i>0) {
			response.sendRedirect("Login.jsp");
			}
		else {
			response.sendRedirect("Home.jsp");
		}
				
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
