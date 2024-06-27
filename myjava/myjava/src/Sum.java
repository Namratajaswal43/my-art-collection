
    //exceptionhandling

class GreaterException extends Exception {
    public GreaterException(String message) {
        super(message);
    }
}
public class Sum {
    
public static int calsum(int n) {
        if (n <= 0) {
            System.out.println("Please enter a positive integer for 'n'.");
            return 0;
        }
        
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum =sum+ i;
        }
        return sum;
    } 
     public static void main(String[] args) {
        try {
            int n = 100; 
            
            int sum = calsum(n);
            

            if (sum > 200) {
                throw new GreaterException("Sum is greater than 200");
            } else {
                System.out.println("Sum: " + sum);
            }
        } catch (GreaterException e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }}