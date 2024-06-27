import java.util.Arrays;
import java.util.Scanner;

public class string {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        String s ="welcome to myjava";
        String s1="welcome to python classes";
        
/*System.out.println(s.length());
System.out.println(s.toLowerCase());
System.out.println(s.toUpperCase());
System.out.println(s.trim());//it removes the void spaces(starting and end spaces)
System.out.println(s.substring( 5));
System.out.println(s.substring(8, 12));
System.out.println(s.replace('j', 'l'));
System.out.println(s.replace("java", " "));
System.out.println(s.startsWith("ve", 0));
System.out.println(s.endsWith("ee")) ;
System.out.println(s.charAt(14));
System.out.println(s.indexOf('j'));
System.out.println(s.indexOf('e', 1));
System.out.println(s.lastIndexOf('o'));
System.out.println(s.lastIndexOf('o', 10));
System.out.println(s.equals("welcome to java"));
System.out.println(s.equalsIgnoreCase("welcome to MYJAVA"));
System.out.println(s.equals(s));*/

//String s1 ="welcome to\"java  \\ \bpython\"classes";
//System.out.println(s1);
/*
 * \''
 * \""
 * \n
 * \t
 * \b
 * \\
 */
//to get char at given index within string
 System.out.println(s.charAt(0));

 //to concatenate a given string to the end of another string
 String s2=s1.concat(s);
 System.out.println(s2);

 //to check whether the given string ends with another string
System.out.println(s.endsWith("ee"));

//to check whether two string variables contain same data
System.out.println(s.equals(s1));



//to check the occurence of the character in a string
int len=s.length();
char find =scan.next().charAt(0);
char[] ch = new char[len];
int count=0;
for(int i=0;i<len;i++){
     
if(s.charAt(i)==find){
     count ++;

}}
System.out.println("the character" +find+"appears"+count+"times");



//to get a substring of a given string at two specified position
System.out.println(s.substring(9, 14));
} 
    
}



    
