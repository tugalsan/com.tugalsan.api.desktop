package com.tugalsan.api.desktop.server;

import com.tugalsan.api.callable.client.TGS_CallableType1Void;
import javax.swing.JMenu;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class TS_DesktopJMenuButton extends JMenu {

    private TS_DesktopJMenuButton(String title, TGS_CallableType1Void<TS_DesktopJMenuButton> onSelected) {
        super(title);
        addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                onSelected.run(TS_DesktopJMenuButton.this);
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });
    }

    public static TS_DesktopJMenuButton of(String title, TGS_CallableType1Void<TS_DesktopJMenuButton> onSelected) {
        return new TS_DesktopJMenuButton(title, onSelected);
    }
}
