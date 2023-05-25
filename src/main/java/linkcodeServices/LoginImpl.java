package linkcodeServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.apache.catalina.util.ResourceSet;

import Model.LoginPage;
import Model.RegisterHere;

import linkcodeds.DataSource;
//import oracle.jdbc.util.Login;

public class LoginImpl {
	DataSource dsa=new DataSource();
	   
	   public boolean Validateuser(LoginPage lobj)
	   {
		   Connection con=dsa.getConnection();
	   int i=0;
		   boolean b=false;
		   try {
		  PreparedStatement pstate=con.prepareStatement("select * from linkcodebank where u_name=? and password=?");
		  pstate.setString(1,lobj.getU_name());
		  pstate.setString(2,lobj.getPass());
		   ResultSet rs=pstate.executeQuery();
		   if(rs.next()) {
			   b=true;
			   
		   }
//		   String uname="";
//		   String passward="";
//		   try {
//			   Connection con=dsa.getConnection();
//			   statement=con.createStatement();
//					 Resultset=  
//					   
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return b;
		  
	   }
	  
}
