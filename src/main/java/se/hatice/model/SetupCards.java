package se.hatice.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SetupCards {
    private final BaseDeck baseDeck;

    public SetupCards(int numPairs) {
        baseDeck = new BaseDeck();
        generateCardSet(numPairs);
    }

    public List<Card> generateCardSet(int numPairs) {
        if (numPairs > baseDeck.getBaseDeck().size()) {
            throw new IllegalArgumentException("För många par: max är " + baseDeck.getBaseDeck().size());
        }
        List<Card> cardSet = new ArrayList<>();
        List<String> base = baseDeck.getBaseDeck().subList(0, numPairs);
        for (String name : base) {
            cardSet.add(new Card(name));
            cardSet.add(new Card(name));
        }
        Collections.shuffle(cardSet);
        return cardSet;
    }
}
