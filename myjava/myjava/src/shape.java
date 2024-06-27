//polymorphism

import java.util.Scanner;

public class shape {
    public int getarea(int len,int width){
        return len*width;
    }
public double getarea(int radius){
    return 3.14*radius*radius;
}
public class square extends shape{
    public int getarea(int len,int width){   //override
        return len*width;
    }
}public class rectangle extends shape{
    public int getarea(int len,int width){   //override
        return len*width;
    }
}

public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
    System.out.println("enter first no.=");
    int len =scan.nextInt();
    System.out.println("enter 2nd no.=");
    int wid =scan.nextInt();
    System.out.println("enter radius");
    int radius =scan.nextInt();
  //  int radius=1;
    shape sh =new shape();
    //int len=41;
    //int wid=20;
    double result =sh.getarea(radius);
    int result1 =sh.getarea(len,wid);
    System.out.println(result);
    System.out.println(result1);
}
}