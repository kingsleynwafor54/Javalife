package BankingApp;

import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Bank user=new Bank();
 Bank[] user1={      new Bank("Kingsley","Nwafor",10.00)
      ,new Bank("Kingsley","Nwafor",10.00)};
        user1[1].setPin("2343");

        Scanner scanner=new Scanner(System.in);
        System.out.println("""
                1 for staff
                2 for customer""");
        int number=scanner.nextInt();
        switch (number){
            case 1:

                System.out.println("Input your password");
                int pin=scanner.nextInt();
                if (pin==23456){
                    for(int counter=0;counter<user1.length;counter++) {
                        System.out.println((user1[counter].displayCustomerDetails()));
                    }
                }else System.out.println("you are not a staff");
            case 2:
                System.out.println("enter you account number");
                int n=scanner.nextInt();

                System.out.println("Input your password");
                String s=scanner.nextLine();

                if(s=="2343"){
                    System.out.println(user1[0].toString());
                }

        }
    }


}
