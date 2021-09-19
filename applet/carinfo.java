import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.applet.Applet;
/*<applet code="carinfo" height="400" width="500">
</applet>*/
public class carinfo extends Applet
{
	public void paint(Graphics d)
	{
		d.drawString("CAR PURCHASE FORM",160,10);
    }
    Label ln;
    TextField tn;
    //Button bg;
    public void init()
    {
     ln=new Label("Enter the Costomer's Name");
     //lp=new Label("Enter the price of the car");
     //b1=new Label("");
     tn=new TextField();
     //tp=new TextField();
     //Button bg=new Button("Buy Now");*/
     setLayout(null);
     ln.setBounds(20,40,180,20);
     tn.setBounds(200,40,150,20);
     //lp.setBounds(20,80,100,20);
     //tp.setBounds(220,80,100,20);
     //bg.setBounds(20,80,30,20);
     //b1.setBounds(220,80,200,20);*/
     add(ln);
     add(tn);
     //add(bg);
     //add(lp);
     //add(tp);
     //add(b1);
     //bg.addActionListener(new Myhandler());
    /*}
}
public class Myhandler implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
     int a;
     a=Integer.parseInt(tp.getText());
     b1.setText("**Now You have to pay the amount ASAP**"+a);
  	}*/
}
}