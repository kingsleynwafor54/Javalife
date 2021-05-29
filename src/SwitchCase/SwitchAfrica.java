package SwitchCase;

import java.util.Scanner;

public class SwitchAfrica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter you userInput");
        int  userInput=sc.nextInt();
        while (userInput !=9);{
            System.out.println("enter your preferred option");
            int user = sc.nextInt();
            switch (user) {
                case 1 -> System.out.println(2 + 2);
                case 2 -> System.out.println(2 - 3);
                case 3 -> System.out.println(7 / 3);
                default -> {
                    System.out.println("invalid key ");
                    System.out.println("enter you userInput");
                    userInput=sc.nextInt();
                }
            }
      }
    }
}