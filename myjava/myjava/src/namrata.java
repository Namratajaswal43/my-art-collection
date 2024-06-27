public class namrata {

        int roll_no; 
        int age;
        
        static int year=3;
        
        static int completion=2025;
        
        namrata(int r){
        
        roll_no=r;
    }
        
        static void intro() {
        
        System.out.println("Hi! I am student of ABVGIET.");
         System.out.println("I will complete my btech in "+completion);
        }
        
        void info() {
        
        System.out.println("roll no: "+ roll_no +" year: "+ year);
    } 

        
        
       static void year () {
        
         System.out.println("3rd year");}
         
 
         public static void main(String[] args) {
        
        namrata y = new namrata(1);
        
        y.info();
        
        namrata p = new namrata(2);
        
        p.info();
        
        year();
        
        namrata.year=5;
        
        namrata.intro();
        
        namrata t = new namrata(5);
        
        t.info();
        
        namrata u= new namrata(10);
        
        u.info();
    }}

