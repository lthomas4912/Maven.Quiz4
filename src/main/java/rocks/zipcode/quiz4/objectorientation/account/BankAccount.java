package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 27/12/2018.
 */
public class BankAccount extends Account implements Transactable {
    private double balance;

    public void setBalance(Double val){
        this.balance = val;
    }

    @Override //IllegalArgumentException
    public void deposit(Double amountToIncreaseBy) {
        if(amountToIncreaseBy < 0){
            throw new IllegalArgumentException();
        } balance += amountToIncreaseBy;

    }

    @Override //IllegalArgumentException
    public void withdrawal(Double amountToDecreaseBy) {
        boolean isInvalidAmount = amountToDecreaseBy < 0;
        boolean isGreaterThanFunds = amountToDecreaseBy > balance;
        if(isInvalidAmount || isGreaterThanFunds){
            throw new IllegalArgumentException();
        } balance -= amountToDecreaseBy;

    }

    @Override
    public Double getBalance() {
        return balance;
    }
}
