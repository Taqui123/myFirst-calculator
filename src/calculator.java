import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class calculator extends Frame implements ActionListener {

    JFrame f;

    JTextField t1;

    JPanel p1,p2,p3,p4,p5;
    JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14,b15,b16,b17,b18,b19,b20;

    JLabel l1;

    double a,b,c;

    Font fff;

    int flag;

    public calculator()
    {
        a = 0;
        f = new JFrame("Calculator");
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(new GridLayout(5,1));
        f.setResizable(false);

        fff = new Font("Free Ink", Font.BOLD,20);

        p1 = new JPanel();
        p1.setLayout(new GridLayout(2,1,10,5));
        p2 = new JPanel();
        p2.setLayout(new GridLayout(1,1,5,20));
        p3 = new JPanel();
        p3.setLayout(new GridLayout(1,1,5,20));
        p4 = new JPanel();
        p4.setLayout(new GridLayout(1,1,5,20));
        p5 = new JPanel();
        p5.setLayout(new GridLayout(1,1,5,20));


        b1 = new JButton("1");      //done
        b1.setFont(fff);
        b2 = new JButton("2");      //done
        b2.setFont(fff);
        b3 = new JButton("3");      //done
        b3.setFont(fff);
        b4 = new JButton("+");     //done
        b4.setFont(fff);
        b4.setBackground(Color.lightGray);
        b5 = new JButton("AC");     //done
        b5.setFont(fff);
        b5.setBackground(new Color(96, 130, 182));
        b6 = new JButton("4");      //done
        b6.setFont(fff);
        b7 = new JButton("5");      //done
        b7.setFont(fff);
        b8 = new JButton("6");      //done
        b8.setFont(fff);
        b9 = new JButton("-");     //done
        b9.setFont(fff);
        b9.setBackground(Color.lightGray);
        b10 = new JButton("Sin");   //done
        b10.setFont(fff);
        b10.setBackground(new Color(96, 130, 182));
        b11 = new JButton("7");     //done
        b11.setFont(fff);
        b12 = new JButton("8");     //done
        b12.setFont(fff);
        b13 = new JButton("9");     //done
        b13.setFont(fff);
        b14 = new JButton("*");     //done
        b14.setFont(fff);
        b14.setBackground(Color.lightGray);
        b15 = new JButton("Cos");   //done
        b15.setFont(fff);
        b15.setBackground(new Color(96, 130, 182));
        b16 = new JButton(".");     //done
        b16.setFont(fff);
        b16.setBackground(Color.lightGray);
        b17 = new JButton("0");     //done
        b17.setFont(fff);
        b17.setBackground(Color.lightGray);
        b18 = new JButton("00");    //done
        b18.setFont(fff);
        b18.setBackground(Color.lightGray);
        b19 = new JButton("/");     //done
        b19.setFont(fff);
        b19.setBackground(Color.lightGray);
        b20 = new JButton("=");     //done
        b20.setFont(fff);
        b20.setBackground(new Color(159, 226, 191));

        t1 = new JTextField(30);
        t1.setEditable(false);
        t1.setFont(fff);
        t1.setBackground(Color.white);
        /*t2 = new JTextField(30);
        t2.setEditable(false);
        it does not work here
        so call it off
        t2.setFont(fff);*/

        l1 = new JLabel("calculate me!");
        l1.setFont(fff);
        l1.setHorizontalAlignment(getInsets().right);

        p1.add(l1);
        p1.add(t1);
        //p1.add(t2);
        f.add(p1);

        p2.add(b1);
        p2.add(b2);
        p2.add(b3);
        p2.add(b4);
        p2.add(b5);
        f.add(p2);

        p3.add(b6);
        p3.add(b7);
        p3.add(b8);
        p3.add(b9);
        p3.add(b10);
        f.add(p3);

        p4.add(b11);
        p4.add(b12);
        p4.add(b13);
        p4.add(b14);
        p4.add(b15);
        f.add(p4);

        p5.add(b16);
        p5.add(b17);
        p5.add(b18);
        p5.add(b19);
        p5.add(b20);
        f.add(p5);

        b1.addActionListener(this);
        b2.addActionListener(this);
        b3.addActionListener(this);
        b4.addActionListener(this);
        b5.addActionListener(this);
        b6.addActionListener(this);
        b7.addActionListener(this);
        b8.addActionListener(this);
        b9.addActionListener(this);
        b10.addActionListener(this);
        b11.addActionListener(this);
        b12.addActionListener(this);
        b13.addActionListener(this);
        b14.addActionListener(this);
        b15.addActionListener(this);
        b16.addActionListener(this);
        b17.addActionListener(this);
        b18.addActionListener(this);
        b19.addActionListener(this);
        b20.addActionListener(this);

        f.setSize(480,400);
        f.setVisible(true);

    }

    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource()==b1)
        {
            t1.setText(t1.getText()+"1");
        } else if (e.getSource()==b2)
        {
            t1.setText(t1.getText()+"2");
        }else if (e.getSource()==b3)
        {
            t1.setText(t1.getText()+"3");
        } else if (e.getSource()==b4)
        {
            a = a+Double.parseDouble(t1.getText());
            l1.setText(t1.getText()+"+");
            t1.setText("");
            l1.setText(String.valueOf(a));

            flag = 1;
        } else if (e.getSource()==b5)
        {
            t1.setText("");
            l1.setText("");
            a=0;
            b=0;
            l1.setText("calculate me!");

        }else if (e.getSource()==b6)
        {
            t1.setText(t1.getText()+"4");
        } else if (e.getSource()==b7)
        {
            t1.setText(t1.getText()+"5");
        } else if (e.getSource()==b8)
        {
            t1.setText(t1.getText()+"6");
        } else if (e.getSource()==b9)
        {
            a = a-Double.parseDouble(t1.getText());
            l1.setText(t1.getText()+"-");
            t1.setText("");
            l1.setText(String.valueOf(a));

            flag = 2;
        } else if (e.getSource()==b10)
        {
            t1.setText("");
            l1.setText("please enter the value of angle in below text field");

            flag = 5;
        } else if (e.getSource()==b11)
        {
            t1.setText(t1.getText()+"7");
        } else if (e.getSource()==b12)
        {
            t1.setText(t1.getText()+"8");
        } else if (e.getSource()==b13)
        {
            t1.setText(t1.getText()+"9");
        } else if (e.getSource()==b14)
        {
            if(a==0)
                a=1;

            a = a*Double.parseDouble(t1.getText());
            l1.setText(t1.getText()+"*");
            t1.setText("");
            l1.setText(String.valueOf(a));

            flag = 3;
        } else if (e.getSource()==b15) {
            t1.setText("");
            l1.setText("please enter the value of angle in below text field");

            flag = 6;
        } else if (e.getSource()==b16)
        {
            t1.setText(t1.getText()+".");
        } else if (e.getSource()==b17)
        {
            t1.setText(t1.getText()+"0");
        } else if (e.getSource()==b18)
        {
            t1.setText(t1.getText()+"00");
        } else if (e.getSource()==b19)
        {
            if(a==0)
                a = 1;

            a = a/Double.parseDouble(t1.getText());
            l1.setText(t1.getText()+"/");
            t1.setText("");
            l1.setText(String.valueOf(a));

             flag = 4;
        } else if (e.getSource()==b20)
        {
            b = Double.parseDouble(t1.getText());

            if (flag==1)
            {
                c = a+b;
                t1.setText(String.valueOf(c));
                l1.setText("calculate me!");

            } else if (flag==2)
            {
                c = a-b;
                t1.setText(String.valueOf(c));
                l1.setText("calculate me!");

            } else if (flag==3)
            {
                c = a*b;
                t1.setText(String.valueOf(c));
                l1.setText("calculate me!");

            } else if (flag==4)
            {
                c = a/b;
                t1.setText(String.valueOf(c));
                l1.setText("calculate me!");

            } else if (flag==5)
            {
                a = b*3.14/180;
                c = Math.sin(a);
                t1.setText(String.valueOf(c));
                l1.setText("calculate me!");

            } else if (flag==6)
            {
                a = b*3.14/180;
                c = Math.cos(a);
                t1.setText(String.valueOf(c));
                l1.setText("calculate me!");

            }
        }
    }

    public static void main(String[] args)
    {
        new calculator();
    }

}