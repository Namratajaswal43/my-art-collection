 class msg1{

    public void show(String  name){

        synchronized(this){ 
        for(int i=0;i<=3;i++)
{
    System.out.println("hi"+name);
}    }}
 }

class thr extends Thread{
    msg1 m;
    String name;
    
    thr(msg1 m,String name){
        this.m=m;
    this.name=name;
    }
    public void run(){
        m.show(name);

    }
}



    public class msg {
        public static void main(String[] args) {
            msg1 m = new msg1();
            thr t = new thr(m,"nam") ;
             thr t1 = new thr(m,"anu") ;
            t.start();
            t1.start();
        }
    
}
