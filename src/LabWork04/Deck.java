package LabWork04;

public class Deck {
    String suit [] = {"Diamond", "Spades", "Hearts", "Clubs"};
    String rank [] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    Card cards[] = new Card[52];
    int counter = 0;
    Deck() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 13; j++)
             cards [counter++] = new Card(suit[i], rank[j]);
    }

    public String toString() {
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 52; i++)
            str.append(cards[i]+"\n");
        return str.toString() ;

    }

}
