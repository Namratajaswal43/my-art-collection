import com.*;

    public class Interface {

        public static void main(String[] args) {
            
            circle c = new circle(5.0);
            Rectangle rectangle = new Rectangle(4.0, 6.0);
    
            
            System.out.println("Circle - Area: " + c.area() + ", Perimeter: " + c.perimeter());
            System.out.println("Rectangle - Area: " + rectangle.area() + ", Perimeter: " + rectangle.perimeter());
        }
    }
    

