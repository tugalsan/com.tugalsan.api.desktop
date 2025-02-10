package com.tugalsan.api.desktop.server;

import java.awt.Component;
import javax.swing.SwingUtilities;
import com.tugalsan.api.function.client.maythrow.uncheckedexceptions.TGS_FuncMTUCE;
import com.tugalsan.api.function.client.maythrow.uncheckedexceptions.TGS_FuncMTUCE_OutTyped;

public class TS_DesktopMainUtils {

    public static void setThemeAndinvokeLaterAndFixTheme(TGS_FuncMTUCE_OutTyped<Component> component) {
        TS_DesktopThemeUtils.setThemeDefault();
        TS_DesktopMainUtils.invokeLater(() -> {
            var comp = component.call();
            TS_DesktopThemeUtils.setThemeDarkLAF(comp);
        });
    }

    public static void invokeLater(TGS_FuncMTUCE run) {
        SwingUtilities.invokeLater(() -> run.run());
    }
}
