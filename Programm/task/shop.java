import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class shop extends Applet implements ActionListener
{
Checkbox c1,c2,c3,c4;
CheckboxGroup cg1,cg2,cg3,cg4;
Checkbox r1,r2,r3,r4,r5,r6,r7,r8;
TextField t1,t2,t3,t4;
Button b1;
Label l1,l2,l3,l4,l5,l6,l7,l8;


public void init()
{
cg1=new CheckboxGroup();
cg2=new CheckboxGroup();
cg3=new CheckboxGroup();
cg4=new CheckboxGroup();
setLayout(new GridLayout(5,8,10,5));

c1=new Checkbox("Rosogolla");
r1=new Checkbox("5 Units",cg1,true);
r2=new Checkbox("10 Units",cg1,false);
l1=new Label("Price :",Label.RIGHT);
t1=new TextField("5");
add(c1);add(r1);add(r2);add(l1);add(t1);
t1.setBounds(10,0,20,5);

c2=new Checkbox("Pantua");
r3=new Checkbox("5 Units",cg2,true);
r4=new Checkbox("10 Units",cg2,false);
l2=new Label("Price :",Label.RIGHT);
t2=new TextField("5");
add(c2);add(r3);add(r4);add(l2);add(t2);

c3=new Checkbox("Sandash");
r5=new Checkbox("5 Units",cg3,true);
r6=new Checkbox("10 Units",cg3,false);
l3=new Label("Price :",Label.RIGHT);
t3=new TextField("5");
add(c3);add(r5);add(r6);add(l3);add(t3);

c4=new Checkbox("Chittaranjan");
r7=new Checkbox("5 Units",cg4,true);
r8=new Checkbox("10 Units",cg4,false);
l4=new Label("Price :",Label.RIGHT);
t4=new TextField("5");
add(c4);add(r7);add(r8);add(l4);add(t4);

l5=new Label();
l6=new Label();
l7=new Label();
l8=new Label();
b1=new Button("Submit");
add(l5);add(l6);add(b1);
b1.addActionListener(this);
add(l7);add(l8);

}
public void actionPerformed(ActionEvent e)
{

{  if(e.getSource()==b1)
	{
	//DialogExample();
	}

}
}
}