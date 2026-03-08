package lab3_2;

import lab3_1.BankAccount;

public class Customer {
    private String firstName;
    private String lastName;
    private BankAccount account;

    public static final int MAX_ACCOUNTS = 10;
    private int numAccounts;

    private BankAccount accounts[] = new BankAccount[ MAX_ACCOUNTS ];



    public Customer(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }




    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;

    }

    public void addAccount(BankAccount account) {
        if (numAccounts < MAX_ACCOUNTS) {
            accounts[numAccounts] = account;
            numAccounts++;
        } else {
            System.out.println("Maximum number of accounts reached.");
        }
    }

    public String getLastName() {
        return lastName;
    }

    public BankAccount getAccount(String accountNumber) {
        for(int i=0; i<numAccounts; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)) {
                return accounts[i];

            }
        }
        return null;
    }


    public void closeAccount(String accountNumber) {
        for(int i=0; i<numAccounts; i++) {
            if(accounts[i].getAccountNumber().equals(accountNumber)) {
                accounts[i] = accounts[numAccounts-1];
                numAccounts--;
                return;
            }
        }

    }






    @Override
    public String toString() {
       String result = this.firstName + " " + this.lastName+ " accounts:\n";
       for(int i=0; i<numAccounts; i++) {
           result += "\t"+ accounts[i].toString() +"\n";
       }
       return result;
    }

}
