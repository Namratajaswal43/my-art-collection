



class speaker{ 
    public void makesound(){
    System.out.println("poly");
}}
class poly1 extends speaker()@Override
    public void makesound() {
        // TODO Auto-generated method stub
        super.makesound();
    }

{ 

     
      {
System.out.println("poly1");
    }
}

public class polymorphism {
public static void main(String[] args) {
    poly1 p =new poly1() ;
    p.makesound ();
}
}

@Override
public String toString() {
    return "poly1 []";
}
