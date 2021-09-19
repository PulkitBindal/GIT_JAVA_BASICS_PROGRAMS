import javax.swing.*;
public class example3 extends JFrame 
{
	JLabel b1;
	public void(String s)
	{
      super(s);
	}
	public void setComponents()
	{
     b1=new JLabel("First Number");
     t1=new JTextField();
     JFrame jf=new JFrame();
     setLayout(null);
     b1.setBounds(20,20,100,20);
     t1.setBounds(220,20,100,20);
     add(b1);
     add(t1);
    }
    public static void main(String arg[])
    {
    	example3 e3=new example3("ARITHMETIC");
        e3.setVisible(true);
        e3.setSize(800,800);
        e3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        e3.setComponents();
    }
}