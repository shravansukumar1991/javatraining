package demo;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Main_Stock_Market extends Stock_Market {
public static void main(String[] args) throws IOException {

		int count = 0;
		int maxIndex = 0;
    	Stock_Market SMList[] = {};
    	Stock_Market BestStock;
    	
    	SMList = new Stock_Market[10];
    	Scanner sc = null;
    	try {
    		sc = new Scanner(new File("C:\\Users\\friss\\Desktop\\stock_market.txt"));

    		while(sc.hasNextLine()){
    			String str = sc.nextLine();
       
    			parseData(str, count, SMList);
    			count++;
    	}
    		for(int i=0;i<count;i++) {
    	SMList[i].printSMDetails ();		
    		}
   
    		
    	BestStock = highest(SMList); 
    	System.out.print("Stock with Max increase:");
        BestStock.printSMDetails();
        
    	
    } catch (IOException  e) {
   
    	e.printStackTrace();
    } finally {
    	if(sc != null)
    		sc.close();
    }	
 
  }
	
  private static void parseData(String str, int count, Stock_Market SMList[]){	
    String Company;
    int CurrPrice;
    int YestPrice;
   
    Scanner lineScanner = new Scanner(str);
      lineScanner.useDelimiter(" ");
      
    while(lineScanner.hasNext()){
    	Company = lineScanner.next();
    	CurrPrice = lineScanner.nextInt();
    	YestPrice = lineScanner.nextInt();
    	
    	SMList[count]=new Stock_Market();
    	SMList[count].setDetails(Company,CurrPrice,YestPrice);  
    } 
  }
    
    public static Stock_Market highest(Stock_Market SMList[]){
    	    
          int max = SMList[0].Growth;  
          int maxIndex = 0;
         
          for (int i = 0; i < 10; i++) {  
               
             if(SMList[i].Growth > max) { 
                 max = SMList[i].Growth;  
                 maxIndex = i;
             }
          }  
          
          
          return SMList[maxIndex];
    
  
  }
  }
