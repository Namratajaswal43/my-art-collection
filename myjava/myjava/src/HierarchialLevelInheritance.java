
    //Hierarchical Inheritance
public class HierarchialLevelInheritance
{
	 int a=30; 
	 int b=20;
	 int sum =a+b;

	 
 void display(){ 
System.out.println(sum) ;}}
	
class Test04 extends HierarchialLevelInheritance
{
	int a=60;
	int b=20;
	 int sum =a+b;
	 

 void display(){ 
System.out.println(sum) ;}}
	
class Test05 extends HierarchialLevelInheritance
{
	int a=90;
	int b=20;
	 int sum =a+b;
	 

	  void display(){ 
System.out.println(sum) ;}}

	      

class Test06 extends HierarchialLevelInheritance
{
	int a=120;
	int b=20;
	 int sum =a+b;
	 

	 void display(){ 
System.out.println(sum) ;}}
	


class Demo2
{
	 public static void main(String args[])
	{
	 Test04 ob3=new Test04();
	ob3.display();
	
	Test05 ob2=new Test05();
	ob2.display();
	
	Test06 ob1=new Test06();
	ob1.display();
	
	}
}


