package chapterEight;

public class SavingsAccount {
    private double savingBalance;
    static double annualInterestRate=50;
public SavingsAccount(double savingBalance){
    this.savingBalance=savingBalance;
}

//    public static double modifyInterestRate(){
//
//    }
public void calculateMonthlyInterestRate(){
     savingBalance*=annualInterestRate/(12*1.0);
}
public double getSavingBalance(){
    return savingBalance;
}
public static void modifyInterestRate(double rate){
    annualInterestRate=rate;
}
public  void monthlyInterestForEachTwelveMonth(){
    savingBalance*=12.0;
}
}
