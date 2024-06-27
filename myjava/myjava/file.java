
    

import javax.swing.*;
import java.awt.event.*;
import javax.swing.filechooser.FileNameExtensionFilter;
public class file extends JFrame implements ActionListener{
    JFrame f=new JFrame();
    JTextField textField;
    file(){
        JMenuBar mb=new JMenuBar();
        JMenu m=new JMenu("new");
        JMenuItem m1=new JMenuItem("open");
        JMenuItem m2=new JMenuItem("open with");
        m1.addActionListener(this);
        m.add(m1);
        m.add(m2);
        mb.add(m);
        textField=new JTextField();
        textField.setEditable(false);
        f.add(textField);
        f.setJMenuBar(mb);
        f.setSize(400,400);
        f.setVisible(true);}
    public void actionPerformed(ActionEvent e){
        String s = e.getActionCommand();
        if (s.equals("open")) {
            JFileChooser fileChooser=new JFileChooser();
            FileNameExtensionFilter filter=new FileNameExtensionFilter("text files", "txt");
            fileChooser.setFileFilter(filter);
            
 

 




int result=fileChooser.showOpenDialog(f);
            if(result==JFileChooser.APPROVE_OPTION){
                String fileName=fileChooser.getSelectedFile().getName();
                textField.setText("Selected File:"+fileName);
            }
        }
    }
    public static void main(String[] args){
        new file();
    }
}














