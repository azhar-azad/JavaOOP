package InheritanceAndPolymorphism2;

public class CheckingAccount extends Account {

    private double overdraftLimit;

    public CheckingAccount(double overdraftLimit) {
        super();
        this.overdraftLimit = overdraftLimit;
    }

    @Override
    public String toString() {
        return "CheckingAccount{" +
                "id=" + id +
                ", balance=" + balance +
                ", annualInterestRate=" + annualInterestRate +
                ", dateCreated=" + dateCreated +
                ", overdraftLimit=" + overdraftLimit +
                '}';
    }
}
