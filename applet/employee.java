import java.awt.*;
import java.applet.Applet;
import java.awt.Graphics;
import java.awt.event.*;
/*<applet code="employee" height="1000" width="1000">
</applet>*/
public class employee extends Applet
{
	int a,b,c,d,e,f,g,h,k,j,i,m;
	public void paint(Graphics z)
	{
		z.drawString("EMPLOYEE PAYROLL",300,10);
  }
	Label len,lep,les,lha,lda,lta,l,ll,lll,llll,p,n;
	TextField ten,tep,tes,tha,tda,tta;
	Button bha,bda,bta,bt,bto;
	Label lit,lpf,lins;
	TextField tit,tpf,tins;
    public void init()
    {
      len=new Label("Enter the employee name");
      lep=new Label("Enter the employee post");
      les=new Label("Enter the employee Salary");
      lha=new Label("HA in Percentage");
      lda=new Label("DA in Percentage");
      lta=new Label("TA in Percentage");
      l=new Label("");
      ll=new Label("");
      lll=new Label("");
      llll=new Label("");
      n=new Label("");
      p=new Label("");
      lit=new Label("Enter the Income Tax");
      lpf=new Label("Enter the Profit Fund");
      lins=new Label("Enter the Insurance Amt");
      tins=new TextField();
      tit=new TextField();
      tpf=new TextField();
      ten=new TextField();
      tep=new TextField();
      tes=new TextField();
      tha=new TextField();
      tda=new TextField();
      tta=new TextField();
      Button bha=new Button("**HA**");
      Button bda=new Button("**DA**");
      Button bta=new Button("**TA**");
      Button bt=new Button("TOTAL 1");
      Button bto=new Button("TOTAL 2");
      Button gp=new Button("**GP**");
      setLayout(null);
      len.setBounds(20,50,150,20);
      lep.setBounds(20,100,150,20);
      les.setBounds(20,150,150,20);
      ten.setBounds(220,50,150,20);
      tep.setBounds(220,100,150,20);
      tes.setBounds(220,150,150,20);
      lha.setBounds(20,200,150,20);
      lda.setBounds(20,250,150,20);
      lta.setBounds(20,300,150,20);
      tha.setBounds(220,200,150,20);
      tda.setBounds(220,250,150,20);
      tta.setBounds(220,300,150,20);
      bha.setBounds(20,350,40,20);
      bda.setBounds(20,400,40,20);
      bta.setBounds(20,450,40,20);
      l.setBounds(220,350,300,20);
      ll.setBounds(220,400,300,20);
      lll.setBounds(220,450,300,20);
      llll.setBounds(220,500,300,20);
      bt.setBounds(20,500,80,20);
      lit.setBounds(450,50,150,20);
      tit.setBounds(620,50,150,20);
      lpf.setBounds(450,100,150,20);
      tpf.setBounds(620,100,150,20);
      lins.setBounds(450,150,150,20);
      tins.setBounds(620,150,150,20);
      bto.setBounds(20,550,80,20);
      n.setBounds(220,550,300,20);
      gp.setBounds(20,600,80,20);
      p.setBounds(220,600,200,20);
      add(len);
      add(lep);
      add(les);
      add(lha);
      add(lda);
      add(lta);
      add(ten);
      add(tep);
      add(tes);
      add(tha);
      add(tda);
      add(tta);
      add(bha);
      add(bda);
      add(bta);
      add(l);
      add(ll);
      add(lll);
      add(llll);
      add(bt);
      add(lit);
      add(tit);
      add(lpf);
      add(tpf);
      add(lins);
      add(tins);
      add(bto);
      add(n);
      add(gp);
      add(p);
      bha.addActionListener(new Myhandler1());
      bda.addActionListener(new Myhandler2());
      bta.addActionListener(new Myhandler3());
      bt.addActionListener(new Myhandler4());
      bto.addActionListener(new Myhandler5());
      gp.addActionListener(new Myhandler6());

    }

public class Myhandler1 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		a=Integer.parseInt(tha.getText());
		d=Integer.parseInt(tes.getText());
		e=(d*a)/100;
		l.setText("The Home Allounce is="+e);
	}
}
public class Myhandler2 implements ActionListener
{
  public void actionPerformed(ActionEvent z)
  {
	b=Integer.parseInt(tda.getText());
  	d=Integer.parseInt(tes.getText());
  	f=(d*b)/100;
  	ll.setText("The Diet Allounce is="+f);
  }
}
public class Myhandler3 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		c=Integer.parseInt(tta.getText());
		d=Integer.parseInt(tes.getText());
		g=(d*c)/100;
		lll.setText("The Travel Allounce is="+g);
    }
}
public class Myhandler4 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
		h=d+e+f+g;
		llll.setText("The total amount you received is="+h);
  }
}
public class Myhandler5 implements ActionListener
{
  public void actionPerformed(ActionEvent z)
  {
    i=Integer.parseInt(tit.getText());
    j=Integer.parseInt(tpf.getText());
    k=Integer.parseInt(tins.getText());
    m=i+j+k;
    n.setText("The total amount you have to give is="+m); 
  }
}
public class Myhandler6 implements ActionListener
{
  public void actionPerformed(ActionEvent z)
   {
   p.setText("The net Balance you have is="+(d+e+f+g-i-j-k));
  }
}
}