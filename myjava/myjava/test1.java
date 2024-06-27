package myjava;


    import javax.swing.*;
    import java.awt.event.*;
    
   public class test1 {
    {
  test1();
        {
            JFrame f = new JFrame("Labels and Button");
            JButton b = new JButton("Button");
            b.setBounds(100,100,140,40);
            JLabel l = new JLabel();
            l.setText("Enter the name");
            l.setBounds(10,10,100,100);
            JLabel l1 = new JLabel();
            l1.setBounds(10,110,200,100);
            JTextField t = new JTextField();
            t.setBounds(110, 50 , 130, 130);
            f.add(l);
            f.add(l1);
            f.add(t);
            f.add(b);
        }
        public static void main(String args[]) 
        {
            
            JFrame frame = new JFrame("Dispose On Close Example");
            frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            frame.setSize(400, 300);
            frame.setVisible(true);
        }
    } 
}
