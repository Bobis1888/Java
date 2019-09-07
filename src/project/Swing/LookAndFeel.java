package project.Swing;

import javax.swing.*;

public class LookAndFeel {
    public static void main(String[] args) {
        UIManager.LookAndFeelInfo[] lookAndFeelInfos = UIManager.getInstalledLookAndFeels();
        for (UIManager.LookAndFeelInfo e: lookAndFeelInfos){
            System.out.println(e.getName());
            System.out.println(e.getClassName());
        }
    }
}
