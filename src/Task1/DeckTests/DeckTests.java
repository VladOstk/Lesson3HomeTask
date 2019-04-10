package Task1.DeckTests;

import Task1.Deck;
import Task1.PlayingCard;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class DeckTests {
    String[] suit;
    List<String> rank;
    Deck deck;
    List<PlayingCard> testDeck;

    @Before
    public void setUp() {
        suit = new String[]{"Hearts", "Spades", "Clubs", "Diamonds"};
        rank = new ArrayList<>(
                Arrays.asList("A", "K", "Q", "J", "10", "9", "8", "7", "6", "5", "4", "3", "2"));
        deck = new Deck();
        testDeck = deck.getFullDeck();
    }

    @Test
    public void getFullDeck_containsAllCards() {
        boolean cardIsFound = false;

        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.size(); j++) {
                for (int k = 0; k < rank.size(); k++) {
                    if (testDeck.get(j).getCardRank().contains(rank.get(k)) && testDeck.get(j).getCardSuit().contains(suit[i])) {
                        cardIsFound = true;

                        break;

                    } else if (k == rank.size() - 1 && cardIsFound == false) {
                        Assert.assertTrue(cardIsFound);
                    }
                    if (k == rank.size() - 1) {
                    }


                }
            }

        }

    }

}
