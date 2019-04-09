package Task1;


public class PlayingCard {
    private String cardSuit;
    private String cardRank;

    public PlayingCard(String cardSuit, String cardRank){
        this.cardSuit = cardSuit;
        this.cardRank = cardRank;
    }

    public void getRankAndSuit(){
        System.out.println("Rank "+cardRank+" Suit "+cardSuit);
    }
}
