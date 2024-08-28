import java.awt.*;
import java.awt.event.*;
class awt11 extends Frame implements ItemListener {
   String msg="";
      Checkbox c1,c2,c3;
      awt11() { 
         //do not set anylayout
         this.setLayout(new FlowLayout()); 
    //FlowLayout, BorderLayout, CardLayout, GridLayout, GridBagLayout

          //create 3 check boxes
           c1=new Checkbox("Bold",true);
           c2=new Checkbox("Italic");
           c3=new Checkbox("Underline");
 
          //add the checkboxes to the frame
             add(c1);
             add(c2);
             add(c3);

    //add item listener to the checkboxes
             c1.addItemListener(this);
             c2.addItemListener(this);
             c3.addItemListener(this);

//close the frame
addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent we) {
                       System.exit(0);
                }
  });
}

//this method is called when the button is clicked
public void itemStateChanged(ItemEvent ie) {

  repaint();  //calls paint method
}
   //display current state of checkboxes
public void paint(Graphics g) {
    g.drawString("current state",10,100);
            msg="Bold:"+c1.getState();
//Font f=new Font("TimesNewRoman",Font.BOLD,20);
//g.setFont(f);
g.drawString(msg,10,120);

            msg="Italic:"+c2.getState();
//Font f1=new Font("TimesNewRoman",Font.ITALIC,20);
//g.setFont(f1);
g.drawString(msg,10,140);
            msg="Underline:"+c3.getState();
g.drawString(msg,10,160);
}

public static void main(String args[]) {
       //create the frame
             awt11 mb=new awt11();
             mb.setSize(400,400);
              mb.setTitle(" Push buttons to change background");
              mb.setVisible(true);
  }
}