package Project.Terminal;

import javax.swing.*;
import java.awt.*;

class GetTerminal{
    static JFrame getJFrame(){

        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2-350,dimension.height/2-150,800,300);
        return jFrame;
    }

    static class TerminalComponent extends JComponent{

        protected void paintComponent(Graphics g) {

            Font font = new Font("Ubuntu", Font.BOLD, 20);
            Graphics2D g2 = (Graphics2D)g;
            g2.setFont(font);
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            g2.drawString("TERMINAL",dimension.width/2,40);

        }
    }
}
public class Terminal{
    public static void main(String[] args) {
        JFrame jFrame = GetTerminal.getJFrame();
        jFrame.add(new GetTerminal.TerminalComponent());
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton  = new JButton("First Button");
        JButton jButton2 = new JButton("Second Button");
        jPanel.add(jButton);jPanel.add(jButton2);
    }
}