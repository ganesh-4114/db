package gani;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement; 

public class Insert {

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
			FileInputStream in = new FileInputStream("C:\\Users\\ganeshcd\\Downloads\\curriculum 1.xlsx");
			pstmt.setBlob(2, in);  
			pstmt.execute(); 
			System.out.println(in+" records affected");  
			
			FileReader read = new FileReader("C:\\Users\\ganeshcd\\Downloads\\TextReader.txt");
			
			BufferedReader br = new BufferedReader(read);
			String st;
			 while ((st = br.readLine()) != null)
				 
		            // Print the string
		            System.out.println(st);
			 
			 BufferedReader br1 = new BufferedReader(new FileReader("C:\\Users\\ganeshcd\\Downloads\\curriculum 1.xlsx"));
			 String st1;
			 while ((st1 = br1.readLine()) != null)
				 
		            // Print the string
		            System.out.println(st1);
			 
			 
			 ResultSet rs=stmt.executeQuery("select * from IMGTABLE");  
				while(rs.next())  
				System.out.println(rs.getString(1)+ "  " +rs.getBlob(2));  
			
			con.close();  
			}catch (Exception e) {e.printStackTrace();}  
			}  
			
		
	}


