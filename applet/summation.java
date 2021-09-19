import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="summation" width="300" height="200">
</applet> */
public class summation extends Applet
    {
       Label l1,l2,l3;
       TextField t1,t2;
       Button b1;
   public void init()
    {
       l1=new Label("First Number");
       l2=new Label("Second Number");
       t1=new TextField();
       t2=new TextField();
       Button b1=new Button("Summation");
       l3=new Label("");
       setLayout(null);
       l1.setBounds(30,50,100,20);
       l2.setBounds(30,100,100,20);
       t1.setBounds(150,50,100,20);
       t2.setBounds(150,100,100,20);
       b1.setBounds(100,150,80,20);
       l3.setBounds(30,180,100,20);
       add(l1);
       add(l2);
       add(t1);
       add(t2);
       add(b1);
       add(l3);
       b1.addActionListener(new Myhandler());

   }
 public class Myhandler implements ActionListener
 {
 	public void actionPerformed(ActionEvent e)
 	{
 		int a,b,c;
 		a=Integer.parseInt(t1.getText());
 		b=Integer.parseInt(t2.getText());
 		c=a+b;
 		l3.setText("Summation is="+c);

 	}

   }
 }