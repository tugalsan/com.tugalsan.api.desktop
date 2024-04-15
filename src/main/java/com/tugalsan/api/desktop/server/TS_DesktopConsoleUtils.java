package com.tugalsan.api.desktop.server;

import com.tugalsan.api.union.client.TGS_UnionExcuse;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Optional;

public class TS_DesktopConsoleUtils {

//    public static Console create() {//GRRALVM DOES NOT LIKE U
//        return System.console();
//    }
    public static TGS_UnionExcuse<String> readLine() {
        try {
            //            if (System.console() != null) {//GRRALVM DOES NOT LIKE U
//                return Optional.of(System.console().readLine());
//            }
            var reader = new BufferedReader(new InputStreamReader(System.in));
            return TGS_UnionExcuse.of(reader.readLine());
        } catch (IOException ex) {
            return TGS_UnionExcuse.ofExcuse(ex);
        }
    }

    public static TGS_UnionExcuse<String> readPassword() {
//            if (System.console() != null) {//GRRALVM DOES NOT LIKE U
//                return Optional.of(new String(System.console().readPassword()));
//            }
        return readLine();
    }
}
