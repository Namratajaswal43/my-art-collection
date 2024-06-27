public class exceptionex {

int c;
    public void div(int a,int b) throws ArithmeticException{
        if (b==0)
        {
            throw  new ArithmeticException();
        }
        else{
            System.out.println(c=a/b);
        }
    }
    public static void main(String[] args) {
       // System.out.println("mainthread");
        exceptionex e= new exceptionex();
        e.div(10, 0);
       // System.out.println(c);
        
     /* int a=10,b=0;
     try {int c=a/b;
           System.out.println(c);
        
     } catch (ArithmeticException e) {
      System.out.println("airthmetic exception");
     }
      


String strr=null;
try{ System.out.println(strr.toUpperCase());
}
catch(NullPointerException  e){
    System.out.println("exceptioon");
}







      System.out.println("thread closed"); 

*/



    }
}
