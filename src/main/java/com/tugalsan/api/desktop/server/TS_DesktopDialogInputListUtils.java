package com.tugalsan.api.desktop.server;

import com.tugalsan.api.union.client.TGS_UnionExcuse;
import java.awt.Component;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.IntStream;
import javax.swing.JOptionPane;

public class TS_DesktopDialogInputListUtils {

    public static TGS_UnionExcuse<Integer> show(Component parent, String title, String message, int defaultIdx, String... options) {
        return show(parent, title, message, defaultIdx, List.of(options));
    }

    public static TGS_UnionExcuse<Integer> show(Component parent, String title, String message, int defaultIdx, List<String> options) {
        if (options.isEmpty()) {
            return TGS_UnionExcuse.ofExcuse(TS_DesktopDialogInputListUtils.class.getSimpleName(), "show", "options.isEmpty()");
        }
        if (defaultIdx < 0) {
            defaultIdx = 0;
        }
        if (defaultIdx > options.size()) {
            return TGS_UnionExcuse.ofExcuse(TS_DesktopDialogInputListUtils.class.getSimpleName(), "show", "defaultIdx > options.size()");
        }
        var selected = JOptionPane.showInputDialog(
                parent,
                message,
                title,   
                JOptionPane.PLAIN_MESSAGE,
                null,
                options.toArray(String[]::new),
                options.get(defaultIdx)
        );
        var selectedChoice = IntStream.range(0, options.size())
                .filter(i -> Objects.equals(options.get(i), selected))
                .findAny();
        if (selectedChoice.isPresent()) {
            return TGS_UnionExcuse.ofExcuse(TS_DesktopDialogInputListUtils.class.getSimpleName(), "show", "selectedChoice == null for selected:" + selected);
        }
        return TGS_UnionExcuse.of(selectedChoice.getAsInt());
    }
}
