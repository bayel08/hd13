import javax.naming.LimitExceededException;

public class BankAccount {
    private double amount;

    public double getAmount() {
        return amount;
    }

    public void deposit(int summa ) {
        amount = getAmount() + summa;
    }

    public void withDraw(int summa) throws LimitException {
        if (amount < summa) {
            throw new LimitException("Сумма " + summa + " которая больше чем на счету " +
                    "\nно вы сняли все что было: ", +getAmount());
        } else if (amount <= 0) {
            amount = 0;
            throw new LimitException("На счете нет денег ", +getAmount());
        } else {
            amount = getAmount() - summa;
        }
    }

}
