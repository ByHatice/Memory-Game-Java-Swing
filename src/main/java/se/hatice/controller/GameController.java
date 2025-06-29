package se.hatice.controller;

import se.hatice.view.GameWindow;
import se.hatice.view.MainWindow;

import javax.swing.*;

public class GameController {

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            MainWindow main = new MainWindow();
            GameWindow game = new GameWindow();
            main.addGameView(game.getPanel());
            main.show();
        });
    }
}





