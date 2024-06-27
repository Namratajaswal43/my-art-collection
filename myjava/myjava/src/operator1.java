public class operator1{
     
public static void main(String[] args)
        {
            int a = 20, b = 40;

            // Arithmetic operators
            System.out.println("The value of a+b = "+ (a+b));
            System.out.println("The value of a-b = "+ (a-b));
            System.out.println("The value of a*b = "+ (a*b));
            System.out.println("The value of a/b = "+ (a/b));
            System.out.println("The value of b%a = "+ (b%a));
            //Unary operators
            System.out.println("The value of a++ = "+ (a++));
            System.out.println("The value of ++a = "+ (++a));
            System.out.println("The value of b-- = "+ (b--));
            System.out.println("The value of --b = "+ (--b));
            //Assignment operators
            int var = a;
            System.out.println("The simple assignment for var is :"+ var);
            var += a;
            System.out.println("The += assignment for var is :"+ var);
            var *= a;
            System.out.println("The *= assignment for var is :"+ var);
            var /= a;
            System.out.println("The /= assignment for var is :"+ var);
            //Relational Operators 
            System.out.println("The value of a is "+a+" and the value of b is "+b);
            System.out.println("a==b : "+(a==b));
            System.out.println("a!=b : "+(a!=b));
            System.out.println("a>b : "+(a>b));
            System.out.println("a<b : "+(a<b));
    
    
            //Logical operators
            System.out.println("(5 > 3) && (8 > 5) : "+((5 > 3) && (8 > 5)));
            System.out.println("(5 > 3) && (8 < 5) : "+((5 > 3) && (8 < 5)));
            System.out.println("(5>3) || (8<5) : "+((5>3) || (8<5)));
            System.out.println("(5>3) || (8>5) : "+((5>3) || (8>5)));
            System.out.println(("!(5>3) : "+!(5>3)));
            System.out.println("!(8<5) : "+!(8<5));
            //Ternary operator
            int age = 19;
            System.out.println((age>=18)?"Eligible to vote":"Not eligible to vote");
            //Bitwise operators
            int c = 5;
            int d = 7;
            // bitwise and
            System.out.println("c&d = " + (c & d));
            // bitwise or
            System.out.println("c|d = " + (c | d));
            // bitwise xor
            System.out.println("c^d = " + (c ^ d));
            // bitwise not
            System.out.println("~c = " + ~c);
            c &= d;
            System.out.println("c= " + c);
            //left shift
            System.out.println("Bitwise Left Shift: " + (c << 2));
            //right shift
            System.out.println("Bitwise Right Shift: " + (d >> 2));
            
            
         }
    }
    

