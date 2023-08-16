package com.tugalsan.api.desktop.server;

import java.awt.Component;
import java.util.Optional;
import javax.swing.JOptionPane;

public class TS_DesktopDialogInputListUtils {

    public static Optional<String> show(Component parent, String title, String message, int defaultIdx, String... options) {
        var result = JOptionPane.showInputDialog(
                parent,
                message,
                title,
                JOptionPane.PLAIN_MESSAGE,
                null,
                options,
                options[defaultIdx]
        );
        return result == null ? Optional.empty() : Optional.of((String) result);
    }
}
