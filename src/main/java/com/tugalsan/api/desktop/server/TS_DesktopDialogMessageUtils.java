package com.tugalsan.api.desktop.server;

import module java.desktop;

public class TS_DesktopDialogMessageUtils {

    private TS_DesktopDialogMessageUtils() {

    }

    public static void show(String text) {
        JOptionPane.showMessageDialog(null, text);
    }
}
