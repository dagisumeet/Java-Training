package Java.Training.Practice.Day1;

public class Account {

    //states

    //account number
    private String accountNumber;
    //account name
   private String accountName;
    //account type
    private String accountType;
    //amount
    private double amount;
    //interest rate
    private float INTEREST_RATE = 7.05f;
    //KYC data
    private String address;
    private String  socialSecurityNumber;
    private String  phoneNumber;

    //Getter and Setter

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getSocialSecurityNumber() {
        return socialSecurityNumber;
    }

    public void setSocialSecurityNumber(String socialSecurityNumber) {
        this.socialSecurityNumber = socialSecurityNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }




    //Behaviors

    //open account
    public void openAccount (String  accountNumber, String accountType,String socialSecurityNumber, String phoneNumber) {}
    //transfer balance
    public boolean transferBalance(String accountFrom,double amountTo, String accountTo) {return true;}
    //add interest
    public void addInterest (String accountNumber) {}
    //deposit amount
    public void depositAmont (String accountNumber, double amountToBeDeposited) {}
    //close account
    public boolean closeAccount (String accountNumber) {return true;}

    //jjklsjfjas;df

}

