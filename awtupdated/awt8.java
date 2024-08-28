import java.awt.*;
import java.awt.event.*;
class awt8 extends Frame {
  
   //staic type image class object
   static Image img;

      awt8() 
      {
          // load the image into Image object
          img=Toolkit.getDefaultToolkit().getImage("rabbit.jpg");
  
          //wait till the image is loaded into img object
          //create MediaTracker for this purpose
         MediaTracker track=new MediaTracker(this);
         //jvm uses seperate thread to load the image
             //add image to Mediatracker
              track.addImage(img,0);
              try{
                    //let the jvm wait till the image is loaded completely
                      track.waitForID(0);
                 } catch(InterruptedException ie) { }
                //close the frame
                 addWindowListener(new WindowAdapter() {
                      public void windowClosing(WindowEvent we) {
                                  System.exit(0);
                       }
                    });
}

public void paint(Graphics g)
{
     //display the image in the frame at 50,50 pixels . size of image 600, 450
          g.drawImage(img,50,50,600,450,null);
   }

public static void main(String args[])
 {
          //create  the frame
               awt8 i=new awt8();

           //set the size and title
              i.setSize(1000,800);
               i.setTitle("Flight");

 //display the same image in the title bar of frame
  i.setIconImage(img);

 //display the frame
  i.setVisible(true);
   }
 }


                      
                   