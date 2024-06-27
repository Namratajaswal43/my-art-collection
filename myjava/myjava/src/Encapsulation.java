
class Student{
  private  int roll;
  private String name;
  private  int marks;

    public Student(){

    }
     public Student(int roll,String name,int marks){
this.roll=roll;
this.name=name;
this.marks=marks;
    }


public void setRoll(int roll){
    this.roll=roll;
}
public int getRoll(int roll){
   return this.roll;
}
public void setName(String name){
    this.name=name ;
}
public String getName (String name){
   return this.name;
}
public void setMarks(int marks){
    this.marks=marks;
}
public int getMarks(int marks){
    return this.marks;
}
}
public class Encapsulation {
    public static void main(String[] args) {
        Student st =new Student();
st.setRoll(10);
st.setName ("namu");
st.setMarks(100);
System.out.println(st.getRoll(1));
System.out.println(st.getName("abc"));
System.out.println(st.getMarks(3));
    }
}

