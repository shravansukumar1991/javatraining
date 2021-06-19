package training;
import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Loan_Approval1 {
	public static void main(String[] args) throws IOException {
	try {
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","pragatha");
		    Statement stmt = con.createStatement();
		                                                    
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    System.out.println("Enter name:");
		    String name = br.readLine();
		    String q="select * from Loan_Approval1 where name='"+name+"'";
		 
			
			ResultSet rs=stmt.executeQuery(q);
			if(rs.next())
			{
				System.out.println(rs.getString(1)+ " " +rs.getInt(2));
				   System.out.println("Enter Loan amount");
				   BufferedReader br1 = new BufferedReader(new InputStreamReader(System.in));
				   int loan = Integer.parseInt(br1.readLine());
				   
			   if(loan<3*12*rs.getInt(2)) {
			                                                     
			    System.out.println(name + " Loan Approved");
			}
			   else {
				   System.out.println(name + " Loan NOT Approved");
			   }}
			   
			else
			{
				System.out.println("Record Not Found...");
			}
			

		    stmt.close();
		    con.close();
		   }
		     catch(Exception e) {
		    	 System.out.println(e);
		    	 
		     }
	
		 }
}
