package com.tugalsan.api.desktop.server;

import java.io.Console;

public class TS_DesktopConsoleUtils {

    public static Console create() {
        return System.console();
    }

    public static String readPassword(Console console, String msg) {
        char[] passwordArray = console.readPassword(msg);
        return new String(passwordArray);
    }
}
