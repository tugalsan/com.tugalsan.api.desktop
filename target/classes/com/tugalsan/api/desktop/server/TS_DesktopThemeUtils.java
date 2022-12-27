package com.tugalsan.api.desktop.server;

import com.tugalsan.api.unsafe.client.*;
import javax.swing.*;

public class TS_DesktopThemeUtils {

    public static void setTheme() {
        TGS_UnSafe.execute(() -> UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName()));
    }
}
