package com.tugalsan.api.desktop.server;

import java.awt.Component;
import java.util.List;
import java.util.Optional;
import javax.swing.JOptionPane;

public class TS_DesktopDialogInputListUtils {

    public static Optional<String> show(Component parent, String title, String message, int defaultIdx, List<String> options) {
        return show(parent, title, message, defaultIdx,
                options.stream().toArray(String[]::new)
        );
    }

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
