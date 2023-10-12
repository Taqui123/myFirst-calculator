import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class menuwork extends JFrame implements ActionListener {

    JFrame f;

    JMenuBar mb;
    JMenu m1;
    JMenuItem i1,i2,i3;

    public menuwork()
    {

        f = new JFrame();
        f.setLayout(new FlowLayout());
        mb=new JMenuBar();
        m1 = new JMenu("MY MENU");

        i1 = new JMenuItem("Welcome");
        i2 = new JMenuItem("ThankYou");
        i3 = new JMenuItem("Exit");

        m1.add(i1);
        m1.add(i2);
        m1.add(i3);

        mb.add(m1);
        f.setJMenuBar(mb);

        i1.addActionListener(this);
        i2.addActionListener(this);
        i3.addActionListener(this);
        f.setSize(400,400);
        f.setVisible(true);
    }

    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource()==i1)
        {
            JOptionPane.showMessageDialog(null,"Welcome to java");
        } else if (e.getSource()==i2)
        {
            JOptionPane.showMessageDialog(null,"ThankYou for visiting");
        } else if (e.getSource()==i3)
        {
            JOptionPane.showMessageDialog(null,"please wait -->Exiting program ");
        }
    }

    public static void main(String[] args)
    {
        new menuwork();
    }
}
