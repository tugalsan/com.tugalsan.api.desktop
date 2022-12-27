package com.tugalsan.api.desktop.server;

import java.awt.*;
import javax.swing.*;

public class TS_DesktopWindowUtils {

    public static void decorate(Window dialog) {
        dialog.setAlwaysOnTop(true);
        dialog.pack();
        if (dialog instanceof JDialog dia) {
            dia.setModalityType(Dialog.ModalityType.APPLICATION_MODAL);
        }
        dialog.toFront();
    }

    public static void center(Window window) {
        var locationPoint = GraphicsEnvironment.getLocalGraphicsEnvironment().getCenterPoint();
        var bounds = window.getBounds();
        locationPoint.setLocation(locationPoint.x - bounds.width / 2, locationPoint.y - bounds.height / 2);
        window.setLocation(locationPoint);
    }
}
