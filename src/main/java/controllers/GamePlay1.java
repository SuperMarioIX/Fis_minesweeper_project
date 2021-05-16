package controllers;

import javax.swing.*;
import java.awt.*;

class GamePlay1 extends JFrame {
    private JLabel statusbar;
    public GamePlay1() {
        initUI();
    }
    private void initUI() {
        statusbar = new JLabel("");
        add(statusbar, BorderLayout.SOUTH);
        add(new Board1(statusbar));
        setResizable(false);
        pack();
        setTitle("Minesweeper");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
        setVisible(true);
    }
}