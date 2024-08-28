import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

class MyFrame extends JFrame 
//implements ActionListener 
{

    JButton b;

    public MyFrame() {
       ImageIcon icon = new ImageIcon("signature.jpeg");
        b = new JButton("Click me...");
        b.setBounds(100, 100, 985, 450);
        b.addActionListener(e -> System.out.println("sharath")); 
        // Corrected this line
        
        b.setIcon(icon);
        
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        

        this.setLayout(null);
        this.setSize(400, 400);

        this.setVisible(true);
        this.add(b);
    }

   /* public void actionPerformed(ActionEvent e) { // Corrected the parameter type
        if (e.getSource() == b) { // Corrected this line
            System.out.println("sharath");
        }
    }*/
}

public class Jbutton {
    public static void main(String[] args) {
        MyFrame f = new MyFrame();
    }
}

