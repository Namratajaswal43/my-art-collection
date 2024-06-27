import java.util.*;
public class methods {
    public static void display(){
        System.out.println("hi");
    }
    public static void add(int a,int b){
      int c=a+b;
      System.out.println(c);  

    }

    public void sub(int a,int b){
        int c=a-b;
        System.out.println(c);
    }

    public static int multi(int a,int b){
        int c=a*b;
        return c;
    }
    public static int add1(int a,int b){
        int c=a+b;
        return c;
    }
public static void greatnum(int a,int b){
    if(a>b){
        System.out.println("a is greater than b");
    }
    else{
        System.out.println("b is greter than a");
    }
}

    public static boolean greatnum1(int a,int b){
    if(a>b){
        return true;
    }
    else{
        return false;
    }
}





    public static void main(String[] args) {
        //Scanner scan =new Scanner(System.in);

       // int x=scan.nextInt();
//display();

       //static method does require any object to call it
    //add(10,20); 
    //methods obj =new methods();
    //obj.sub(20, 10);   
   //sub(20,10);

  // System.out.println(multi(10,20) +(add1(10, 0)));//multi(10,20);//we used return type thats why the value of multi (2,5)will be 10
   //System.out.println(add1(10,20));


//greatnum(10,20);
//greatnum1(10.20);

 }
}

