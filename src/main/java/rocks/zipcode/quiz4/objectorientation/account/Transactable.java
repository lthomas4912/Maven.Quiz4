package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public interface Transactable {

    Double getBalance();

    void deposit(Double amountToIncreaseBy);
    void withdrawal(Double amountToDecreaseBy);
}
