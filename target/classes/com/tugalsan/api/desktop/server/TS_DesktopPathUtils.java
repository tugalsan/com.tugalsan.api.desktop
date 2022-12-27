package com.tugalsan.api.desktop.server;

import java.nio.file.*;
import javax.swing.*;

public class TS_DesktopPathUtils {

    public static Path currentFolder() {
        return Path.of("").toAbsolutePath().normalize();
    }

    public static Path chooseFolder() {
        return chooseFolder(null);
    }

    public static Path chooseFolder(Path initFolder) {
        var chooser = new JFileChooser();
        chooser.setCurrentDirectory(initFolder == null ? new java.io.File(".") : initFolder.toFile());
        chooser.setDialogTitle("title");
        chooser.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        chooser.setAcceptAllFileFilterUsed(false);
        if (chooser.showOpenDialog(null) == JFileChooser.APPROVE_OPTION) {
//            System.out.println("getCurrentDirectory(): " + chooser.getCurrentDirectory());
//            System.out.println("getSelectedFile() : " + chooser.getSelectedFile());
        } else {
//            System.out.println("No Selection ");
            return null;
        }
        return chooser.getSelectedFile().toPath();
    }
}
