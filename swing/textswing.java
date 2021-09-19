import javax.swing.*;
public class testswing extends JFrame
{
	testFrame()
	{
	JButton bt1=new JButton("YES");
	JButton bt2=new JButton("NO");
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
	setLayout(new FlowLayout());
    setSize(400,400);
    add(bt1);
    add(bt2);
	setVisible(true);
	}
public staic void main(String arg[])
{
	new testswing(); 
}
}