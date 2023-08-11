import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        hand = new ArrayList<>();
        score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        if (hand.isEmpty()) {
            return null;
        }
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        Card drawnCard = deck.draw();
        if (drawnCard != null) {
            hand.add(drawnCard);
        }
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}

