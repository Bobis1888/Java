package MyP.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionSsss {
    static JFrame jFrame = GetFrame.getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);

        JButton jButton = new JButton("Button");
        JButton jButton1 = new JButton("Button1");
        jPanel.add(jButton);
        jPanel.add(jButton1);
        jButton.addActionListener(new MyActionBlue());
        jButton1.addActionListener(new MyActionRed());
    }
        static class MyActionBlue extends AbstractAction{
        MyActionBlue(){
            putValue(AbstractAction.SHORT_DESCRIPTION,"My small actions");
        }

            @Override
            public void actionPerformed(ActionEvent e) {
                jPanel.setBackground(Color.blue);
            }
        }
        static class MyActionRed extends AbstractAction{
        public void actionPerformed(ActionEvent e){
            jPanel.setBackground(Color.red);
        }
        }
    }

