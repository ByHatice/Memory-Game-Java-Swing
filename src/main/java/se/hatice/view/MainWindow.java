package se.hatice.view;

import javax.swing.*;
import java.awt.*;

public class MainWindow {

    private JFrame window;

    public MainWindow() {
        window = new JFrame();
        window.setTitle("Memory Game");
        window.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        window.setSize(800, 700);
        window.setLocationRelativeTo(null);
        window.setLayout(new BorderLayout());
    }

    public void show() {
        window.setVisible(true);
    }

    public void addGameView(JPanel panel) {
        window.add(panel, BorderLayout.CENTER);
    }
}
