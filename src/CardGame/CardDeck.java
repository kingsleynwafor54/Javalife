package CardGame;



import CardGame.exception.StackOverFlowException;
import CardGame.exception.StackUnderFlowException;

import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

public class CardDeck {
    private static int lastPushLocation = -1;
    private static Card[] cardGame;
    Random secureRandom = new Random();


    public CardDeck(int numberOfCards) {
        cardGame = new Card[numberOfCards];
    }
//    public static CardDeck createFullCardDeck(int numberOfCards) {
//        CardDeck deck=new CardDeck(54);
//        return deck;
//    }

    public static int getSize() {
        return cardGame.length;
    }

    public static void push(Card card) {
      if (isFull()) throw new StackOverFlowException("Card deck is Full");

        lastPushLocation++;
        cardGame[lastPushLocation] = card;
    }

    public Card peek() {
        if (isEmpty()) {
            throw new StackUnderFlowException("Card deck is empty");
        }
        return cardGame[lastPushLocation];
    }

    public Card pop() {
//        CardGame poppedCard=cardGame[lastPushLocation];
//         cardGame[lastPushLocation--]=null;
//       return poppedCard;
        if (isEmpty()) {
            throw new StackUnderFlowException("Card deck is empty");
        }
        return cardGame[lastPushLocation--];
    }

    public static boolean isEmpty() {
        return lastPushLocation == -1;
    }

    public static boolean isFull() {
        return lastPushLocation == getSize() - 1;
    }

    public String shuffle() {
//        Card store = ;
        int counter = 0;
        //  = new int[number.length];
        for (counter = 0; counter < cardGame.length; counter++) {
            int random = secureRandom.nextInt(cardGame.length);


           Card store = cardGame[counter];
            cardGame[counter] = cardGame[random];
            cardGame[random] = store;
        }
        for (counter = 0; counter < cardGame.length; counter++) {
            System.out.println(cardGame[counter]);
        }
        System.out.println();
        return Arrays.toString(cardGame);

 // Collections.shuffle(Arrays.asList(cardGame));


    }

    public static CardDeck myCardDeck() {
        CardDeck cardDeck=new CardDeck(54);
        int counter;
        for (Suit suit : Suit.values()) {
            switch (suit) {
                case TRIANGLE -> {
                    for (counter = 1; counter <= 14; counter++) {
                        if (counter == 6 || counter == 9) {
                            continue;
                        }
                        CardDeck.push(Card.creatingATriangle(counter));
//                        System.out.println((Card.creatingATriangle(counter)));
                    }
                }
                case SQUARE -> {
                    for (counter = 1; counter <= 14; counter++) {
                        if (counter == 4 || counter == 6 || counter == 8 ||counter==9|| counter == 12) {
                            continue;
                        }
                        CardDeck.push(Card.creatingASquare(counter));
//                        System.out.println(Card.creatingASquare(counter));
                    }
                }
                case CROSS -> {
                    for (counter = 1; counter <=14; counter++) {
                        if (counter == 4 || counter == 6 || counter == 8 ||counter==9|| counter == 12) {
                            continue;
                        }
                        CardDeck.push(Card.creatingACross(counter));
//                        System.out.println(Card.creatingACross(counter));
                    }
                }
                case STAR -> {
                    for (counter = 1; counter <= 14; counter++) {
                        if (counter == 6 || counter == 9 || counter >= 10) {
                            continue;
                        }
                        CardDeck.push(Card.creatingAStar(counter));
//                        System.out.println(Card.creatingAStar(counter));
                    }
                }
                case CIRCLE -> {
                    for (counter = 1; counter <= 14; counter++) {
                        if (counter == 6 || counter == 9) {
                            continue;
                        }
                        CardDeck.push(Card.creatingACircle(counter));
//                        System.out.println(Card.creatingACircle(counter));
                    }
                }
                case WHOT -> {
                    for (counter = 1; counter <=5; counter++) {
                        CardDeck.push(Card.creatingAWhotCard());
//                        System.out.println(Card.creatingAWhotCard());

                    }
                }
            }
        }
        return cardDeck;
    }
}


