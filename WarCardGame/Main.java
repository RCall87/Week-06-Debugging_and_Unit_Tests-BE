public class Main {
    public static void main(String[] args) {
        Deck deck = new Deck();
        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        deck.shuffle();

        for (int i = 0; i < 52; i++) {
            player1.draw(deck);
            player2.draw(deck);
        }

        for (int i = 0; i < 26; i++) {
            Card card1 = player1.flip();
            Card card2 = player2.flip();

            card1.describe();
            card2.describe();

            if (card1.getValue() > card2.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins this round!");
            } else if (card2.getValue() > card1.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins this round!");
            } else {
                System.out.println("It's a draw!");
            }
        }

        int player1Score = player1.getScore();
        int player2Score = player2.getScore();

        System.out.println("\nFinal Score:");
        System.out.println("Player 1: " + player1Score);
        System.out.println("Player 2: " + player2Score);

        if (player1Score > player2Score) {
            System.out.println("Player 1 wins!");
        } else if (player2Score > player1Score) {
            System.out.println("Player 2 wins!");
        } else {
            System.out.println("It's a draw!");
        }
    }
}