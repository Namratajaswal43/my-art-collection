 class ticketearning extends Thread{
    int total=0;
    public void run(){
        synchronized(this){ 
for(int i=0;i<=10;i++){
    total=total+100;
}
    this.notify();

    }
}
 }


public class moviebookapp {
    
    public static void main(String[] args) {
        ticketearning t=new ticketearning();
        t.start();
       synchronized(t)
       {
        t.wait();
       
        System.out.println("totalearning"+t.total);
    }
}
}