package Challenge.Bank;

public class BankAccount {
    private int accountNumber;
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, int accountNumber) {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
    }
    public void deposit(double deposit){
        if(deposit<=0){
            System.out.println("Invalid deposit");
        }
       else   this.balance+=deposit;
    }
    public double withdrawal(double withdrawal ){
        if(withdrawal>=this.balance){
            System.out.print("Account has less amount than withdrawal ,");
            return 0;
        }
        else {
            this.balance-=withdrawal;
            return withdrawal;
        }
    }
}
