package controllers;

import javax.swing.*;
import java.awt.*;

class GamePlay2 extends JFrame {
    private JLabel statusbar;
    public GamePlay2() {
        initUI();
    }
    private void initUI() {
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);
        add(new Board2(statusbar));
        setResizable(false);
        pack();
        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }
}