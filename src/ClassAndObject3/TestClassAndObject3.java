package ClassAndObject3;

public class TestClassAndObject3 {

    public static void main(String[] args) {

        // Create an account
        Account account = new Account();
        account.setId(1122);
        account.setBalance(20000);
        account.setAnnualInterestRate(4.5);

        // Withdraw Tk. 2500
        account.withdraw(2500);

        // Deposit Tk. 3000
        account.deposit(3000);

        // Printing account info
        System.out.println(account);
    }
}
