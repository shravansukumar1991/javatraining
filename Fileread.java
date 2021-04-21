package demo;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Fileread{
    public static void main(String[] args) 
    {
    String path = "C:\\Users\\friss\\Desktop\\Employees.txt";
    String line = "";
    try {
		BufferedReader br = new BufferedReader(new FileReader(path));
		while((line=br.readLine()) != null) {
			System.out.println(line);
		}
			
		}
	 catch (FileNotFoundException e) {
		e.printStackTrace();
		}
    catch (IOException e1) {
		e1.printStackTrace();
 
    
    }
}}