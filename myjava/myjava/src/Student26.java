
    class StudentException extends Exception {
    public StudentException(String message) {
        super(message);
    }
}
 

  
public class Student26 {
       
     String name;
     int age;

     Student26 (String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void enroll() throws StudentException {
        if (age < 18) {
            throw new StudentException("Student is too young to enroll");
        }
        System.out.println(name + " is enrolled.");
    
    }

 
    public static void main(String[] args) {
        System.out.println("...Throws user-defined exception....");
        Student26 student1 = new Student26("namrata", 9);
         Student26 student2 = new Student26("namrata1", 20);
        try {
            student1.enroll();
        } catch (StudentException e) {
            System.out.println("Enrollment error: " + e.getMessage());
        }
        
try {
            student2.enroll();
        } catch (StudentException e) {
            System.out.println("Enrollment error: " + e.getMessage());
        

       
    }
}}