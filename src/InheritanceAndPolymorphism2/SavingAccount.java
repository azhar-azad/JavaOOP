package InheritanceAndPolymorphism2;

public class SavingAccount extends Account {

    public SavingAccount() {
        super();
    }

    @Override
    public String toString() {
        return "SavingAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                '}';
    }
}
