 class Vehicle1 {

    public static void start(){
        System.out.println("Vehicle class");
    }
}
class Truck extends Vehicle1{
public static void start(){
        System.out.println("truck class");
    }

}
class Car extends Vehicle1{
public static void start(){
        System.out.println("car class");
    }

}
class Motorcycle extends Vehicle1{
public static void start(){
        System.out.println("motorcycle class");}}

public class Vehicle{
     

public static void main(String[] args) {
    Truck truck =new Truck();
    truck.start();
    Car car =new Car();
        car.start();
    //start();
}
}
