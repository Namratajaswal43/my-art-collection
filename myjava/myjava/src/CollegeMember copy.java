// File: CollegeMember.java
import college.staff.Staff;

public class CollegeMember implements Student, Staff {
    private String name;

    public CollegeMember(String name) {
        this.name = name;
    }

    @Override
    public void study() {
        System.out.println(name + " is studying.");
    }

    @Override
    public void work() {
        System.out.println(name + " is working.");
    }

    public void introduce() {
        System.out.println("Hello, I am " + name);
    }

    public static void main(String[] args) {
        CollegeMember studentStaff = new CollegeMember("Alice");
        studentStaff.introduce();
        studentStaff.study();
        studentStaff.work();
    }
}

