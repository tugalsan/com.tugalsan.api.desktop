package com.tugalsan.api.desktop.server;

import com.tugalsan.api.shape.client.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TS_DesktopFrameUtils {

    public static void show(JFrame frame) {
        frame.setVisible(true);
        frame.setExtendedState(JFrame.MAXIMIZED_BOTH);
    }

    public static void setTitle(JFrame frame, String title) {
        frame.setTitle(title);
    }

    public static void exitOnClose(JFrame frame) {
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent we) {
                frame.dispose();
                System.exit(0);
            }
        });
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
}
