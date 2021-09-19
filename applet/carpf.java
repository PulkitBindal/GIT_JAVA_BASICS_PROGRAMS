import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.applet.Applet;
/*<applet code="carpf" height="500" width="500">
</applet>*/
public class carpf extends Applet
{
	public void paint(Graphics d)
	{
		d.drawString("CAR PRICE INFORMATION FORM(2019-2020)",120,10);
		d.drawString("(District-Ghaziabad)",190,25);
    }
    Label ln,lsc,blg1,brr2,bf3,bj4,bb5,bam6,ltfs;
    TextField tn;
    Button blg,brr,bf,bj,bb,bam;
    public void init()
    {
     ln=new Label("Enter the Candidate's Name");
     lsc=new Label("***Please Select Your Choice***");
     ltfs=new Label("***Thanks For Your Visit***");
     blg1=new Label("");
     brr2=new Label("");
     bf3=new Label("");
     bj4=new Label("");
     bb5=new Label("");
     bam6=new Label("");
     tn=new TextField();
     Button blg=new Button("LAMBORGHINI");
     Button brr=new Button("ROLLS ROYCE");
     Button bf=new Button("FERRARI");
     Button bj=new Button("JAGUAR");
     Button bb=new Button("BENTLEY");
     Button bam=new Button("ASTON MARTIN");
     setLayout(null);
     ln.setBounds(20,40,180,20);
     tn.setBounds(220,40,150,20);
     lsc.setBounds(150,80,180,20);
     blg.setBounds(20,120,100,20);
     brr.setBounds(20,160,100,20);
     bf.setBounds(20,200,100,20);
     bj.setBounds(20,240,100,20);
     bb.setBounds(20,280,100,20);
     bam.setBounds(20,320,100,20);
     blg1.setBounds(180,120,180,20);
     brr2.setBounds(180,160,180,20);
     bf3.setBounds(180,200,180,20);
     bj4.setBounds(180,240,180,20);
     bb5.setBounds(180,280,180,20);
    bam6.setBounds(180,320,180,20);
    ltfs.setBounds(170,380,180,20);
     add(ln);
     add(tn);
     add(lsc);
     add(blg);
     add(brr);
     add(bf);
     add(bj);
     add(bb);
     add(bam);
     add(blg1);
     add(brr2);
     add(bf3);
     add(bj4);
     add(bb5);
     add(bam6);
     add(ltfs);
     blg.addActionListener(new Myhandler1());
     brr.addActionListener(new Myhandler2());
     bf.addActionListener(new Myhandler3());
     bj.addActionListener(new Myhandler4());
     bb.addActionListener(new Myhandler5());
     bam.addActionListener(new Myhandler6()); 
}
public class Myhandler1 implements ActionListener
{
public void actionPerformed(ActionEvent z)
{
	blg1.setText("Price=Rs:2.91 Crores");
}
}  
public class Myhandler2 implements ActionListener
{
public void actionPerformed(ActionEvent z)
{
    brr2.setText("Price=Rs:8.99 Crores");
}
}
public class Myhandler3 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
    bf3.setText("Price=Rs:5.20 Crores");
  	}
}

public class Myhandler4 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
    bj4.setText("Price=Rs:2.80 Crores");
  	}
}

public class Myhandler5 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
    bb5.setText("Price=Rs:2.45 Crores");
  	}
}

public class Myhandler6 implements ActionListener
{
	public void actionPerformed(ActionEvent z)
	{
    bam6.setText("Price=Rs:3.97 Crores");
  	}
}
}