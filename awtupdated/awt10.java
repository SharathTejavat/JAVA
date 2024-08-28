import java.awt.*;
import java.awt.event.*;
class awt10 extends Frame implements ActionListener {

      Button b1,b2,b3;
      awt10() { 
         //do not set anylayout
         this.setLayout(new FlowLayout()); 
    //FlowLayout, BorderLayout, CardLayout, GridLayout, GridBagLayout

          //create 3 push buttons
           b1=new Button("Yellow");
           b2=new Button("Blue");
           b3=new Button("Pink");
 
          //add the buttons to the frame
          this.add(b1);
           this.add(b2);
          this.add(b3);

    //add action listener to the buttons
             b1.addActionListener(this);
             b2.addActionListener(this);
             b3.addActionListener(this);

//close the frame
addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent we) {
                       System.exit(0);
                }
  });
}

//this method is called when the button is clicked
public void actionPerformed(ActionEvent ae) {
   //change the frames background color depending on the button clicked

if(ae.getSource()==b1)
          this.setBackground(Color.yellow);
if(ae.getSource()==b2)
         this.setBackground(Color.blue);
if(ae.getSource()==b3)
         this.setBackground(Color.pink);
}

public static void main(String args[]) {
       //create the frame
             awt10 mb=new awt10();
             mb.setSize(400,400);
              mb.setTitle(" Push buttons to change background");
              mb.setVisible(true);
  }
}