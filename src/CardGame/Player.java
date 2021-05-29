package CardGame;

import java.util.ArrayList;
import java.util.List;

public class Player {

    private String name;
    private CardDeck playingDeck;
    private CardDeck market;
    private List<Card> cardGames=new ArrayList<>();

    public Player(String player){
        this.name=player;
    }
    public Player(String name,CardDeck playingDeck){
        this.name=name;
        this.playingDeck=playingDeck;
    }

    public CardDeck getMarket() {
        return market;
    }

    public Player(String player, CardDeck playingDeck, CardDeck market){
        this.name=player;
        this.playingDeck=playingDeck;
        this.market=market;
    }

    public String getName(){
        return name;
    }
    public CardDeck getPlayingDeck() {
        return playingDeck;
    }

    public void setPlayingDeck(CardDeck playingDeck) {
        this.playingDeck = playingDeck;
    }
    public void addCards(Card cardGame) {
        cardGames.add(cardGame);
    }
    public int getNumberOfCards(){
        return cardGames.size();
    }
}
