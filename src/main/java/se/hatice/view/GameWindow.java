package se.hatice.view;

import javax.swing.*;
import java.awt.*;

public class GameWindow {

    private JPanel game;

    public GameWindow() {
        game = new JPanel();
        game.setLayout(new GridLayout(4, 8));

        for (int i = 0; i < 32; i++) {
            JButton cardButton = new JButton();
            cardButton.setPreferredSize(new Dimension(80, 80));
            cardButton.setActionCommand(String.valueOf(i));
            game.add(cardButton);
        }
    }

    public JPanel getPanel() {
        return game;
    }
}
