package HomeSer;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Model.RegisterHere;
import linkcodeServices.RegisterHereImpl;

/**
 * Servlet implementation class UserInterface
 */
@WebServlet("/UserInterface")
public class UserInterface extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserInterface() {
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
		PrintWriter out = response.getWriter();
		RegisterHere reg=new RegisterHere(Integer.parseInt(regno), fname);
		List<RegisterHere>lst=new ArrayList<RegisterHere>();
		lst.add(reg);
		
		RegisterHereImpl rdao=new RegisterHereImpl();
		int i=rdao.updateRecord(lst);
		reg.getRegno();
		reg.getFname();
		
		if(regno.equals(regno)) {
		response.sendRedirect("Home.jsp");
	}
//		String regno1=request.getParameter("regno");
//		RegisterHere rg=new RegisterHere(Integer.parseInt(regno), fname);
//		List<RegisterHere>lst1=new ArrayList<RegisterHere>();
//		lst1.add(reg);
//		
//		RegisterHereImpl rda=new RegisterHereImpl();
//		lst1=rda.searchRecord(regno1);
//		//List<RegisterHere> j=rda.searchRecord(regno1);
//
//    	 if(lst1!=null) {
//  			RegisterHere rtemp=lst1.get(0);
//			out.println(rtemp.getRegno()+"\t"+rtemp.getFname()+"\t"+rtemp.getMobNo()+"\t"+rtemp.getUname()+"\t"+rtemp.getPass()+"\t"+rtemp.getAmount());
//			}
//		 else {
//			 System.out.println("Invalid Employee id....");
//		 }
//		 break;
//	 case 5:
//		 lst=edao.DisplayAllRecords();
//		 System.out.println("--------------------your Data Is Displayed here---------------------");
//		 
//		 for(int j=0;j<lst.size();j++) {
//			 etemp=lst.get(j);
//			 System.out.println(etemp.getEmpid()+"\t"+etemp.getEmpname()+"\t"+etemp.getSalary());
//		 }
//		 System.out.println("----------------------------------------------------------------------");
//		 break;
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