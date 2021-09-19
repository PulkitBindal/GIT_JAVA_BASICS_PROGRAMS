import java.io.*;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
public class farmer1 extends JFrame 
{
		JLabel ln,lnb,lst,lpd;
		JTextField tn,tnb,tst,tpd;
		JButton bs;
	void setComponents()
	{
		ln=new JLabel("Enter your Name");
		tn=new JTextField();
		lnb=new JLabel("Enter the Contact Number");
	    tnb=new JTextField("");
	    lst=new JLabel("Enter the State of Residency");
     	tst=new JTextField("");
     	lpd=new JLabel("Enter the Password");
     	tpd=new JPasswordField("");
     	bs=new JButton("SUBMIT");
     	FileWriter filewriter;
		setLayout(null);
		ln.setBounds(20,50,200,20);
		tn.setBounds(210,50,100,20);
		lnb.setBounds(20,90,200,20);
		tnb.setBounds(210,90,100,20);
		lst.setBounds(20,130,200,20);
		tst.setBounds(210,130,100,20);
        tpd.setBounds(210,170,100,20);
		bs.setBounds(180,240,80,30);
		lpd.setBounds(20,170,100,20);
        add(ln);
        add(tn);
        add(lnb);
        add(tnb);
        add(lst);
        add(tst);
        add(bs);
        add(tpd);
        add(lpd);
        bs.addActionListener(new Myhandler1());

}
class Myhandler1 implements ActionListener
{
	public void actionPerformed(ActionEvent ae)
	{
     if(ae.getActionCommand()==bs.getActionCommand())
     {
     	try
     	{
     		FileWriter filewriter=new FileWriter("E:/java 2/farmer1 sheet.txt");
     		filewriter.write(ln.getText()+ " :  " +tn.getText());
     		System.out.println("--------------------");
             filewriter.write(lpd.getText()+ " :  " +tpd.getText());
             filewriter.close();
             JOptionPane.showMessageDialog(null,"File Successfully Saved !");

     	}catch(Exception e){JOptionPane.showMessageDialog(null, e+"");}
     }
	}
}
public static void main(String[] args) throws IOException 
{
	farmer1 f1=new farmer1();
	f1.setComponents();
	f1.setSize(450,400);
	f1.setDefaultCloseOperation(EXIT_ON_CLOSE);
	f1.setVisible(true);
}
}