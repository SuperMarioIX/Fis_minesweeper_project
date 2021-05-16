package controllers;

import javax.swing.*;
import java.awt.*;

class GamePlay extends JFrame {
    private JLabel statusbar;
    public GamePlay () {
        initUI();
    }
    private void initUI() {
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);
        add(new Board(statusbar));
        setResizable(false);
        pack();
        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }
}