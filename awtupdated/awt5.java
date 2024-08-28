import java.awt.*;
import java.awt.event.*;
class awt5 extends Frame {

      awt5() {
                this.addWindowListener(new WindowAdapter() 
                {
                       public void windowClosing(WindowEvent e)
                        {
                              System.exit(0);
                         }
                });
     }

//paint() of Component class. automatically called when a frame is created and displayed

     public void paint(Graphics g) {
 
     //set blue color for drawing 
         g.setColor(Color.blue);
     // display a rectangle to contain in drawing
         g.fillRect(40,40,200,200);
     // face
           g.setColor(Color.yellow);
          g.fillOval(90,70,80,80);

      //eyes
          g.setColor(Color.black);
          g.fillOval(110,95,5,5);
          g.fillOval(145,95,5,5);
    //nose
         g.drawLine(130,95,130,115);
g.setColor(Color.red);
    //mouth
        g.fillArc(113,115,35,20,0,-180);
     }
        public static void main(String args[]) {
           //create the frame
            awt5 d=new awt5();
         //set the size and title
            d.setSize(400,400);
            d.setTitle("My drawing");
         //display the frame
             d.setVisible(true);
      }
 }

     
   