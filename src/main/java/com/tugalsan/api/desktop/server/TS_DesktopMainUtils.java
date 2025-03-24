package com.tugalsan.api.desktop.server;

import java.awt.Component;
import javax.swing.SwingUtilities;
import com.tugalsan.api.function.client.maythrowexceptions.unchecked.TGS_FuncMTU;
import com.tugalsan.api.function.client.maythrowexceptions.unchecked.TGS_FuncMTU_OutTyped;

public class TS_DesktopMainUtils {

    private TS_DesktopMainUtils() {

    }

    public static void setThemeAndinvokeLaterAndFixTheme(TGS_FuncMTU_OutTyped<Component> component) {
        TS_DesktopThemeUtils.setThemeDefault();
        TS_DesktopMainUtils.invokeLater(() -> {
            var comp = component.call();
            TS_DesktopThemeUtils.setThemeDarkLAF(comp);
        });
    }

    public static void invokeLater(TGS_FuncMTU run) {
        SwingUtilities.invokeLater(() -> run.run());
    }
}
