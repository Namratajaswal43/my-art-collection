
    


abstract class Animal {
    abstract void makeSound();
}

class Cow extends Animal {
    
void makeSound() {
System.out.println(" cow class");
 }
}

class Cat extends Animal {
    
void makeSound() {
System.out.println("cat class");
}
}

public class Animal1 {
 public static void main(String[] args) {
Cow cow = new Cow();
Cat cat = new Cat();

cow.makeSound(); 
cat.makeSound(); 

    }}