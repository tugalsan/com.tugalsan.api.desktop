package com.tugalsan.api.desktop.server;

import com.tugalsan.api.runnable.client.TGS_Runnable;
import javax.swing.SwingUtilities;

public class TS_DesktopMainUtils {

    public static void invokeLater(TGS_Runnable run) {
        SwingUtilities.invokeLater(() -> run.run());
    }
}
