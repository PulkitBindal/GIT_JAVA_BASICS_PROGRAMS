import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class checkbox extends JFrame
{
public checkbox()
{
	JCheckBox cb1=new JCheckBox("C++");
	JCheckBox cb2=new JCheckBox("JAVA");
    cb1.setBounds(50,50,100,20);
	cb2.setBounds(50,100,100,20);
    add(cb1);
    add(cb2);

}
public static void main(String args[])
{
	checkbox cb=new checkbox();
	cb.setVisible(true); 
	cb.setSize(400,400);
	cb.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

}
}