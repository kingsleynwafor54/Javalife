package CardGame;

import CardGame.exception.InvalidCardValueException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static CardGame.Suit.*;
import static org.junit.jupiter.api.Assertions.*;


public class CardTest {



    @BeforeEach
    void beforeEach(){

}
@AfterEach
    void afterEach(){

}
@Test
    void diamondCardGameTest(){
    Card cardGame=new Card(TRIANGLE,2);
    assertSame(TRIANGLE,cardGame.getSuit());
}
    @Test
    void  spaceCardGameTest(){
        Card cardGame=new Card(SQUARE,2);
        assertSame(SQUARE,cardGame.getSuit());
    }
    @Test
    void heartCardGameTest(){
        Card cardGame=new Card(CIRCLE,2);
        assertSame(CIRCLE,cardGame.getSuit());
    }
    @Test
    void clubCardGameTestOne(){
        Card cardGame=new Card(CROSS,2);
        assertSame(CROSS,cardGame.getSuit());
    }
    @Test
    void aceCardGameTestTwo(){
        Card cardGame=new Card(CROSS,1);
        assertEquals("1",cardGame.getValue());
    }
    @Test
    void CardGameTestTwo(){
        Card cardGame=new Card(STAR,2);
        assertSame("Jack",cardGame.getValue());
    }

    @Test
    void CardGameTestThree(){
        Card cardGame=new Card(STAR,11);
        assertSame("STAR",cardGame.getValue());
    }
    @Test
    void CardGameTestFour(){
        Card cardGame=new Card(SQUARE,2);
        assertEquals("2",cardGame.getValue());
    }
    @Test
    void CardGameTestFiv4(){
        Card cardGame=new Card(CROSS,12);
        assertSame("Queen",cardGame.getValue());
    }
    @Test
    void CardGameTestSix(){
        Card cardGame=new Card(CIRCLE,9);
        assertEquals("9",cardGame.getValue());
    }
@Test
    void invalidCardExceptionIsThrownWhenValueIsInvalid(){
  assertThrows(InvalidCardValueException.class,()->new Card(TRIANGLE,17));
}
//@Test
//    void methodDisplayTest(){
//        Card card= new Card(CIRCLE,13);
//        String  expectedToString="Queen of Diamond";
//        assertEquals(expectedToString,card.toString());
////        card=new Card(CROSS,13);
////        String expectedToString2="King of  circle";
////        assertEquals(expectedToString2,card.toString());
//         System.out.println(card);
//}
@Test
    void methodCompareCards(){
        Card card=new Card(TRIANGLE,12);
        Card card1=new Card(TRIANGLE,13);
            assertEquals(card,card1);
//            CardDeck cardDeck=new CardDeck(2);
//            assertEquals(card,cardDeck);
}
@Test
    void methodCompareCardsTest(){
     Card card=new Card(TRIANGLE,4);
     assertEquals(TRIANGLE,card.getSuit());
}
    @Test
    void methodCompareCardsTest1(){
        Card card=new Card(TRIANGLE,4);
        assertEquals(TRIANGLE,card.getSuit());
    }
    @Test
    void methodCompareCardsTest2(){
        Card card=new Card(SQUARE,4);
        assertEquals(SQUARE,card.getSuit());
    }
    @Test
    void methodCompareCardsTest3(){
        Card card=new Card(CIRCLE,4);
        assertEquals("Circle",card.getValue());
    }
    @Test
    void methodCompareCardsTest4(){
        Card card=new Card(WHOT,20);
        assertEquals(WHOT,card.getSuit());
    }
@Test
    void methodCreatingATriangle(){
assertTrue(CardDeck.myCardDeck().isFull());
}
@Test
    void methodShufflingCard(){
    System.out.println(CardDeck.myCardDeck().shuffle());
}
    }

