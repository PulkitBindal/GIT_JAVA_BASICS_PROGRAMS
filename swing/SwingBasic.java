import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
public class SwingBasic extends JFrame
{
    JLabel l;
    public void start()
    {
        l=new JLabel();
        l.setText("Name:");
        JTextField txt=new JTextField();
        txt.setText("");
        JPasswordField ps=new JPasswordField(10);
        JButton but=new JButton("CLICK ME");
        l.setBounds(40,100,200,20);
        txt.setBounds(80,100,100,20);

        add(l);
        add(txt);
        add(ps);
        add(but);
        but.addActionListener(new ActionListener()
        {
         public void actionPerformed(ActionEvent e)
         {
            l.setText("Button clicked");
         }
        }
        );
        setLayout(new FlowLayout());
        setSize(400,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
public static void main(String args[])
    {
        new SwingBasic().start();
    }
}