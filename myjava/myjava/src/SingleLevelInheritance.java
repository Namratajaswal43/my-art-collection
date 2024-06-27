 

 //Single Inheritance
import java.lang.*;
class t1
{
    int a=30; 
    int b=20;
    int sum =a+b;

    
void display(){ 
System.out.println(sum) ;}}
   

class T2 extends SingleLevelInheritance
{int a=30; 
    int b=20;
    int sum =a+b;

    
void display(){ 
System.out.println(sum) ;}
}
class SingleLevelInheritance{ 
 public static void main(String args[])
{
T2 obj=new T2();
obj.display();

 }
}

