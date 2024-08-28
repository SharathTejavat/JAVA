import java.awt.*;
class app{

public static void main(String[] args){
  Frame f= new Frame("my App");
  f.setLayout(new FlowLayout());
  Button b= new Button("sk");
  Label l= new Label("Name");
  TextField tf= new TextField(20);
  f.add(b);
  f.add(tf);
  f.add(l);
  f.setSize(200,200);
  f.setVisible(true);


}




}
