public class Amount {

    /*

    @brief - This class using for special "Deposit/Withdraw" operation, that keeps amount and its describe.

    @var {int} amount - an amount of money in transaction
    @var {String} transactionType - describe of transaction,
                                          only "Deposit" and "Withdraw" types.

    @constructor {amount, transactionType} - constructor demand amount of user operation,
                                                  name of account holder,
                                                  setting balance amount to 0.

     @method {void} toString - prints amount of money per operation and a transaction type.

     */
    private double amount;
    private String transactionType;

    Amount() {

    }

    Amount(double amount, String type) {
        this.amount = amount;
        transactionType = type;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

    public double getAmount() {
        return amount;
    }

    public String getTransactionType() {
        return transactionType;
    }

    @Override
    public String toString() {
        return transactionType + ": " + amount;
    }
}
