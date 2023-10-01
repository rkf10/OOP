package LabWork04;

import java.util.Random;

public class Deck {
    String suit [] = {"Diamond", "Spades", "Hearts", "Clubs"};
    String rank [] = {"Ace", "2", "3", "4", "5", "6", "7", "8", "9", "10", "Jack", "Queen", "King"};

    Card cards[] = new Card[52];

    String random[] = new String[52];
    int counter = 0;
    Deck() {
        for (int i = 0; i < 4; i++)
            for (int j = 0; j < 13; j++)
             cards [counter++] = new Card(suit[i], rank[j]);
    }

    public String toString() {
        System.out.println("(Cards before Shuffling)");
        StringBuilder str = new StringBuilder();
        for (int i = 0; i < 52; i++)
            str.append(cards[i]+"\n");
        return str.toString() ;

    }

    public void random() {
        System.out.println("(Cards after Shuffling)");
        for (int i = 0; i < 52; i++) {
            Random random1 = new Random();
            int rand = random1.nextInt(52);
            random[i] = String.valueOf(cards[rand]);
            System.out.println(random[i]);

        }

    }
    public String[] getRandom() {
        return random;
    }

//    public void shuffle() {
//        Random random = new Random();
//        for (int i=0; i<1000; i++){
//            int randomIndex = random.nextInt(52);
//            Card temp = cards[randomIndex];
//            cards[randomIndex] = cards[0];
//            cards[0] = temp;
//        }


}