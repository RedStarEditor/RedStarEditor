package io.github.redstareditor;

import com.formdev.flatlaf.FlatDarkLaf;
import com.formdev.flatlaf.FlatLightLaf;
import io.github.redstareditor.swing.Home;
import io.github.redstareditor.util.Settings;

import javax.swing.*;
import java.awt.*;
import java.io.File;

public class RedStar {

    //Variables for use in other classes
    public static final String fileLocation = System.getenv("APPDATA") + File.separator + "RedStar" + File.separator;
    public static final Image icon = Toolkit.getDefaultToolkit().createImage(RedStar.class.getResource("/res/icon.png"));
    public static RedStar instance;
    public static Home homeFrame;

    //Theme
    FlatDarkLaf darkLaf;
    FlatLightLaf lightLaf;

    public void updateTheme() {
        try {
            if (Settings.getTheme() == 0) {
                UIManager.setLookAndFeel(darkLaf);
            } else if (Settings.getTheme() == 1) {
                UIManager.setLookAndFeel(lightLaf);
            }
            //SwingUtilities.updateComponentTreeUI(); All Swing Classes
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //Init

    public RedStar() {
        Settings.init();
        darkLaf = new FlatDarkLaf();
        lightLaf = new FlatLightLaf();
        updateTheme();
        homeFrame = new Home();
    }

    public static void main(String[] args) {
        instance = new RedStar();
    }

}
