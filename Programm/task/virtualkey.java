import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class virtualkey extends Applet implements ActionListener
{
Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
Button c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,c11,c12,c13,c14;
Button d1,d2,d3,d4,d5,d6,d7,d8,d9,d10,d11,d12,d13;
Button f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f11,f12;
Button ctrl1,ctrl2,alt1,alt2,win,op;
Button bb1,bb2;
Label l0,l1,l2,l3,l4,l5,l6,l7;
TextArea t1;

public void init()
{

t1=new TextArea();
add(t1);add(pan());
setLayout(new GridLayout(4,14));
b1=new Button("`");
b2=new Button("1");
b3=new Button("2");
b4=new Button("3");
b5=new Button("4");
b6=new Button("5");
b7=new Button("6");
b8=new Button("7");
b9=new Button("8");
b10=new Button("9");
b11=new Button("0");
b12=new Button("-");
b13=new Button("=");
b14=new Button("Back");
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);

c1=new Button("Tab");
c2=new Button("q");
c3=new Button("w");
c4=new Button("e");
c5=new Button("r");
c6=new Button("t");
c7=new Button("y");
c8=new Button("u");
c9=new Button("i");
c10=new Button("o");
c11=new Button("p");
c12=new Button("[");
c13=new Button("]");
c14=new Button("|");
add(c1);add(c2);add(c3);add(c4);add(c5);add(c6);add(c7);add(c8);add(c9);add(c10);add(c11);add(c12);add(c13);add(c14);
/*
b1=new Button("`");
b2=new Button("1");
b3=new Button("2");
b4=new Button("3");
b5=new Button("4");
b6=new Button("5");
b7=new Button("6");
b8=new Button("7");
b9=new Button("8");
b10=new Button("9");
b11=new Button("0");
b12=new Button("-");
b13=new Button("=");
b14=new Button("Back");
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);

b1=new Button("`");
b2=new Button("1");
b3=new Button("2");
b4=new Button("3");
b5=new Button("4");
b6=new Button("5");
b7=new Button("6");
b8=new Button("7");
b9=new Button("8");
b10=new Button("9");
b11=new Button("0");
b12=new Button("-");
b13=new Button("=");
b14=new Button("Back");
add(b1);add(b2);add(b3);add(b4);add(b5);add(b6);add(b7);add(b8);add(b9);add(b10);add(b11);add(b12);add(b13);add(b14);
*/

}


public void actionPerformed(ActionEvent e)
{

}
}

