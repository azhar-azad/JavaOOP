package InheritanceAndPolymorphism2;

public class TestInheritanceAndPolymorphism2 {

    public static void main(String[] args) {

        Account account = new Account();
        CheckingAccount checkingAccount = new CheckingAccount(0);
        SavingAccount savingAccount = new SavingAccount();

        System.out.println(account);
        System.out.println(checkingAccount);
        System.out.println(savingAccount);
    }
}
