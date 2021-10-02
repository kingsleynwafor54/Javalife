package Lambda_Collection;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Collection_Wallet {
    public static void main(String[] args) {
        Wallet[] walletsGroups={
                new Wallet(4000,Card.Blue),
                new Wallet(14000,Card.Black),
                new Wallet(34000,Card.Red),
                new Wallet(24000,Card.Red),
                new Wallet(44000,Card.Green),
                new Wallet(44000,Card.Black),
                new Wallet(44000,Card.Green),
                new Wallet(54000,Card.Black),
                new Wallet(34000,Card.Blue),
                new Wallet(74000,Card.Black),
                new Wallet(64000,Card.Black),
        };


      // The above is a collection of wallet object,after this we then save it as list
        List<Wallet> list = Arrays.asList(walletsGroups);



//        Predicate<Wallet> takeMoneyAndBlackCard=
//                e -> (e.takeMoney() >= 30000 && e.getCards().equals(Card.Black));
//        System.out.printf("%n Display of your sorted list: %n");
//        list.stream()
//                .filter(takeMoneyAndBlackCard)
//                .sorted(Comparator.comparing(Wallet::getCards))
//                .forEach(System.out::println);

//        Predicate<Wallet> takeMoneyAndBlackCard=
//                e -> (e.takeMoney() >= 30000 && e.getCards().equals(Card.Black));
//        System.out.printf("%n Display of your sorted list: %n");
//        list.stream()
//                .filter(takeMoneyAndBlackCard)
//                .sorted(Comparator.comparing(Wallet::getCards))
//                .forEach(System.out::println);

        Predicate<Wallet> takeMoneyAndBlackCard=
                e -> (e.takeMoney() >= 30000 );
        System.out.printf("%n Display of your sorted list: %n");
        System.out.println( list.stream()
                .filter(takeMoneyAndBlackCard)
                .findFirst()
                .get());

        Function<Wallet, Double> byTakeMoney = Wallet::takeMoney;
        Function<Wallet, Card> byGetCard = Wallet::getCards;


        Comparator<Wallet> byMoneyThenByCard=Comparator.comparing(byTakeMoney).thenComparing(byGetCard);

//        System.out.println("Display by money then by card");
//        list.stream()
//                .sorted(byMoneyThenByCard)
//                .forEach(System.out::println);
//  System.out.println("Display by money then by card");
//        list.stream()
//                .sorted(byMoneyThenByCard.reversed())
//                .forEach(System.out::println);

        System.out.println("Printing out distinctive amount in the wallet");
list.stream()
        .map(Wallet::takeMoney)
        .distinct()
        .sorted()
        .forEach(System.out::println);

        System.out.println("Printing out distinctive card in the wallet");
        list.stream()
                .map(Wallet::getCards)
                .distinct()
                .sorted()
                .forEach(System.out::println);

        Map<Card, Long> walletCountByCard =
                list.stream()
                        .collect(Collectors.groupingBy(Wallet::getCards,Collectors.counting()));
                        walletCountByCard.forEach(
                 (getCards, count) -> System.out.printf(
                "%s has %d wallet(s)%n", getCards, count));

//  -------------------------------------------------------------------------------------------
//        summing and averaging sums

        System.out.printf(
                 "%nSum of Wallet money (via sum method): %.2f%n",
                 list.stream()
                .mapToDouble(Wallet::takeMoney)
                .sum());

        System.out.printf(
                "%nSum of Wallet money(via average method): %.2f%n",
                list.stream()
                        .mapToDouble(Wallet::takeMoney)
                        .average()
                        .getAsDouble());
        Predicate<Wallet> takeMoneyAndBlackCard1=
                e -> (e.getCards().equals(Card.Black) );
        System.out.printf(
                "%nSum of Black Card wallet(via average method): %.2f%n",
                list.stream()
                        .filter(takeMoneyAndBlackCard1)
                        .mapToDouble(Wallet::takeMoney)
                        .sum());



    }
}
