import java.awt.*;
import java.awt.event.*;

public class myfast extends WindowAdapter
{
Frame f;
TextArea t1;
Button b1,b2;
myfast()
{
f=new Frame("window");
f.addWindowListener(this);
f.setSize(600,400);
f.setVisible(true);
f.setLayout(new GridLayout(2,1));
t1=new TextArea(200);
f.add(t1);
f.add(op());
}

p

public void windowClosing(WindowEvent e)
{
f.dispose();
}

public static void main(String args[])
{
new myfast();
}}