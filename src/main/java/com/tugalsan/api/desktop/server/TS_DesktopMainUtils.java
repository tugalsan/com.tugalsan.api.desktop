package com.tugalsan.api.desktop.server;

import java.awt.Component;
import javax.swing.SwingUtilities;
import com.tugalsan.api.callable.client.TGS_CallableType0;
import com.tugalsan.api.callable.client.TGS_CallableType0Void;

public class TS_DesktopMainUtils {

    public static void setThemeAndinvokeLaterAndFixTheme(TGS_CallableType0<Component> component) {
        TS_DesktopThemeUtils.setTheme();
        TS_DesktopMainUtils.invokeLater(() -> {
            TS_DesktopThemeUtils.setThemeDarkLAF(component.call());
        });
    }

    public static void invokeLater(TGS_CallableType0Void run) {
        SwingUtilities.invokeLater(() -> run.run());
    }
}
