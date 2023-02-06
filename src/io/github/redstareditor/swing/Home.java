package io.github.redstareditor.swing;

import io.github.redstareditor.RedStar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Home extends JFrame{

    public Home() {
        setTitle("Red Star");
        setContentPane(contentPane);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setMinimumSize(new Dimension(450,400));
        pack();
        setLocationRelativeTo(null);
        setVisible(true);
        initComps();
    }

    public void initComps() {
        //Setting up the logo
        ImageIcon imageIcon = new ImageIcon(RedStar.class.getResource("/res/iconExtended.png")); // load the image to a imageIcon
        Image image = imageIcon.getImage(); // transform it
        Image newimg = image.getScaledInstance((int) 392.842105/8*7, 120/8*7,  java.awt.Image.SCALE_SMOOTH); // scale it the smooth way
        imageIcon = new ImageIcon(newimg);  // transform it back
        title.setIcon(imageIcon);
        title.setText("");

        btnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

    // Swing Declaration - do not touch.
    private JPanel contentPane;
    private JLabel title;
    private JButton btnGalaxyEdit;
    private JButton btnGameFiles;
    private JButton btnBCSVEdit;
    private JButton btnWorldMapEdit;
    private JButton btnSettings;
    private JButton btnExtractArc;
    private JButton btnEditMsbt;
    private JLabel desc;
    private JButton btnClose;
}
