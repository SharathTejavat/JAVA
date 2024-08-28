//Frame1
import java.awt.*;
import java.awt.event.*;
class Frame1 extends Frame implements ActionListener
{
   //vars
    Button b1, b2;
   Frame1() {
       setLayout(null);
       //create two buttons 
       b1=new Button("Next");
       b2=new Button("close");

     //set the location of buttons
   b1.setBounds(100,100,70,40);
   b2.setBounds(200,100,70,40);

  //add them to frame
   add(b1);
   add(b2);

 //add action listener to buttons
  b1.addActionListener(this);
  b2.addActionListener(this);
}

public void actionPerformed(ActionEvent ae) {
     //if next button is clicked display frame2
    if(ae.getSource()==b1)
{
  //create frame2 object and display
      Frame2 f2=new Frame2("sundaram");
      f2.setSize(400,400);
     f2.setVisible(true);
}

  else {
                  //if close button is clicked , close application
              System.exit(0);
      }
 }
public static void main(String args[]) {
     //create frame1
     Frame1 f1=new Frame1();
    f1.setSize(500,500);
   f1.setTitle("Firt frame");
   f1.setVisible(true);
   }
}    


