package CardGame;



public class CardGame {
    private int numberOfPlayers;
    private int numberOfDeals;

    public CardGame(int numberOfPlayers,int numberOfDeals){
        this.numberOfPlayers=numberOfPlayers;
        this.numberOfDeals=numberOfDeals;

    }

    public int getNumberOfPlayer() {
        return numberOfPlayers;
    }
}
