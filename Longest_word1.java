package demo;

import java.io.BufferedReader;
import java.io.FileReader;

public class Longest_word1   
{  
    public static void main(String[] args) throws Exception {  
        String line;  
        int count = 0;  
        FileReader file = new FileReader("C:\\Users\\friss\\Desktop\\para.txt");  
        BufferedReader br = new BufferedReader(file);  
  
        while((line = br.readLine()) != null) {  
            String words[] = line.split(" ");  
            count = count + words.length;  
        }
        
        br.close();  
    }
}