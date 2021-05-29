package  CardGame;

import CardGame.exception.InvalidCardValueException;

import java.util.Random;

import static CardGame.Suit.*;

public class Card {
    private final int value;
    private final Suit suit;

    Random secureRandom = new Random();




 Card(Suit suit, int value){
       if(value <1 || value>20) {
           throw new InvalidCardValueException(value + "is not a valid card value");
       }
        this.value = value;
        this.suit=suit;
    }

    public int getValue() {
//        return switch (this.value) {
//            case 4 -> "Circle";
//            case 11 -> "Jack";
//            case 12-> "Queen";
//            case 13-> "King";
//            case 20-> "whot";
//            default -> ""+value;
//        };

return value;
    }

    public Suit getSuit() {
        return suit;
    }
    @Override
    public String toString(){
        return   getValue()+" of "+suit.toString();
    }

    @Override
    public boolean equals(Object obj) {
        if(!this.getClass().equals(obj.getClass())){
            System.out.println("you are not well!, is a dog a woman?");

            return false;
        }
        Card cardToCompare=(Card)obj;
        if (this.value== cardToCompare.value||this.suit==cardToCompare.suit ){
            return true;
        }
        return false;
//     return super.equals(obj);
    }
public static Card creatingATriangle(int value){
        Card triangle=new Card(TRIANGLE,value);
        return triangle;
}
    public static Card creatingACross(int value){
        Card cross=new Card(CROSS,value);
        return cross;
    }
    public static Card creatingACircle(int value){
        Card circle=new Card(CIRCLE,value);
        return circle;
    }
    public static Card creatingASquare(int value){
        Card square=new Card(SQUARE,value);
        return square;
    }
    public static Card creatingAStar(int value){
        Card star=new Card(STAR,value);
        return star;
    }
    public static Card creatingAWhotCard(){
        Card whot=new Card(WHOT,20);
        return whot;
    }
}
