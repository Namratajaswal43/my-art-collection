
    //Multilevel Inheritance
public class MultiLevelInheritance
{
int a=20;
void a1()
{
System.out.println("Value of a = "+a);
}  
}
class C1 extends MultiLevelInheritance
{
int b=40;
void a2()
{
System.out.println("Value of b = "+b);
}
}
class C2 extends C1
{
int c=80;
void a3()
{
System.out.println("Value of c = "+c);
}
public static void main(String args[])
{
C2 ob1=new C2();
ob1.a1();
ob1.a3();
ob1.a2();
}
}



