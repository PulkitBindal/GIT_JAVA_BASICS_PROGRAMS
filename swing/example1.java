import javax.swing.*;
public class example1
{
	public static void main(String arg[])
	{
		JFrame f=new JFrame();
		JButton b=new JButton("CLICK ME");
		b.setBounds(130,100,100,20);
		f.add(b);
		f.setSize(400,500);
		f.setLayout(null);
		f.setVisible(true);
	}
}