package BankingAppTest;

import BankingApp.Bank;
import org.junit.jupiter.api.Test;

public class BakingAppTest {
    @Test
    void bankCanCreateAccount(){
        Bank michael=new Bank("Kingsley","Nwafor",0.00);

        michael.setDayOfBirth(9);
        michael.setMonthOfBirth(4);
        michael.setYearOfBirth(1998);
        michael.setPin("Kingsley");
        michael.deposit(0);
        System.out.println(michael);
    //    System.out.println( michael.displayCustomerDetails());
    }
}
