package demo;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
public class ParagraphDetails {
	 int wordcount;
	 String longest_word;
	
ParagraphDetails(){
	wordcount=0;
	longest_word=" ";
}
 void NoOfWords(String fileName) throws IOException{
	
	File f1=new File(fileName); 
    String[] words=null;    
     
    FileReader fr = new FileReader(f1);    
    BufferedReader br = new BufferedReader(fr);   
    String s;
    
    while((s=br.readLine())!=null)    
    {
       words=s.split(" ");   
       wordcount=wordcount+words.length;   
    }
    fr.close();
    
    System.out.println("Number of words in the file:" +wordcount); 
}
 void  LongestWord(String fileName) throws IOException{
     String current;
     Scanner sc = new Scanner(new File(fileName));
     
     while (sc.hasNext()) {
        current = sc.next();
        
         if (current.length() > longest_word.length()) {
           longest_word = current;
         }

     }
       System.out.println("the Longest word is"+" "+longest_word);
}}


