import java.applet.Applet;
import java.awt.*;
import java.awt.event.*;
/*<applet code="circle" width="300" height="300">
</append>*/
public class circle extends Applet
{
	public void paint(Graphics g)
	{
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				g.drawOval(90,i*50+10,50,50);
				g.setColor(Color.black);

			}
			else
			{
				g.drawOval(90,i*50+10,50,50);
				g.setColor(Color.red);
			}
		}
	}
}