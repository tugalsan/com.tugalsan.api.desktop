package com.tugalsan.api.desktop.server;

import java.awt.Component;
import javax.swing.SwingUtilities;
import com.tugalsan.api.function.client.TGS_Func_OutTyped;
import com.tugalsan.api.function.client.TGS_Func;

public class TS_DesktopMainUtils {

    public static void setThemeAndinvokeLaterAndFixTheme(TGS_Func_OutTyped<Component> component) {
        TS_DesktopThemeUtils.setTheme();
        TS_DesktopMainUtils.invokeLater(() -> {
            TS_DesktopThemeUtils.setThemeDarkLAF(component.call());
        });
    }

    public static void invokeLater(TGS_Func run) {
        SwingUtilities.invokeLater(() -> run.run());
    }
}
