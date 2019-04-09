package Task1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PlayingCard {
    public String cardSuit;
    public String cardRank;

    public PlayingCard(String cardSuit, String cardRank){
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public void getRankAndSuit(){
        System.out.println("Rank "+cardRank+" Suit "+cardSuit);
    }
}
