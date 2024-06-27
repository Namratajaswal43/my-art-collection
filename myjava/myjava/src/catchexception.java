public class catchexception {

        public static void main(String[] args){
            System.out.println("....Multiple catch blocks....");
            try{
                int a[]={1,2,3,4,5,6};
                if(a.length>5){
                System.out.println("Array is out of bound");
            }
                System.out.println(a[7]);
            }
            catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
                System.out.println("Exception handled..!");
            }
            catch(ArithmeticException e){
                System.out.println(e);
            }
            catch(NullPointerException e){
                System.out.println(e);
            }
            System.out.println("Only one catch block execute.."); 
        }
    static void enrollStudent(String name, int age) throws AgeLimitException {
        if (age < 18 || age > 25) {
            throw new AgeLimitException("Age should be between 18 and 25.");
        }
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be empty or null.");
        }

        // Simulate the enrollment process
        System.out.println("Enrolling " + name + "...");
    }
}
 class AgeLimitException extends Exception {
    public AgeLimitException(String message) {
        super(message);
    }}






    

