package Challenge.Bank;

public class Cashier {
    public static void main(String[] args) {
        BankAccount Mohit=new BankAccount("Mohit",7865);
        Mohit.deposit(100);
        Mohit.deposit(10);
        System.out.println( "Your Withdrawal:"+ Mohit.withdrawal(103));
        System.out.println( "Your Withdrawal:"+ Mohit.withdrawal(5));

    }
}
