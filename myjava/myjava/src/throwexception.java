
    class OwnException extends Exception{
        public OwnException(String message){
            super(message);
        }
    }
  public class throwexception {
        void m1() throws OwnException{
            throw new OwnException("System error");
        }
        void m2() throws OwnException{
            m1();
        }
        void m3(){
            try{
                m2();
            }
            catch(OwnException e){
                System.out.println(e);
                System.out.println("catch exception");
            }
    
        }
        public static void main(String[] args){
            System.out.println("...Throws user-defined exception....");
               throwexception obj=new throwexception();
                obj.m3();
            System.out.println("Exception handled..!");
        }
    } 
     
    
      

