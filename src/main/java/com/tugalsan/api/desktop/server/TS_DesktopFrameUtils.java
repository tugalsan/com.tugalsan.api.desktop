package com.tugalsan.api.desktop.server;

import com.tugalsan.api.runnable.client.TGS_Runnable;
import com.tugalsan.api.shape.client.*;
import java.awt.*;
import javax.swing.*;
import javax.swing.plaf.nimbus.NimbusLookAndFeel;

public class TS_DesktopFrameUtils {

    public static void show(JFrame frame) {
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void setTitle(JFrame frame, String title) {
        frame.setTitle(title);
    }

    public static void exitOnClose(JFrame frame) {
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.addWindowListener(new WindowAdapter() {
//            @Override
//            public void windowClosing(WindowEvent we) {
//                frame.dispose();
//                System.exit(0);
//            }
//        });
    }

    public static void setLoc(JFrame frame, TGS_ShapeRectangle<Integer> rect) {
        frame.setBounds(rect.x, rect.y, rect.width, rect.height);
    }

    public static void setBorder(JFrame frame) {
        frame.getRootPane().setBorder(BorderFactory.createMatteBorder(4, 4, 4, 4, Color.LIGHT_GRAY));
    }

    public static void setfavIcon(JFrame frame, Image image) {
        frame.setIconImage(image);
    }

    public static void setContent(JFrame frame, Container content) {
        frame.setContentPane(content);
    }

    public static void create(TGS_Runnable run) {
        SwingUtilities.invokeLater(() -> run.run());
    }

    public static void setThemeDarkLAF(Component comp) {
        try {
            UIManager.setLookAndFeel(new NimbusLookAndFeel());
            UIManager.put("control", new Color(128, 128, 128));
            UIManager.put("info", new Color(128, 128, 128));
            UIManager.put("nimbusBase", new Color(18, 30, 49));
            UIManager.put("nimbusAlertYellow", new Color(248, 187, 0));
            UIManager.put("nimbusDisabledText", new Color(128, 128, 128));
            UIManager.put("nimbusFocus", new Color(115, 164, 209));
            UIManager.put("nimbusGreen", new Color(176, 179, 50));
            UIManager.put("nimbusInfoBlue", new Color(66, 139, 221));
            UIManager.put("nimbusLightBackground", new Color(18, 30, 49));
            UIManager.put("nimbusOrange", new Color(191, 98, 4));
            UIManager.put("nimbusRed", new Color(169, 46, 34));
            UIManager.put("nimbusSelectedText", new Color(255, 255, 255));
            UIManager.put("nimbusSelectionBackground", new Color(104, 93, 156));
            UIManager.put("text", new Color(230, 230, 230));
            SwingUtilities.updateComponentTreeUI(comp);
        } catch (UnsupportedLookAndFeelException exc) {
            System.err.println("Nimbus: Unsupported Look and feel!");
        }
    }
}
