package com.example.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BaseDeck {
    private ArrayList<String> deck;

    public BaseDeck() {
        createDeck();
    }

    private void createDeck() {
        deck = new ArrayList<>();
        String[] suits = {"H", "D", "C", "S"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};

        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + suit);
            }
        }
        Collections.shuffle(deck);
    }

    public List<String> getBaseDeck() {
        return deck;
    }
}
