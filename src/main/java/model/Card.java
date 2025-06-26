package model;

public class Card {
    private final String cardName;

    public Card(String cardName) {
        this.cardName = cardName;
    }

    @Override
    public String toString() {
        return "Card{" +
                "cardName='" + cardName + '\'' +
                '}';
    }
}
