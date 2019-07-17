package MyP.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.geom.*;
import java.net.MalformedURLException;
import java.net.URL;

public class JComponentMy {
    public static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//get menu close
        Toolkit toolkit = Toolkit.getDefaultToolkit();//get user window size
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250,dimension.height/2 - 150,500,300);
        return jFrame;
    }



    static class MyComponent extends JComponent{
        protected void paintComponent(Graphics g){
            Font font = new Font("Ubuntu",Font.BOLD,20);
            Graphics2D g2 = (Graphics2D) g;
            g2.setFont(font);
            g2.drawString("My first desktop program!",40,20);
            Point2D p1 = new Point2D.Float(40,30);
            Point2D p2 = new Point2D.Float(200,30);
            Line2D l2 = new Line2D.Float(40,30,300,30);
            g2.draw(l2);
            Ellipse2D e1 = new Ellipse2D.Float(70,70,170,170);
            g2.setPaint(Color.GREEN);
            g2.fill(e1);
            g2.draw(e1);
            Rectangle2D r2 = new Rectangle2D.Float(270,170,70,70);
            g2.draw(r2);
            g2.setPaint(Color.CYAN);
            g2.fill(r2);
            try {
                URL url = new URL("https://upload.wikimedia.org/wikipedia/ru/b/b1/Java_Runtime_Environment.png");
                Image image= new ImageIcon(url).getImage();
                g2.drawImage(image,220,50,null);

            } catch (MalformedURLException e) {
                e.printStackTrace();
            }


            //String[]fonts=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
            //for (String s:fonts){
            //  System.out.println(s);
            //}
        }
    }


    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.add(new MyComponent());

    }
}
