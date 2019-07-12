package MyP.Swing;

import javax.swing.*;
import java.awt.*;

public class Main {
    public static JFrame getFrame(){
        JFrame jFrame = new JFrame(){};
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//get menu close
        Toolkit toolkit = Toolkit.getDefaultToolkit();//get user window size
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250,dimension.height/2 - 150,500,300);
        return jFrame;
    }
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        Font font = new Font("MyProgram",Font.BOLD,20);
    }
}
