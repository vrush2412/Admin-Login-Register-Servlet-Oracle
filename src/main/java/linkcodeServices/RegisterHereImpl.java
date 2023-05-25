package linkcodeServices;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import Model.LoginPage;

//import javax.sql.DataSource;

import Model.RegisterHere;

import linkcodeds.DataSource;

public class RegisterHereImpl  {
	DataSource dsa=new DataSource();
   
   public int createRecord(List<RegisterHere>lst)
   {
	   RegisterHere reg=lst.get(0);
	   int i=0;
	   Connection con=dsa.getConnection();
	   
	   try {
		PreparedStatement pstate=con.prepareStatement("insert into  linkcodebank values(?,?,?,?,?,?)");
		   pstate.setInt(1,reg.getRegno());
		   pstate.setString(2,reg.getFname());
		   pstate.setString(3,reg.getMobNo());
		   pstate.setString(4,reg.getUname());
		   pstate.setString(5,reg.getPass());
		   pstate.setDouble(6,reg.getAmount() );
		   
		   i=pstate.executeUpdate();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	return i;
	  
   }
   public int updateRecord(List<RegisterHere>lst) {
		  int i=0;
		RegisterHere  Rtemp=null;
		  Connection con=dsa.getConnection();
		       try {
				PreparedStatement pstate=con.prepareStatement("update linkcodebank set fname=? where regno=?");
				   Rtemp=lst.get(0);
				   pstate.setString(1,Rtemp.getFname());
				   pstate.setInt(2,Rtemp.getRegno());
				   lst.add(Rtemp);
				   i=pstate.executeUpdate();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 return i;
	  } 
//   public   List<RegisterHere> searchRecord(String regno1){
//		  int i=0;
//		  Connection con=dsa.getConnection();
//		
//		  List<RegisterHere> lst1=null;
//		  
//		  try {
//		  PreparedStatement pstate=con.prepareStatement("select * from linkcodebank where regno1=?");
//		  pstate.setString(1, regno1);
//		  ResultSet rs=pstate.executeQuery();
//		 
//		  if(rs.next()) {
//			 lst1=new ArrayList<RegisterHere>();
//			 regno1=rs.getString(i);
//			 String fna =rs.getString(2);
//			 String mob=rs.getString(3);
//			 String una=rs.getString(4);
//			 String pass=rs.getString(5);
//			 double amt=rs.getDouble(6);
//			 RegisterHere rher=new RegisterHere(Integer.parseInt(regno1), fna, mob, una, pass, amt);
//			lst1.add(rher); 
//		     }
//		  }
//		  catch (Exception e) {
//				// TODO Auto-generated catch block
//			  System.out.println(e);
//				e.printStackTrace();
//			
//		  }
//		  return lst1;
//}
}
//public List<Employee> searchRecord(int eid){
//	  int i=0;
//	  //Connection con=DBConnection.getConnection();
//	  List<Employee> lst=null;
//	  
//	  try {
//	  PreparedStatement pstate=con.prepareStatement("select * from employeedb where empid=?");
//	  pstate.setInt(1,eid);
//	  ResultSet rs=pstate.executeQuery();
//	 
//	  if(rs.next()) {
//		 lst=new ArrayList<Employee>();
//		 eid=rs.getInt(1);
//		 String emn =rs.getString(2);
//		 double sal=rs.getDouble(3);
//		 Employee etemp=new Employee(eid,emn,sal);
//		lst.add(etemp); 
//	     }
//	  }
//	  catch (Exception e) {
//			// TODO Auto-generated catch block
//		  System.out.println(e);
//			e.printStackTrace();
//		
//	  }
//	  return lst;