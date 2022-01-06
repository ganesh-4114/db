package gani;
import java.sql.*;
public class MySqlCon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/FirstDb","root","root");  
			 
			
			if (con != null) {
				System.out.println("Connected");
			} else {
				System.out.println("Not Connected");
			}
			
			Statement stmt=con.createStatement();  
			
			 //inserting
//			System.out.println("Inserting records into the table...");          
//	         String sql = "INSERT INTO Employee VALUES ('E100243', 'Zara',18000, 'TechSupport', 1800)";
//	         stmt.executeUpdate(sql);
//	         sql = "INSERT INTO Employee VALUES ('E100253', 'Ganesh',18000, 'TechSupport', 1800)";
//	         stmt.executeUpdate(sql);
//	         
//	         ResultSet rs=stmt.executeQuery("select * from Employee");  
//				while(rs.next())  
//				System.out.println(rs.getString(1)+ "  " +rs.getString(2)+ " " + rs.getInt(3)+ " " + rs.getString(4) + " " + rs.getInt(5));  
//	         
	         //updating
	         
	     	System.out.println("Inserting records into the table..."); 
	     	String sql1 = "INSERT INTO REGISTRATION VALUES (11, 'Zara','TechSupport',18000)";
	         stmt.executeUpdate(sql1);
	         String sql2 = "INSERT INTO REGISTRATION VALUES (21, 'Zara1','TechSupport2',1800)";
	         stmt.executeUpdate(sql2);

	         
	        ResultSet rs2= stmt.executeQuery("select * from REGISTRATION");
	        while(rs2.next())  
				System.out.println(rs2.getInt(1)+ "  " +rs2.getString(2)+ " " + rs2.getString(3)+ " " + rs2.getInt(4));
	         
	        
	        //delete
	        String sql3 = "delete from REGISTRATION where id = 11";
	        stmt.executeUpdate(sql3);
	        ResultSet rs3 = stmt.executeQuery(sql3);
	        while(rs3.next())  
				System.out.println(rs3.getInt(1)+ "  " +rs3.getString(2)+ " " + rs3.getString(3)+ " " + rs3.getInt(4));
	        
	        System.out.println("Deleted Successfully");
	         con.close();
			}
		catch(Exception e){ System.out.println(e);}  
			}  
	
	
	}


