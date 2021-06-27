package ChapterEight;

import chapterEight.SavingsAccount;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class SavingAccountTest {
    SavingsAccount savingsAccount;
    @BeforeEach
    void setUp() {

         savingsAccount=new SavingsAccount(2000.00);
    }

    @AfterEach
    void tearDown() {
        savingsAccount=null;
    }

    @Test
    void testThatTheObjectIsNotNull() {

        assertNotNull(savingsAccount);
    }
    @Test
    void testThatMonthlyInterestCanBeCalculated1(){
        savingsAccount.calculateMonthlyInterestRate();
        assertEquals(8333.333333333334,savingsAccount.getSavingBalance());

    }
@Test
    void testThatStaticVariableCanBeModified(){
        savingsAccount.modifyInterestRate(40);
        savingsAccount.calculateMonthlyInterestRate();
    assertEquals(6666.666666666667,savingsAccount.getSavingBalance());
}
    @Test
    void testThatStaticVariableCanBeModified1(){
        savingsAccount.modifyInterestRate(0.04);
        savingsAccount.calculateMonthlyInterestRate();
        savingsAccount.monthlyInterestForEachTwelveMonth();
        assertEquals(80.0,savingsAccount.getSavingBalance());
    }
}
