// Java code to illustrate different constructors and methods 
// String class.
  
import java.io.*;
import java.util.*;
  public class String1 {
    
public static void main (String[] args)
    {
        String s= "I am namrata";

          System.out.println("String length = " + s.length());
        System.out.println("Character at 3rd position = " + s.charAt(3));
        System.out.println("Substring " + s.substring(3));
        System.out.println("Substring  = " + s.substring(2,5));

        String s1 = "javaprogram";
        String s2 = "stringprogram";
        System.out.println("Concatenated string  = " +s1.concat(s2));
  

        String s4 = "Learn Share Learn";
        System.out.println("Index of Share " + s4.indexOf("Share"));
        System.out.println("Index of a  = " +  s4.indexOf('a',3));
  
        // Checking equality of Strings
        Boolean out = "Geeks".equals("geeks");
        System.out.println("Checking Equality  " + out);
        out = "Geeks".equals("Geeks");
        System.out.println("Checking Equality  " + out);
  
        
          out = "namu".equalsIgnoreCase("naMu ");
        System.out.println("Checking Equality " + out);
          
        
        int out1 = s1.compareTo(s2);
        System.out.println("the difference between ASCII value is="+out1);
        // Converting cases
        String word1 = "namrata";
        System.out.println("Changing to lower Case " + word1.toLowerCase());
  
        // Converting cases
        String word2 = "ankita";
        System.out.println("Changing to UPPER Case " +  word2.toUpperCase());
  
        // Trimming the word
        String word4 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());
  String w552 = " Learn Share Learn ";
        System.out.println("Trim the word " + word4.trim());
  
        // Replacing characters
        String str1 = "feeksforfeeks";
        System.out.println("Original String " + str1);
        String str2 = "feeksforfeeks".replace('f' ,'g') ;
        System.out.println("Replaced f with g -> " + str2);

String s5= "hello this is a book in java";

for(int i=0;i<s5.length();i++){
System.out.println(s5);
}
String s6= "hello this is a book in java";

for(int i=s6.length();i<=0;i--){
System.out.println(s6);
}
       
    } 
}





