import java.awt.*;   
class iconex {   
iconex(){   
Frame f=new Frame();   
Image icon = Toolkit.getDefaultToolkit().getImage("H:\\Adobe.png");  
f.setIconImage(icon);  
f.setLayout(null);   
f.setSize(400,400);   
f.setVisible(true);   
}   
public static void main(String args[]){   
new iconex();   
}   
} 