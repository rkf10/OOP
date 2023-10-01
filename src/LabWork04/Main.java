package LabWork04;

public class Main {
        public static void main(String[] args) {
            Deck deck = new Deck();
            System.out.println(deck);

            deck.random();

            Player player = new Player();
            player.distribution(deck.getRandom());
        }

}
