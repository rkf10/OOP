package LabWork04;

public class Player {
      String player1[] = new String[13];
      String player2[] = new String[13];
      String player3[] = new String[13];
      String player4[] = new String[13];

      public void distribution(String[] cards) {
         for (int i = 0; i < 13; i++) {
            player1[i] = cards[i];
            player2[i] = cards[i + 13];
            player3[i] = cards[i + 26];
            player4[i] = cards[i + 39];
         }

         System.out.println("\nPlayer 1 Cards:");
         for (int i = 0; i < 13; i++) {
             System.out.println(player1[i]);
         }
//         for (String card : player1) {
//            System.out.println(card);
//         }

         System.out.println("\nPlayer 2 Cards:");
          for (int i = 0; i < 13; i++) {
              System.out.println(player2[i]);
          }
//         for (String card : player2) {
//            System.out.println(card);
//         }

         System.out.println("\nPlayer 3 Cards:");
          for (int i = 0; i < 13; i++) {
              System.out.println(player3[i]);
          }
//         for (String card : player3) {
//            System.out.println(card);
//         }

         System.out.println("\nPlayer 4 Cards:");
          for (int i = 0; i < 13; i++) {
              System.out.println(player4[i]);
          }
//         for (String card : player4) {
//            System.out.println(card);
//         }
      }

}
