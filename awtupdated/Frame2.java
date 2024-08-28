//Frame2
import java.awt.*;
import java.awt.event.*;
class Frame2 extends Frame implements ActionListener
{
    //create a button
    Button b;
  String str;

Frame2(String str)
{
  this.str=str;

     //set layout 
    setLayout(new FlowLayout());

//create the button
 b=new Button("Back");

//add it to frame
add(b);
//add action listener to button
b.addActionListener(this);
}

public void paint(Graphics g)
{
    g.drawString(" values from frame 1",100,200);
    g.drawString(str, 105, 250);
}
public void actionPerformed( ActionEvent ae) {
     //remove this frame from memory
    this.dispose();
 }
}