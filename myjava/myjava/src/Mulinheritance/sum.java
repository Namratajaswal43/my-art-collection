package Mulinheritance;
public interface  sum {
  
    void add();
}
public interface  sub {
  
    void minus();
}


public interface result extends sum,sub {
    void multiply();
}
public class result2 implements result {
  
    int a=1;
    int b=2,c,d,e;
public void add(){
   c =a+b;
   System.out.println("Addition is:"+c);
}
public void minus(){
  d=a-b;
  System.out.println("Subtraction is:"+d);
}
public void multiply(){
    e=a*b;
    System.out.println("multiplication is:"+e);
}
}
