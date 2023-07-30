package com.tugalsan.api.desktop.server;

import com.tugalsan.api.runnable.client.TGS_Runnable;
import javax.swing.JMenu;
import javax.swing.event.MenuEvent;
import javax.swing.event.MenuListener;

public class TS_DesktopJMenuButton extends JMenu {

    public TS_DesktopJMenuButton(String title, TGS_Runnable onSelected) {
        super(title);
        addMenuListener(new MenuListener() {
            @Override
            public void menuSelected(MenuEvent e) {
                onSelected.run();
            }

            @Override
            public void menuDeselected(MenuEvent e) {
            }

            @Override
            public void menuCanceled(MenuEvent e) {
            }
        });
    }
}
