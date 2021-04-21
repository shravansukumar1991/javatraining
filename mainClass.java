package demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class mainClass extends employee_details {
	
	
	
    public static void main(String[] args) {
    	int count = 0;
    	employee_details empList[] = {};
    	
    	empList = new employee_details[7];
    	Scanner sc = null;
    	try {
    		sc = new Scanner(new File("C:\\Users\\friss\\Desktop\\Emploees.txt"));

     
    		while(sc.hasNextLine()){
    			String str = sc.nextLine();
       
    			parseData(str, count, empList);
    			count++;
    	}
    		for(int i=0;i<count;i++) {
    	empList[i].printEmployeeDetails ();		
    		}
    	
    } catch (IOException  exp) {
   
    	exp.printStackTrace();
    } finally {
    	if(sc != null)
    		sc.close();
    }	  		
  }
	
  private static void parseData(String str, int count, employee_details empList[]){	
    String EmployeeName, EmployeeGender, EmployeeDOB,EmployeeBG;
  
    Scanner lineScanner = new Scanner(str);
    
    lineScanner.useDelimiter(",");
    while(lineScanner.hasNext()){
    	EmployeeName = lineScanner.next();
    	EmployeeGender = lineScanner.next();
    	EmployeeDOB = lineScanner.next();
    	EmployeeBG = lineScanner.next();
    	
    	empList[count]=new employee_details();
    	empList[count].setEmployeeDetails(EmployeeName, EmployeeGender, EmployeeDOB, EmployeeBG);  
    }
    
    lineScanner.close();
  }
}