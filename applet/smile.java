import java.awt.*;
import java.applet.*;
/*<applet code="smile" height="700" width="500"></applet>*/
public class smile extends Applet
{
	public void paint(Graphics g)
	{	
	//g.setColor(Color.YELLOW);
		g.drawOval(40,40,120,150);// headd
		g.setColor(Color.RED);
		g.drawOval(57,75,30,20);//left eye
		g.drawOval(110,75,30,20);// right eye
		g.setColor(Color.GREEN);
		g.fillOval(68,81,10,10);//fill eye left
		g.fillOval(121,81,10,10);//fill right eye
		g.setColor(Color.PINK);
		g.drawOval(85,100,30,30);//nose
		g.fillArc(60,125,80,40,180,180); // mouth
		g.drawOval(25,92,15,30);//left tear
		g.drawOval(160,92,15,30);//right tear

	}
}
