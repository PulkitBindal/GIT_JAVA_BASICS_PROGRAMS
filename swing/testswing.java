import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
public class testswing extends JFrame
{
	testswing()
	{
	JButton bt1=new JButton("YES");
	JButton bt2=new JButton("NO");
    setLayout(null);
    setSize(300,300);
    bt1.setBounds(20,20,80,20);
    bt2.setBounds(20,60,80,20);
    add(bt1);
    add(bt2);
	
	}
public static void main(String args[]) 
 {
	testswing o=new testswing(); 
	o.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	o.setVisible(true);
 }
}