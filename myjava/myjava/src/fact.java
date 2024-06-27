import java.util.Scanner;

public class fact {
    public void fact1(int n){
        int a=1;

for(int i=1;i<=n;i++){
    a=a*i;
   
 }
 System.out.println(a);
}

     public void sum(int n){
        int sum =0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            
        }
        System.out.println(sum);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        fact obj =new fact();
    obj.fact1(a); 

    obj.sum(b);
    } 
}
