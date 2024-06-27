

    import javax.swing.*;
import java.awt.event.*;

public class testttt {
    JFrame f;
    JButton b;
    JLabel l, l1;
    JTextField t;

    public testttt() {
        f = new JFrame("Labels and Button");
        b = new JButton("Button");
        b.setBounds(100, 100, 140, 40);
        l = new JLabel();
        l.setText("Enter the name");
        l.setBounds(10, 10, 100, 100);
        l1 = new JLabel();
        l1.setBounds(10, 110, 200, 100);
        t = new JTextField();
        t.setBounds(110, 50, 130, 30);

        f.add(l);
        f.add(l1);
        f.add(t);
        f.add(b);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                l1.setText("Name has been submitted: " + t.getText());
            }
        });

        f.setLayout(null);
        f.setSize(300, 250);
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            new testttt();
        });
    }
}
