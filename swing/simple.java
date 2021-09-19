import java.awt.event.*;
import java.awt.*;
import javax.swing.*;
public class simple extends JFrame
{
    JLabel lfv,lsv,lans;
    JTextField tfv,tsv;
    JButton ba;
    void setComponents()
	{
     lfv=new JLabel("Enter the First Value");
     lsv=new JLabel("Enter the second value");
     lans=new JLabel();
     tfv=new JTextField();
     tsv=new JTextField();
     ba=new JButton("Add");
     setLayout(null);
     setSize(600,600);
     lfv.setBounds(20,100,150,20);
     lsv.setBounds(20,150,150,20);
     tfv.setBounds(250,100,150,20);
     tsv.setBounds(250,150,150,20);
     ba.setBounds(20,200,80,20);
     lans.setBounds(250,200,200,20);
     add(lfv);
     add(lsv);
     add(lans);
     add(tfv);
     add(tsv);
     add(ba);
     ba.addActionListener(new Myhandler1());
     }
public class Myhandler1 implements ActionListener
{
	public void actionPerformed(ActionEvent e)
	{
		int a,b,c;
		a=Integer.parseInt(tfv.getText());
		b=Integer.parseInt(tsv.getText());
		c=a+b;
		lans.setText("Your Addition is:" +c);
	}
}
public static void main(String args[])
{
	simple sc= new simple();
	sc.setComponents();
	sc.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    sc.setVisible(true);
}

}
