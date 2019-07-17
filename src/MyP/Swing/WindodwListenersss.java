package MyP.Swing;

import javax.swing.*;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import static MyP.Swing.GetFrame.getFrame;

public class WindodwListenersss {
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        jFrame.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                int i = 0;
            }
        });
    }
}
