package rocks.zipcode.quiz4.objectorientation.account;

/**
 * @author leon on 30/12/2018.
 */
public class Employee implements  Transactable, Worker   {

    private BankAccount bankAccount;
    private Double hoursWorked;
    private double hourlyWage; //primitives default to zero




    public Employee() {
        hourlyWage = 35.0;
        hoursWorked = 0.0;
        bankAccount = new BankAccount();
    }


    public Employee(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
        this.hourlyWage = 35.0;
        this.hoursWorked = 0.0;
    }

    public BankAccount getBankAccount() {
        return this.bankAccount;
    }

    public void setBankAccount(BankAccount bankAccount) {
        this.bankAccount = bankAccount;
    }

    @Override
    public void deposit(Double amountToIncreaseBy) {
        getBankAccount().deposit(amountToIncreaseBy);
    }

    @Override
    public void withdrawal(Double amountToDecreaseBy) {
        getBankAccount().withdrawal(amountToDecreaseBy);
    }

    @Override
    public Double getBalance() {
        return bankAccount.getBalance();
    }

    @Override
    public void increaseHoursWorked(Double numberOfHours) {
            this.hoursWorked += numberOfHours;
    }

    @Override
    public Double getHoursWorked() {
        return this.hoursWorked;
    }

    @Override
    public Double getHourlyWage() {
        return this.hourlyWage;
    }

    @Override
    public Double getMoneyEarned() {
        return this.hourlyWage * this.hourlyWage;
    }


}
