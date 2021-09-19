import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="addition" height="400" width="300">
</applet>*/
public class subtraction extends Applet
{
	Label l1,l2;
	Textfield t1,t2;
	Button button;
	public class init()
	{
		l1=new Label("Enter the first number");
		l2=new Label("Enter the second number");
		t1=new Textfield();
		t2=new Textfield();
		button=new button("Subtraction");
		setLayout(null);
		l1.setBounds(30,50,100,20);
		l2.setBounds(30,100,100,20);
		t1.setBounds(150,50,100,20);
		t2.setBounds(100,150,80,20);
	Add(l1);
	Add(l2);
	Add(t1);
	Add(t2);
	Add(button);
	button.addActionListener(new subtraction());
	}
public class subtraction1 implements ActionListener
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