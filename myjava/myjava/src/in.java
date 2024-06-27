class first{
    int a=10;
    int b=20;
    int sum =a+b;
    void show()
{
    System.out.println("single inheritance.....");
    System.out.println(sum) ;
}}

class second extends animal{
     int a=10;
    int b=20;
    int sub =a+b;
    void show()
{

    System.out.println(sub) ;
}}

interface new {
    void multi();
}

class lion implements new{
    int a=10;
    int b=20;
    int multi =a+b;
    void show()
{

    System.out.println(multi) ;
    
}





class livingbeing{
    void breathe(){
        System.out.println("multilevel inheritance.....");
        System.out.println("living being breathes");
    }
}
class human extends livingbeing{
void talk(){
    System.out.println("human can talk");
}
}
class person extends human{
    void work(){
        System.out.println("person can work");
    }
}


class marinecreatures{
    void lives(){
        System.out.println("hierarchical inheritance.....");
        System.out.println("marine creatures lives in water");
    }

}
class fish extends marinecreatures{
    void gills(){
        System.out.println("fish breathe through gills");
    }
}
class dolphin extends marinecreatures{
    void inhales(){
        System.out.println("dolphin breathe just like humans");
    }


}



public class Inheritance {
    public static void main(String[] args) {
        
    
        dog d=new dog();
        d.eat();
        d.bark();
        lion l= new lion();
        l.hunt();
        person p= new person ();
        p.breathe();
        p.talk();
        p.work();
        fish f= new fish();
        f.gills();
        dolphin dp= new dolphin();
        dp.inhales();


    } 
}
public class in {
    
}
