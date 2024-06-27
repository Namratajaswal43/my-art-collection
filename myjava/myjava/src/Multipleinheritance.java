
    class marinecreatures{
        void lives(){
            
            System.out.println("marine creatures lives in water");
        }
    
    }
    class fish extends marinecreatures{
        void gills(){
            System.out.println("fish breathe through gills");
        }
    }
    class dolphin extends marinecreatures, fish{
        void inhales(){
            System.out.println("dolphin breathe just like humans");
        }
    
    
    }
    public class Multipleinheritance {
        public static void main(String[] args) {
            
        }
        fish f= new fish();
        f.gills();
        dolphin dp= new dolphin();
        dp.inhales();

}
