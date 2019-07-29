package Project.Swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class KeyStrokerrrrrr {
    static JFrame jFrame = GetFrame.getFrame();
    static JPanel jPanel = new JPanel();

    public static void main(String[] args) {
        jFrame.add(jPanel);
        AbstractAction myAction = new MyActionsss();
        JButton jButton = new JButton(myAction);
        jButton.setText("Button");
        jPanel.add(jButton);

        KeyStroke keyStroke = KeyStroke.getKeyStroke("ctrl B");
        InputMap inputMap = jPanel.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW);
        inputMap.put(keyStroke,"changeColor");
        ActionMap actionMap = jPanel.getActionMap();
        actionMap.put("changeColor",myAction);

    }
    static class MyActionsss extends AbstractAction{
        @Override
        public void actionPerformed(ActionEvent e) {
            jPanel.setBackground(Color.blue);
        }
    }
}
