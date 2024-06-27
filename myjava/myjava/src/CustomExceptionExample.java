class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}

public class CustomExceptionExample {
    public static void main(String[] args) {
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (CustomException e) {
            System.out.println("Custom Exception caught: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("Arithmetic Exception caught: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("Generic Exception caught: " + e.getMessage());
        }
    }

    public static int divide(int a, int b) throws CustomException {
        try {
            if (b == 0) {
                throw new ArithmeticException("Division by zero is not allowed");
            }
            return a / b;
        } catch (ArithmeticException e) {
            throw new CustomException("Custom Exception: " + e.getMessage());
        }
    }
}