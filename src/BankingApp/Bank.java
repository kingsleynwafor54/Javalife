package BankingApp;

public class Bank {
    private String firstName;
    private String LastName;
    private int accountNumber;
    private int dayOfBirth;
    private int monthOfBirth;
    private int yearOfBirth;
    private double balance;
    private static int autoNumbering;
    private static int totalNumberOfCustomers;
    private String pin;
    private final double bankCharges= 50.00;
    private String emailAddress;
    private int staffPin;
public Bank(){
}
    public Bank(String firstName, String lastName,  double balance) {
        this.firstName = firstName;
        LastName = lastName;
        this.accountNumber = ++autoNumbering;
        this.balance = balance;
        ++totalNumberOfCustomers;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return LastName;
    }

    public void setLastName(String lastName) {
        LastName = lastName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }



    public int getDayOfBirth() {
        return dayOfBirth;
    }

    public void setDayOfBirth(int dayOfBirth) {
        this.dayOfBirth = dayOfBirth;
    }

    public int getMonthOfBirth() {
        return monthOfBirth;
    }

    public void setMonthOfBirth(int monthOfBirth) {
        this.monthOfBirth = monthOfBirth;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public double getBalance() {
        return balance;
    }




    public static int getTotalNumberOfCustomers() {
        return totalNumberOfCustomers;
    }
    public String getDateOfBirth(){
       return getDateOfBirth()+"/"+getDateOfBirth()+"/"+getYearOfBirth();
    }

public void setPin(String pin){
        this.pin=pin;
}
    public String getPin(){
        return this.pin;
    }

    public String displayCustomerDetails() {
        return String.format("First Name: %-8s Last Name: %-8s Account Number : %-4d Account Balance :%-8.2f" +
                        " Date of birth  pinNumber: %8s,Day Of Birth: %2d Month Of Birth  %2d Year of birth  %2d%n   ",
                getFirstName(),getLastName(),getAccountNumber(),getBalance(),getPin(),getDayOfBirth(),getMonthOfBirth(),getYearOfBirth());
    }



    public void withdrawal(double withdrawal) {
        this.balance-= withdrawal;
    }



    public void deposit(double deposit) {
        if (deposit < 1) {

            System.out.println("you can't be a wintch and still poor");
        }
        this.balance+= deposit;
    }

    public int getStaffPin() {
        return staffPin;
    }

    public void setStaffPin(int staffPin) {
        this.staffPin = staffPin;
    }

    public void buyAirtime(int buyAirtime) {
        this.balance-= buyAirtime;
    }

    public double getBankCharges() {
        return bankCharges;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    @Override
    public String toString() {
        return String.format("First Name: %-8s Last Name: %-8s Account Number : %-8d Account Balance :%-8.2f%n",getFirstName(),getLastName(),getAccountNumber(),getBalance());
    }
}
