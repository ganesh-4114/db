package gani;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement; 

public class InsertImage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{  
			Class.forName("com.mysql.cj.jdbc.Driver");  
			Connection con=DriverManager.getConnection(  
			"jdbc:mysql://localhost:3306/FirstDb","root","root");  
			if (con != null) {
				System.out.println("connection established");
			} else {
				System.out.println("not connected");
			}
			Statement stmt=con.createStatement();  
			PreparedStatement pstmt = con.prepareStatement("INSERT INTO IMGTABLE VALUES(?, ?)");
			pstmt.setString(1, "sample image");
			//Inserting Blob type
			InputStream in = new FileInputStream("C:\\Users\\ganeshcd\\Downloads\\download.jpg");
			pstmt.setBlob(2, in);  
			pstmt.executeUpdate();  
			 
			System.out.println(in+" records affected");  
			
			 ResultSet rs=stmt.executeQuery("select * from IMGTABLE");  
				while(rs.next())  
				System.out.println(rs.getString(1)+ "  " +rs.getBlob(2));  
			
			con.close();  
			}catch (Exception e) {e.printStackTrace();}  
			}  
			
		
	}


