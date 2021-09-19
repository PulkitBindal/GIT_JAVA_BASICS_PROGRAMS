import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class farmer extends JFrame 
{
	void setComponents()
	{
	JLabel ln,lnb,lt,lst,ll,lhd;
    JCheckBox cs1,cs2,cs3,cs4;
    JButton bal;
	JTextField tn,tnb,tst,tl;
	ln=new JLabel("Enter the Name of Farmer");
	tn=new JTextField("");
	lnb=new JLabel("Enter the Contact Number");
	tnb=new JTextField("");
	lt=new JLabel("Please Select Your Monthly Salary Income (Put a Tick) ?");
	lst=new JLabel("Enter the State of Residency");
	tst=new JTextField("");
	ll=new JLabel("Area Of Land In Meter Sq ?");
	tl=new JTextField("");
	lhd=new JLabel("Farmer Registration form Offline (2019-2020)");
	//lbal=new JLabel("");
	bal=new JButton("Available Land");
	cs1=new JCheckBox("Below INR 20000");
	cs2=new JCheckBox("Between INR 20000 and INR 40000");
	cs3=new JCheckBox("Between INR 40000 and INR 80000");
	cs4=new JCheckBox("Above INR 80000");
    setLayout(null);
    ln.setBounds(40,80,150,20);
    tn.setBounds(220,80,150,20);
    lnb.setBounds(40,120,150,20);
    tnb.setBounds(220,120,150,20);
    lt.setBounds(40,160,320,20);
    cs1.setBounds(40,200,250,20);
    cs2.setBounds(40,240,250,20);
    cs3.setBounds(40,280,250,20);
    cs4.setBounds(40,320,250,20);
    lst.setBounds(40,360,200,20);
    tst.setBounds(220,360,150,20);
    ll.setBounds(40,400,200,20);
    tl.setBounds(220,400,150,20);
    lhd.setBounds(180,20,500,20);
     bal.setBounds(40,440,80,20);
    //lbal.setBounds(220,440,400,20);
    add(ln);
    add(tn);
    add(lnb);
    add(tnb);
    add(lt);
    add(cs1);
    add(cs2);
    add(cs3);
    add(cs4);
    add(tst);
    add(lst);
    add(ll);
    add(tl);
    add(lhd);
    //add(bal);
    //add(lbal);
    //bal.addActionListener(new Myhandler1());
}
/*class Myhandler1 implements ActionListener
{
   public void actionPerformed(ActionEvent z)
   {
    lbal.setText("The Available Land For this session is 5 Hectare Only");   
   }
}*/
public static void main(String args[])
{
	farmer fm=new farmer();
	fm.setComponents();
	fm.setVisible(true);
    fm.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    fm.setSize(700,800);
}    
}