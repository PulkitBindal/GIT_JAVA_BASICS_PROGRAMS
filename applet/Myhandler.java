import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="Myapplet" height="400" width="300">
</applet>*/
public class Myapplet extends Applet
{
	public void init()
	{
	Label l1,l2,l3;
	Textfield t1,t2;
	Button button;
		l1=new Label("Enter the first number");
		l2=new Label("Enter the second number");
		l3=new Label("");
		t1=new TextField();
		t2=new TextField();
		button=new button("Subtraction");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(100,150,80,20);
		l3.setBounds(30,180,100,20);
	add(l1);
	add(l2);
	add(t1);
	add(t2);
	add(button);
	add(l3);
	button.addActionListener(new subtraction());
	}
}
public class Myhandler implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
       int a,b,s;
       a=integer.parseInt(t1.getText());
       b=integer.parseInt(t2.getText());
       s=a+b;
       l3.setText("Sum of two numbers are="+s);
	}
} 