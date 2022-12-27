package com.tugalsan.api.desktop.server;

import java.awt.*;
import javax.swing.*;

public class TS_DesktopPane extends JDesktopPane {

    public TS_DesktopPane(boolean keepInternalFramesInsideThePane, Image imgBack) {
        super();
        this.imgBack = imgBack;
        if (keepInternalFramesInsideThePane) {
            TS_DesktopPaneUtils.keepInternalFramesInsideThePane(this);
        }
    }
    public Image imgBack;

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        TS_DesktopPaneUtils.paintComponent(this, g, imgBack);
    }
}
