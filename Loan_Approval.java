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
public class Loan_Approval {
	public static void main(String[] args) throws IOException {
		try {
		 Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
		    Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/demodb","root","pragatha");
		    Statement stmt = con.createStatement();
		                                                    
		    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		    System.out.println("Enter name:");
		    String name = br.readLine();

		    System.out.println("Enter Monthly salary:");
		    int salary = Integer.parseInt(br.readLine());
		   
		    stmt.executeUpdate("insert into Loan_Approval1(Name,salary) values('"+name+"','"+salary+"')");
		                                                     
		    System.out.println(name + " record inserted");

		    stmt.close();
		    con.close();
		   }
		     catch(Exception e) {
		    	 System.out.println(e);
		    	 
		     }
	
		 }
}
