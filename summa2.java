package training;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class summa2 {
  public static void main(String[] args) {
    BufferedReader br = null;
    try{
      String strLine;
      //FileReader instance wrapped in a BufferedReader
      br = new BufferedReader(new FileReader("/Users/shravansukumar/Desktop/Stock_Market.txt"));
       
      while((strLine = br.readLine()) != null){
        parseData(strLine);
      }
    }catch(IOException exp){
      System.out.println("Error while reading file " + exp.getMessage());
    }finally {
      try {
        // Close the stream
        if(br != null){
          br.close();
        }
      } catch (IOException e) {
        // TODO Auto-generated catch block
        e.printStackTrace();
      }
    }  		
  }
	
  private static void parseData(String strLine){	
    String Company, CurrPrice, YesPrice;
    // parsing using split method
    String[] data = strLine.split(" ");
    System.out.println("CompanyName- " + data[0] + " CurrentPrice- " + data[1] + 
         " YesterdayPrice- " + data[2]);  
  
}}