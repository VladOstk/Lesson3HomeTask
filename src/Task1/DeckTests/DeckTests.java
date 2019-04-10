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

    }

    @Test
    public void getFullDeck_deckHas52Cards(){
        Assert.assertTrue(deck.getFullDeck().size()==52);
    }
    @Test
    public void getFullDeck_containsAllCards() {
        List<Boolean> cardIsFound = new ArrayList<>();
        testDeck = deck.getFullDeck();
        int testDeckIterator = 0;

        for (int i = 0; i < testDeck.size(); i++) {
            cardIsFound.add(i, false);
        }
        for (int i = 0; i < suit.length; i++) {
            for (int j = 0; j < rank.size(); j++) {
                for (int k = 0; k < testDeck.size(); k++) {
                    if (testDeck.get(k).getCardRank() == rank.get(j)
                            && testDeck.get(k).getCardSuit() == suit[i]) {
                        cardIsFound.set(testDeckIterator, true);
                        testDeckIterator++;
                        break;
                    }
                }
            }
        }

        Assert.assertTrue(!cardIsFound.contains(false));



    }

}
