import javax.swing.*;
public class example2 extends JFrame
{
	
JLabel j;
JButton b;
JTextField t;
public example2(String n)
	{
		super(n);
	}
public void setComponents()
	{
		j=new JLabel("Thanks");
		b=new JButton("+");
		t=new JTextField();
		setLayout(null);
		j.setBounds(20,20,100,20);
		b.setBounds(40,40,100,20);
		t.setBounds(60,60,100,20);
		add(j);
		add(b);
		add(t);

	}
public static void main(String args[])
	{
		example2 jj=new example2("WhatsApp");
		jj.setVisible(true);
		jj.setSize(500,500);
		jj.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jj.setComponents();
	}
}