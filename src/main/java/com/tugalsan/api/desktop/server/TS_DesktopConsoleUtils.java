package com.tugalsan.api.desktop.server;

import com.tugalsan.api.union.client.TGS_UnionExcuse;
import com.tugalsan.api.function.client.maythrow.checkedexceptions.TGS_FuncMTCEUtils;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class TS_DesktopConsoleUtils {

    private TS_DesktopConsoleUtils() {

    }

//    public static Console create() {//GRRALVM DOES NOT LIKE U
//        return System.console();
//    }
    public static TGS_UnionExcuse<String> readLine() {
        return TGS_FuncMTCEUtils.call(() -> {
//            if (System.console() != null) {//GRRALVM DOES NOT LIKE U
//                return Optional.of(System.console().readLine());
//            }
            var reader = new BufferedReader(new InputStreamReader(System.in));
            return TGS_UnionExcuse.of(reader.readLine());
        }, e -> TGS_UnionExcuse.ofExcuse(e));
    }

    public static TGS_UnionExcuse<String> readPassword() {
        return TGS_FuncMTCEUtils.call(() -> {
//            if (System.console() != null) {//GRRALVM DOES NOT LIKE U
//                return Optional.of(new String(System.console().readPassword()));
//            }
            return readLine();
        }, e -> TGS_UnionExcuse.ofExcuse(e));
    }
}
