//choice box demo
import java.awt.*;
import java.awt.event.*;
class awt14 extends Frame implements ItemListener {
   //vars
    String msg;
   Choice ch;

    awt14() {
          //set flow layout to frame
         setLayout(new FlowLayout());

      //create an empty choice menu
    ch=new Choice();

     //add some items to choice menu
   ch.add("OOP");
   ch.add("COA");
  ch.add("FLAT");
  ch.add("SL");
  ch.add("DAA");
  ch.add("OS");
  ch.add("DM");
  ch.add("DBMS");
  ch.add("AI");
  ch.add("CNW");
   ch.add("DL");
  ch.add("PS");
  ch.add("SE");
  ch.add("WT");
   
//add the choice menu to frame
 add(ch);

//add item listener to choice menu
ch.addItemListener(this);

//close the frame
addWindowListener(new WindowAdapter() {
             public void windowClosing(WindowEvent we) {
                       System.exit(0);
                }
  });

}

//this method is called when any item is clicked
public void itemStateChanged(ItemEvent ie) {
   //call paint() method
    repaint();
}


//display selected items from choice menu
public void paint(Graphics g)
{
     g.drawString("slected subjects :", 10,100);
  msg=ch.getSelectedItem();
   g.drawString(msg,10,120);
}

public static void main(String args[]) {
   //create frame
    awt14 mc=new awt14();
   mc.setTitle("My choide box");
   mc.setSize(400,350);
  mc.setVisible(true);
 }
}