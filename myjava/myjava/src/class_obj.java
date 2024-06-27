class oops{
    int x=0;
    int y=0;//instance variable
oops(int a,int b){
x=a;
y=b;

//System.out.println("i m a constructor");
}
    public void add(){
        int c= x+y;
        System.out.println(c);
    }
    //method overloading
    /*public  void add(){
        int d= a+b+c;
        System.out.println(d);*/
    //}
}


public class class_obj {
  public static void main(String[] args) {
        oops ob =new oops(10,20);
       ob.add();
        //ob.add(10,20,30);
    }
}
