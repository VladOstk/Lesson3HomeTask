package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Deck {
    private static final String[] suit = {"Hearts", "Spades", "Clubs", "Diamonds"};
    private static final List<String> rank = new ArrayList<>(
            Arrays.asList("A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"));

    private List<PlayingCard> fullDeck = new ArrayList();

    public void getFullDeck() {
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.size(); j++) {
                fullDeck.add(new PlayingCard(suit[i], rank.get(j)));
            }
        }

        for(PlayingCard i:fullDeck){
            i.getRankAndSuit();
        }
    }


}
