import javax.swing.*;
import java.awt.*;

public class newtrail extends Canvas {

    public void paint(Graphics g)
    {

        Toolkit t = Toolkit.getDefaultToolkit();
        Image i = t.getImage("E:\\PHOTO.jpg");
        g.drawImage(i,120,100,50,50,this);

    }

    public static void main(String[] args) {
        newtrail m=  new newtrail();
        JFrame f= new JFrame();
        f.add(m);

        f.setSize(400,400);
        f.setVisible(true);
    }
}
