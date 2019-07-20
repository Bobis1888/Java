package MyP.Swing;

import javax.swing.*;
import java.awt.event.ActionListener;

import static MyP.Swing.JComponentMy.getFrame;

public class EventHandler123 {

//////main
    public static void main(String[] args) {
        JFrame jFrame = getFrame();
        JPanel jPanel = new JPanel();
        jFrame.add(jPanel);
        JButton jButton = new JButton("Submit");
        jPanel.add(jButton);
     //   jButton.addActionListener(new ActionListener() {
       //     @Override
         //   public void actionPerformed(ActionEvent e) {
           //     jFrame.setTitle(((JButton)e.getSource()).getText());
             //   System.out.println("Fuck you!!!");
                //}
                    //});
        jButton.addActionListener(java.beans.EventHandler.create(ActionListener.class,jFrame,"title","source.text"));
    }
}
