 class table1 {
    
    public synchronized void printtable(int n){
        for(int i=0;i<=10;i++){
            System.out.println(n*i);
        }
    }
}
 class t1 extends Thread{
    table1 t;
    t1(table1 t) {
         this.t=t;  }
public void run(){
t.printtable(5);
}
    }
 
class t2 extends Thread{
    table1 t;
    t2(table1 t){
        this.t=t;  }
public void run(){
t.printtable(7);
}
    }
    public class table  {
 
 public static void main(String[] args){
    table1 obj =new table1();
    t1 a=new t1(obj);
    t2 b=new t2(obj);
    a.start();
    b.start();
 }}