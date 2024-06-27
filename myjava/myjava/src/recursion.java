import java.util.*;
public class recursion {

//factorial
/*public static int fact(int num){
    if(num==0){
        return 1;
         }
         else 
         return num*fact(num-1);
}
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a no.");
    int num =scan.nextInt();
    System.out.println("factorial of a number is ="+fact(num));
  }*/



//fibonacci series
 /*  public static int fibo(int n){
    
    if(n==0){
        return 0;
         }
         else if(n==1){
            return 1;
         }
         
             else
         return 
          (fibo(n-1)) + (fibo(n-2)) ;
}
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a no.");
    int n =scan.nextInt();
    for(int i=0;i<=n;i++){
        System.out.println(fibo(i)+" ");
    }
  
}*/

 

  //sum of array elements

 /*  public static int calsum(int arr[],int n){
    if (n<=0){
        return 0;
    }
    else
    return calsum(arr,n-1)+arr[n-1];

  }

  public static void main(String[] args) {
    int[] arr ={1,2,3,4,5};
    int sum =calsum(arr,arr.length);
    System.out.println(sum);
  }
*/


//sum of n natural no.
 /* public static int calsum(int n){
    if (n<=1){
        return n;
    }
    else
    return n+calsum(n-1);

  }

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("enter a no.=");
    int num =scan.nextInt();
    
    System.out.println("sum="+num+calsum(num));}*/




    //power calculation
   /*  public static void main(String[] args) {
        int base = 2;
        int exponent = 5;
        int result = calculatePower(base, exponent);
        System.out.println(result);
    }

    public static int calculatePower(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        }
        return base * calculatePower(base, exponent - 1);
    }

*/




 //nth table
   /*  public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        
        System.out.println("Multiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
*/



//sum of all prime no.
  /*   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();

        int sum = 0;
        for (int num = 2; num <= n; num++) {
            boolean prime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                sum += num;
                
            }
    }
System.out.println(sum);
}
*/

}
