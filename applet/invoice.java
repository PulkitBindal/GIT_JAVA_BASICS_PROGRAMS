import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
/*<applet code="invoice" width="550" height="590">
</applet>*/
public class invoice extends Applet
{
	int a,b,c,d,e,f;
	Label lbd,lpn,lpc,lpq,lpp,ll,ld,np;
	TextField tpn,tpc,tpq,tpp,tbd,dis,npa;
	Button bp;
	public void paint(Graphics w)
	{
		w.drawLine(190,20,299,20);
        w.drawRect(190,440,170,80);
		w.drawString("SALES INVOICE",200,10);
		w.drawString("**THANKS FOR VISIT**",210,470);
		w.drawString("**PLEASE COME AGAIN**",210,500);
		w.drawString("MOBILE NO.= 9999999927",20,480);
		w.drawString("ADDRESS: RAJNAGAR EXTENSION,GHAZIABAD",370,480);
	}
	public void init()
	{
		lpn=new Label("Enter the Product Name.");
		tpn=new TextField();
		lpc=new Label("Enter the Product Brand");
		tpc=new TextField();
		lpq=new Label("Enter the Purchase Quantity");
		tpq=new TextField();
		lpp=new Label("Enter the Product price");
		tpp=new TextField();
		lbd=new Label("Enter the discount percentage");
		tbd=new TextField();
		ll=new Label("");
		ld=new Label("");
		np=new Label("");
		Button bp=new Button("**Bill**");
		Button dis=new Button("**Discount**");
		Button npa=new  Button("**Net Bill**");
        setLayout(null);
		lpn.setBounds(20,40,200,20);
		tpn.setBounds(220,40,100,20);
		lpc.setBounds(20,80,200,20);
		tpc.setBounds(220,80,100,20);
		lpq.setBounds(20,120,200,20);
		tpq.setBounds(220,120,100,20);
		lpp.setBounds(20,160,200,20);
		tpp.setBounds(220,160,100,20);
		lbd.setBounds(20,200,170,20);
		tbd.setBounds(220,200,100,20);		
	    bp.setBounds(20,250,100,20);
		ll.setBounds(200,250,140,20);
	    dis.setBounds(20,300,100,20);
	    ld.setBounds(200,300,180,20);
	    npa.setBounds(20,350,100,20);
	    np.setBounds(200,350,180,20);
	    add(lpn);
		add(tpn);
		add(tpc);
		add(lpc);
		add(lpq);
		add(tpq);
		add(lpp);
		add(tpp);
		add(bp);
		add(lbd);
		add(ll);
		add(tbd);
		add(dis);
		add(ld);
		add(npa);
		add(np);
		bp.addActionListener(new Myhandler1());
        dis.addActionListener(new Myhandler2());
        npa.addActionListener(new Myhandler3());
}
public class Myhandler1 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
		{
			a=Integer.parseInt(tpq.getText());
			b=Integer.parseInt(tpp.getText());
            c=a*b;
            ll.setText("Total Bill Rs="+c);
		}
}
public class Myhandler2 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		d=Integer.parseInt(tbd.getText());
		e=(c*d)/100;
	   ld.setText("Total Discount % is= "+e);
	}

}
public class Myhandler3 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		f=c-e;
		np.setText("Total bill paid="+f);
	}
}
}
