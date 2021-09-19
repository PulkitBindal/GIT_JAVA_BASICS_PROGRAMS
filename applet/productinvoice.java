import java.awt.Graphics;
import java.applet.Applet;
import java.awt.event.*;
import java.awt.*;
/*<applet code="productinvoice" height="800" width="600">
</applet>*/
public class productinvoice extends Applet
{
	int a,b,c,d,e,f,g,h,i,j;
	public void paint(Graphics w)
	{
		w.drawString("PRODUCT INVOICE",200,10);
	}
	Label lni,lnb,lpq,lpp,lsp,lsq,bill,bill2,bill3,bill4,bill5,bill6;
	TextField tni,tnb,tpq,tpp,tsp,tsq;
	Button br,br2,bsq,bsv,bopl,btpl;
	public void init()
	{
		lni=new Label("Name Of Item");
		lnb=new Label("Name Of Brand");
		lpq=new Label("Purchase Quantity");
		lpp=new Label("Purchase Price");
		bill=new Label("");
		bill2=new Label("");
		bill3=new Label("");
		bill6=new Label("");
		lsq=new Label("Selling Quantity");
		lsp=new Label("Selling Price");
		bill4=new Label("");
		bill5=new Label("");
		tni=new TextField();
		tnb=new TextField();
		tpq=new TextField();
		tpp=new TextField();
		tsp=new TextField();
		tsq=new TextField();
		Button br=new Button("**Bill 1**");
		Button br2=new Button("**Bill 2**");
		Button bsq=new Button("Stock Quantity");
		Button bsv=new Button("Stock Value");
		Button bopl=new Button("One Product Profit/Loss");
		Button btpl=new Button("Total Profit/Loss");
		setLayout(null);
		lni.setBounds(20,50,100,20);
		lnb.setBounds(20,100,100,20);
		lpq.setBounds(20,150,120,20);
		lpp.setBounds(20,200,100,20);
		tni.setBounds(180,50,150,20);
		tnb.setBounds(180,100,150,20);
		tpq.setBounds(180,150,150,20);
		tpp.setBounds(180,200,150,20);
		bill.setBounds(180,250,190,20);
		br.setBounds(20,250,100,20);
		lsq.setBounds(20,300,120,20);
		lsp.setBounds(20,350,120,20);
		tsq.setBounds(180,300,150,20);
		tsp.setBounds(180,350,150,20);
		br2.setBounds(20,400,100,20);
		bill2.setBounds(180,400,150,20);
		bsq.setBounds(20,450,100,20);
		bsv.setBounds(20,500,100,20);
        bill3.setBounds(180,450,180,20);
		bill4.setBounds(180,500,180,20);
		bopl.setBounds(20,550,140,20);
		bill5.setBounds(180,550,180,20);
		btpl.setBounds(20,600,120,20);
		bill6.setBounds(180,600,150,20);
		add(lni);
		add(lnb);
		add(lpq);
		add(lpp);
		add(tni);
		add(tnb);
		add(tpq);
		add(tpp);
		add(br);
		add(bill);
		add(lsp);
		add(lsq);
		add(tsp);
		add(tsq);
		add(br2);
		add(bill2);
		add(bsq);
		add(bsv);
		add(bill3);
		add(bill4);
		add(bopl);
		add(bill5);
		add(btpl);
		add(bill6);
		br.addActionListener(new Myhandler1());
		br2.addActionListener(new Myhandler2());
		bsq.addActionListener(new Myhandler3());
		bsv.addActionListener(new Myhandler4());
		bopl.addActionListener(new Myhandler5());
		btpl.addActionListener(new Myhandler6());

      }
public class Myhandler1 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		a=Integer.parseInt(tpq.getText());
		b=Integer.parseInt(tpp.getText());
		c=a*b;
	    bill.setText("Your purchase bill is="+c);
	}
}
public class Myhandler2 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		d=Integer.parseInt(tsq.getText());
		e=Integer.parseInt(tsp.getText());
		f=d*e;
		bill2.setText("Your selling bill is="+f);
	}
}
public class Myhandler3 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		g=a-d;
		bill3.setText("The Stock Quantity is="+g);
	}
}
public class Myhandler4 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		h=b*g;
		bill4.setText("The Stock Value is="+h);

	}
}
public class Myhandler5 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		i=e-b;
		bill5.setText("One Product Profit/Loss is="+i);
	}
}
public class Myhandler6 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		j=i*d;
		bill6.setText("Total Profit/Loss is="+j);
	}
}
}