import java.util.Scanner;


public class calculator {
    public static void main(String[] args) {
        int n1;
        int n2;
        int choose;
        
        int cal;

        //take input from users
Scanner scan =new Scanner(System.in);       
       
System.out.println("enter 2 nos.");
n1=scan.nextInt();
n2=scan.nextInt();

System.out.println("enter opn you want to perform");
System.out.println("enter 1 =addition");
System.out.println("enter 2 =subtraction");
System.out.println("enter 3 =multiplication");
System.out.println("enter 4 =division");
 choose=scan.nextInt();

 //using if else
if(choose==1){
cal=n1+n2;
System.out.println("addition"+cal);
} 
 if(choose==2){cal=n1-n2;
    System.out.println("subtraction"+cal);

} else if(choose==3){cal=n1*n2;
    System.out.println("multiplication"+cal);

}else if(choose==4){
    cal=n1/n2;
    System.out.println("division"+cal); 
    
        
    }else{
        System.out.println("opn is invalid");
    }
} }

