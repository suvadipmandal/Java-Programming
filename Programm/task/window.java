import javax.swing.*;
import java.awt.*;

public class window
{
window()
{
JFrame f=new JFrame("Number To Word");
f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
Container p=f.getContentPane();
p.setLayout(new GridLayout(3,1));
p.add(fild1());
p.add(fild2());
p.add(fild3());
f.setSize(700,300);
//f.pack();
f.setVisible(true);
}

JPanel fild1(){
JPanel p=new JPanel();
p.add(new JTextArea(50,50));
return p;
}
JPanel fild2(){
JPanel p=new JPanel();
JButton b;
b=new JButton("SUBMIT",SwingConstants.CENTER);
p.add(b);
return p;
}
JPanel fild3(){
JPanel p=new JPanel();
p.add(new JLabel("Result",SwingConstants.CENTER));
return p;
}

public static void main(String args[])
{
new window();
}
}