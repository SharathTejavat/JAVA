import java.awt.*;
import java.awt.event.*;
class awt7 extends Frame {

      awt7() {
                this.addWindowListener(new WindowAdapter() 
                {
                       public void windowClosing(WindowEvent e)
                        {
                              System.exit(0);
                         }
                });
     }
    public void paint(Graphics g)
    {
            //set back ground color for frame 
              this.setBackground(new Color(100,20,20));
 
              //set font for the text
               Font f=new Font("Arial",Font.BOLD+Font.ITALIC,30);
               g.setFont(f);

             //set foreground color
               g.setColor(Color.green);
 
            //display the message
             g.drawString("UGADI WISHES TO U ALL  ", 100,100);
  }
   public static void main(String args[])
   {
               awt7 m=new awt7();
                     m.setSize(1000,600);
                     m.setTitle("Happy new year");
                     m.setVisible(true);
   }
}