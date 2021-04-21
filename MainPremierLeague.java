package demo;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class MainPremierLeague extends PremierLeague{
	
	public static void main(String[] args) throws IOException {
		
		int count = 0;
    	PremierLeague PLList[] = {};
    	
    	PLList = new PremierLeague[10];
    	Scanner sc = null;
    	try {
    		sc = new Scanner(new File("C:\\Users\\friss\\Desktop\\premierleague_table.txt"));

     
    		while(sc.hasNextLine()){
    			String str = sc.nextLine();
       
    			parseData(str, count, PLList);
    			count++;
    	}
    		for(int i=0;i<count;i++) {
    	PLList[i].printPLDetails ();		
    		}
    	
    } catch (IOException  e) {
   
    	e.printStackTrace();
    } finally {
    	if(sc != null)
    		sc.close();
    }	  		
  }
	
  private static void parseData(String str, int count, PremierLeague PLList[]){	
    String club;
    int pos;
    int MP;
    int W;
    int D;
    int L;
    int GF;
    int GA;
    int GD;
    int pts;
  
    Scanner lineScanner = new Scanner(str);
      lineScanner.useDelimiter(" ");
    while(lineScanner.hasNext()){
    	pos = lineScanner.nextInt();
    	club = lineScanner.next();
    	MP = lineScanner.nextInt();
    	W = lineScanner.nextInt();
    	L = lineScanner.nextInt();
    	D = lineScanner.nextInt();
    	GF = lineScanner.nextInt();
    	GA = lineScanner.nextInt();
    	GD = lineScanner.nextInt();
    	pts = lineScanner.nextInt();
    	PLList[count]=new PremierLeague();
    	PLList[count].setDetails(pos,club,MP,W,L,D,GF,GA,GD,pts);  
    }
    
    lineScanner.close();
  }

		
	}

