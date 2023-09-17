package com.tugalsan.api.desktop.server;

import com.tugalsan.api.unsafe.client.TGS_UnSafe;
import java.io.BufferedReader;
import java.io.Console;
import java.io.InputStreamReader;
import java.util.Optional;

public class TS_DesktopConsoleUtils {

    public static Console create() {
        return System.console();
    }

    public static Optional<String> readLine() {
        return TGS_UnSafe.call(() -> {
            if (System.console() != null) {
                return Optional.of(System.console().readLine());
            }
            var reader = new BufferedReader(new InputStreamReader(System.in));
            return Optional.of(reader.readLine());
        }, e -> Optional.empty());
    }

    public static Optional<String> readPassword() {
        return TGS_UnSafe.call(() -> {
            if (System.console() != null) {
                return Optional.of(new String(System.console().readPassword()));
            }
            return readLine();
        }, e -> Optional.empty());
    }
}
