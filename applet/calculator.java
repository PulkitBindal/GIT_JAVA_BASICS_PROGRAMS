import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="calculator" width="800" height="400">
</applet> */
public class calculator extends Applet
{
       Label l1,l2,l3;
       TextField t1,t2;
       Button b1,b2,b3,b4;  
   public void init()
  {
       l1=new Label("First Quantity");
       l2=new Label("Second Quantity");
       t1=new TextField();
       t2=new TextField();
       Button b1=new Button("Summation");
       Button b2=new Button("Subtration");
       Button b3=new Button("Division");
       Button b4=new Button("Multiplication");
       l3=new Label("");
       setLayout(null);
       l1.setBounds(30,50,100,20);//left,top,width,height
       l2.setBounds(30,100,100,20);
       t1.setBounds(150,50,100,20);
       t2.setBounds(150,100,100,20);
       b1.setBounds(100,150,80,20);
       l3.setBounds(30,200,150,20);
       b2.setBounds(200,150,100,20);
       b3.setBounds(400,150,100,20);
       b4.setBounds(600,150,100,20);
       add(l1);
       add(l2);
       add(t1);
       add(t2);
       add(b1);
       add(l3);
       add(b2);
       add(b3);
       add(b4);
       b1.addActionListener(new Myhandler1());
       b2.addActionListener(new Myhandler2());
       b3.addActionListener(new Myhandler3());
       b4.addActionListener(new Myhandler4());
}
 public class Myhandler1 implements ActionListener
{
 	public void actionPerformed(ActionEvent e)
{
 		double a,b,c;
 		a=Double.parseDouble(t1.getText());
 		b=Double.parseDouble(t2.getText());
 		c=a+b;
 		l3.setText("Summation is="+c);
}
}
  public class Myhandler2 implements ActionListener
{
  public void actionPerformed(ActionEvent e)
  {
    double a,b,c;
    a=Double.parseDouble(t1.getText());
    b=Double.parseDouble(t2.getText());
    c=a-b;
    l3.setText("Subtraction is="+c);
  }
}
  public class Myhandler3 implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
    double a,b,c;
    a=Double.parseDouble(t1.getText());
    b=Double.parseDouble(t2.getText());
    c=a/b;
    l3.setText("Division is="+c);
  }
}
  public class Myhandler4 implements ActionListener
 {
  public void actionPerformed(ActionEvent e)
  {
   double a,b,c=1;
    a=Double.parseDouble(t1.getText());
    b=Double.parseDouble(t2.getText());
    c=a*b;
    l3.setText("Multiplication is="+a*b);
  }
}
}