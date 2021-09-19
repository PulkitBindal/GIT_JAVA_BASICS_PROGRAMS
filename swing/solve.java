import java.awt.event.*; 
import java.awt.*; 
import javax.swing.*; 
class solve extends JFrame 
{
    void setComponents()
    {
    JLabel lyn;
    JTextField tyn;
    lyn=new JLabel("Tick whether you are satisfied or not ?");
    tyn=new JTextField("");
    setLayout(null);
    setVisible(true);
    setSize(400,300);
    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    add(lyn);
    add(tyn);
    lyn.setBounds(20,50,220,20);
    tyn.setBounds(260,50,100,20);
    }
public static void main(String args[])
{
    solve sl=new solve();
    sl.setComponents();
}
}