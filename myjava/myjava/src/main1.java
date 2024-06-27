



class Student extends Person {
    int roll;
   public Student(String name ,int age,int roll){
        super(name, age);
this.roll=roll;
    }
}
 class Person{
 String name;
 int age;   

 Person(String name,int age){
this.name = name;
this.age =age;
}
}
public class main1 {
  public static void main(String[] args) {
    Student st = new Student("a", 01, 20);
    
    System.out.println(st);
}

}  

