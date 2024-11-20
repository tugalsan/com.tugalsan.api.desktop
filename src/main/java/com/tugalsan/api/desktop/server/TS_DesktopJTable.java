package com.tugalsan.api.desktop.server;

import java.awt.BorderLayout;
import java.util.ArrayList;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingUtilities;

public class TS_DesktopJTable {

    private final JTable table;

    public TS_DesktopJTable() {
        var rows = 3;
        var columns = 4;
        ArrayList<ArrayList<Integer>> tableList = new ArrayList<>();
        var i = 0;
        while (i < rows) {
            ArrayList<Integer> row = new ArrayList<>();
            int j = 0;
            while (j < columns) {
                row.add(i * columns + j + 1);
                j++;
            }
            tableList.add(row);
            i++;
        }
        var dataArray = new Object[rows][columns];
        var k = 0;
        while (k < rows) {
            int l = 0;
            while (l < columns) {
                dataArray[k][l] = tableList.get(k).get(l);
                l++;
            }
            k++;
        }
        table = new JTable(dataArray, new Object[]{"Column 1", "Column 2", "Column 3", "Column 4"});
        var frame = new JFrame("Table Creation GUI");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());
        frame.add(new JScrollPane(table), BorderLayout.CENTER);
        frame.setSize(400, 300);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new TS_DesktopJTable());
    }
}
