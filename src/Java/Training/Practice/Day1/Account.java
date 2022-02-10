package Java.Training.Practice.Day1;

public class Account {
    //states

    //account number
    String accounNumber;
    //account name
    String accountName;
    //account type
    String accountType;
    //amount
    double amount;
    //interest rate
    float INTEREST_RATE;
    //KYC data
    String address;
    String socialSecurityNumber;
    String phoneNumber;

    //behaviour

    //open account
    void openAccount (String accountName, String accountType, double amount, String address, String socialSecurityNumber, String phoneNumber) {}
    //transfer balance
    boolean transferBalance (String accountFrom, String accountTo, double amoutToTransfer) {
        return true;
    }
    //add interest
    void addIntest(String accounNumber){}
    //deposit amount
    void depositAmount(String accounNumber, String depositToBeDeposited) {}
    //close account
    boolean closeAccount(String accounNumber) {
    return true;
    }
}
