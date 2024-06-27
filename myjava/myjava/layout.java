import java.awt.*;    
import javax.swing.*;    
    
public class layout  {    
     
   JFrame  f = new JFrame (); 
 
 public layout () {    
  JButton buttons1 = new JButton ("1");    
    JButton b1 = new JButton ("2"); 
      
     
     
      f.add(b1); 
      f.add(buttons1);  
    
 // the buttons in the output will be aligned vertically   
f.setLayout (new BoxLayout(this,BoxLayout.X_AXIS));  
f.setSize(400,400);
    
f.setVisible(true);    
}    
 // main method   
public static void main(String args[]){    
layout b=new layout ();    
}      }