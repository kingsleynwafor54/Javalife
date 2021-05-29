package CardGame;

import CardGame.exception.StackOverFlowException;
import CardGame.exception.StackUnderFlowException;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static CardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;

public class CardDeckTest {
    CardDeck cardDeck;
    @BeforeEach
    void beforeEach() {
        cardDeck=new CardDeck(4);
    }

    @Test
    void cardDeckHasFixedSize() {
        assertEquals(4, cardDeck.getSize());
    }

    @Test
    void pushOnce_elementPushedShouldBeLast() {
        Card cardGame = new Card(TRIANGLE, 4);
        cardDeck.push(cardGame);
        assertEquals(cardGame, cardDeck.peek());
    }

    @Test
    void pushTwicePopOneAndThenPeekShouldReturnTheFirstElement() {
        Card firstCard = new Card(CIRCLE, 4);
        Card secondCard = new Card(CROSS, 7);
        Card thirdCard = new Card(SQUARE, 8);
        cardDeck.push(secondCard);
        cardDeck.push(thirdCard);
        cardDeck.push(firstCard);
        //cardDeck.pop();
        Card poppedCard=cardDeck.pop();

       assertSame(firstCard,poppedCard);
        assertEquals(thirdCard, cardDeck.peek());

    }
@Test
    void popEmptyCardDeck_throwsStackUnderflowException(){
      assertTrue(cardDeck.isEmpty())  ;
      assertThrows(StackUnderFlowException.class,()->cardDeck.pop());

    }
@Test
    void pushIntoFullDeckThrowsStackOverFlowException(){
        Card cardGame=new Card(STAR,4);
        for(int counter=0;counter<4;counter++){
            cardDeck.push(cardGame);
        }
        assertTrue(cardDeck.isFull());
        assertThrows(StackOverFlowException.class,()->cardDeck.push(cardGame));
}
@Test
void methodCanDisplayShuffledCard(){
    Card firstCard=new Card(SQUARE,2);
    Card secondCard=new Card(STAR,3);
    Card thirdCard=new Card(CROSS,7);
    Card fourthCard=new Card(CIRCLE,6);
    cardDeck.push(firstCard);
    cardDeck.push(secondCard);
    cardDeck.push(thirdCard);
    cardDeck.push(fourthCard);
    cardDeck.shuffle();
   System.out.println(cardDeck.shuffle());
    assertNotSame(fourthCard,cardDeck.peek());

}
@Test
    void compareCardsTest(){
        Card firstCard=new Card(STAR,2);
        Card secondCard=new Card(CROSS,2);
        Card thirdCard=new Card(SQUARE,2);
        Card[]number={firstCard,secondCard,thirdCard};



//    assertNotEquals(number,cardDeck.shuffle(number));
}

    }
