import java.util.*;
public class method_cal {
   
    
public static int add1(int a,int b){
        int c=a+b;
        return c;
    }
    
   public static int sub(int a,int b){
        int c=a+b;
        return c;
    } 
    


    public static int multi(int a,int b){
        int c=a*b;
        return c;
    }
    public static int div(int a,int b){
        int c=a/b;
        return c;
    }

public static int avg(int a,int b,int c ,int d){ 
int e=(a+b+c+d)/4;
return c;
}

public static int charcount(String str){
    int count =0;
    for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='j'){
            count++;

        }
    }
    return count;
}


    public static void main(String[] args) {
        

       

   
   System.out.println(add1(10,20));
System.out.println(sub(10,20));
System.out.println(multi(10,20));
System.out.println(div(10,20));
System.out.println(avg(1,2,3,1));
System.out.println(charcount());


 



   } 
}
  