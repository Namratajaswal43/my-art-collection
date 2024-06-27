
class demo{
      static int a=40;
      int b;
demo(int b){
     this.b=b;}
static void change(){
      a=10;}
void add(){
      display();
       System.out.println("value of a is:"+a);
       System.out.println("value of b is:"+b);
       System.out.println("Addition:"+(a+b));}
static void display(){
       System.out.println("value of a is:"+a);
}}
public class static1 {
public static void main(String[] args){
       demo.change();
      demo obj=new demo(50);
      obj.add();
}
} 

 
 

   
  
  
  
  
  
  
  
  
  
  
}
