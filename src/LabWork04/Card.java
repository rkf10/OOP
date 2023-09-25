package LabWork04;

public class Card {
    final String rank;
    final String suit;

    public Card(String rank, String suit) {
        this.rank = rank;
        this.suit = suit;
    }

    public String getRank() {
        return rank;
    }

    public String getSuit() {
        return suit;
    }

    public String toString() {
        return String.format("%s of %s", suit, rank);
    }

}
