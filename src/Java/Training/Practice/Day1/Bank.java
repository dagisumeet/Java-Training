package Java.Training.Practice.Day1;

public class Bank {
    public static void main(String[] args) {

        Account account = new Account();

        //account.accountName = "Sumit";
        //account.accountType = "Saving";
        // account.accountNumber = "13246578";
        //account.address = "test address";
        // account.socialSecurityNumber = "1324875";
        //account.phoneNumber = "9842166814";

        account.setAccountName("Sumit");
        account.setAccountType("Saving");
        account.setAccountNumber("1324678");
        account.setAddress("test address");
        account.setSocialSecurityNumber("132487");
        account.setPhoneNumber("9842166814");

        System.out.println(account.getAccountName());
        System.out.println(account.getAccountType());
        System.out.println(account.getAccountNumber());
        System.out.println(account.getAddress());
        System.out.println(account.getSocialSecurityNumber());
        System.out.println(account.getPhoneNumber());

    }
}


