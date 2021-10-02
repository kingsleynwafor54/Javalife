package Lambda_Collection;

import java.util.LinkedList;
import java.util.List;

public class Wallet {

        private double money;
      //  private List<Card> card =new LinkedList<>(); //card is a variable of Card object and this phenomenon is called Composition.
    private Card card;
        int counter=0;
    public Wallet(double money,  Card card ) {
        this.money = money;
        addCards(card);

    }
//creating methods that stores money and idCard

        public void storeMoney(double money){
            this.money+=money;
        }
        public double takeMoney(){
            return money;
        }

        public void addCards(Card card){
            this.card=card;



        }
        public Card getCards(){
            return card;
        }

    @Override
    public String toString() {
        return  String.format("%s%.2f %s ",
                 "#",takeMoney(), getCards());
         }


    public static void main(String[] args) {
        Wallet wallet=new Wallet(4000,Card.Blue);
        wallet.addCards(Card.Black);
        System.out.println(wallet);
    }


}
