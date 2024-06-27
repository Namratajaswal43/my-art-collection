import java.util.*;
public class switchcase {
    

    public static void main(String[] args) {
       Scanner scan= new Scanner(System.in);
       // int a= scan.nextInt();
       /*  switch(a){
            case 1:
            System.out.println("this is monday");
            break;
            case 2:
            System.out.println("this is tuesdasy");
            break;
            case 3:
            System.out.println("this is wednesday");
            break;
            case 4:
            System.out.println("this is thursday");
            break;
            case 5:
            System.out.println("this is friday");
            break;
default:
System.out.println("not a week */



        System.out.println("press 1for addition");
        System.out.println("press 2 for subtraction");
        int a= scan.nextInt();
        switch(a){
            case 1:
            System.out.println("enter firt no.");
          int b= scan.nextInt();
            System.out.println("enter 2nd no.");
       int c =scan.nextInt();
    System.out.println(b+c);
    break;
     case 2:
            System.out.println("enter firt no.");
          int e= scan.nextInt();
            System.out.println("enter 2nd no.");
       int f =scan.nextInt();
    System.out.println(e-f);
    break;
 }
 }
    }
    
}

