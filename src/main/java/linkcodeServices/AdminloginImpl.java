package linkcodeServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import Model.Adminlogin;
import Model.LoginPage;
//import Model.RegisterHere;
import linkcodeds.DataSource;

public class AdminloginImpl {
	DataSource dsa=new DataSource();
	
//	public boolean Validateuser(LoginPage lobj)
//	   {
//		   Connection con=dsa.getConnection();
//	   int i=0;
//		   boolean b=false;
//		   try {
//		  PreparedStatement pstate=con.prepareStatement("select * from linkcodebank where u_name=? and password=?");
//		  pstate.setString(1,lobj.getU_name());
//		  pstate.setString(2,lobj.getPass());
//		   ResultSet rs=pstate.executeQuery();
//		   if(rs.next()) {
//			   b=true;
//			   
//		   }
//	   public int insertRecord(List<Adminlogin>lst)
//	   {
//		    Adminlogin adm=lst.get(0);
//		   int i=0;
//		   Connection con=dsa.getConnection();
//		   
//		   try {
//			PreparedStatement pstate=con.prepareStatement("insert into  Adminbank values(?,?)");
//			   pstate.setString(1,adm.getUname());
//			   pstate.setString(2,adm.getPassword());
//			   i=pstate.executeUpdate();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		return i;
//		  
	   //00}
}
