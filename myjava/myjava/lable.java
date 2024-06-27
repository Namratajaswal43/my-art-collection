import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class lable {
    lable(){
        JFrame f=new JFrame("Label and button");
        JButton  b=new JButton("Submit");
        b.setBounds(130,110,80,20);
        JLabel l=new JLabel();
        l.setText("enter the name");
        l.setBounds(10, 10, 100, 100);
        JLabel l1=new JLabel();
        l1.setBounds(10,110,200,100);
        JTextField t=new JTextField();
        t.setBounds(110,50,130,30);
        f.add(l);
        f.add(l1);
        f.add(t);
        f.add(b);
        f.setSize(300,300);
        f.setLayout(null);
        f.setVisible(true);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        b.addActionListener(new ActionListener() {
          public void actionPerformed(ActionEvent e) {
              l1.setText("name has been submitted");
          }   });}

    public static void main(String[] args){
        new lable ();
    }
}
