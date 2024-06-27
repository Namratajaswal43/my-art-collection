//multilevel inheritance

/*  class animal {
    
public void funA(){
    System.out.println("inside class animal");
} }
class cat extends animal {
    public void funB(){
        System.out.println("child class");
    }
 }
class dog extends cat {
    public void funC(){
        System.out.println("child class");
    }
 
}*/

//heriarchical inheritance
/*  class animal {
    
public void funA(){
    System.out.println("inside class animal");
} }
class cat extends animal {
    public void funB(){
        System.out.println("child class");
    }
 }
class dog extends animal {
    public void funC(){
        System.out.println("child class");
    }
 
} */


//multiple inheritance
 class animal {
    
public void funA(){
    System.out.println("inside class animal");
} }
class cat extends animal  {
    public void funB(){
        System.out.println("child class");
    }
 }

 class dog extends animal  {
    public void funC(){
        System.out.println("child class");
    }
 
}
class fox extends cat,dog  {
    public void funC(){
        System.out.println("child class");
    }
 
}
public class main {
    public static void main(String[] args) {
       /*  dog obj = new dog();
          obj.funB();          
        obj.funA();
        obj.funC();
*/

       /*  dog obj = new dog();
         cat obj1 =new cat();
          obj1.funB();
        obj.funA();
        obj.funC();
        */


         dog obj = new dog();
          obj.funB();          
        obj.funA();
        obj.funC();
    }
}

