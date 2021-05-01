package training;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.HashMap;
import java.util.Map;
 
public class summa {

    final static String filePath = "/Users/shravansukumar/Desktop/new java workspace/Training/STock_Market";
    
    public static void main(String[] args) {
        
        //read text file to HashMap
        Map<String, Integer> mapFromFile = getHashMapFromTextFile();
        
        //iterate over HashMap entries
        for(Map.Entry<String, Integer> entry : mapFromFile.entrySet()){
            System.out.println( entry.getKey() + " => " + entry.getValue() );
        }
        
    }
    
    public static Map<String, Integer> getHashMapFromTextFile(){
        
        Map<String, Integer> mapFileContents = new HashMap<String, Integer>();
        BufferedReader br = null;
        
        try{
            
        
            File file = new File(filePath);
            
            br = new BufferedReader( new FileReader(file) );
            
            String line = null;
            
         
            while ( (line = br.readLine()) != null ){
                
              
                String[] parts = line.split(":");
                
               
                String Compname = parts[0].trim();
                Integer CurrPrice = Integer.parseInt( parts[1].trim() );
             
                if( !Compname.equals("") && !CurrPrice.equals("") )
                    mapFileContents.put(Compname, CurrPrice);
            }
                        
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            
           
            if(br != null){
                try { 
                    br.close(); 
                }catch(Exception e){};
            }
        }        
        
        return mapFileContents;
        
    }
}