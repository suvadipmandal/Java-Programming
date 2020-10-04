import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;

public class num2word extends Applet implements ActionListener
{
TextField t1;
Button b1;
Label l1;

public void init()
{
setLayout(new GridLayout(3,1,30,30));
t1=new TextField(3);
b1=new Button("Enter");
l1=new Label();
add(t1);add(b1);add(l1);b1.addActionListener(this);
}

public void actionPerformed(ActionEvent e)
{

}
}