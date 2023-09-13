import java.util.ArrayList;

    /*

    @brief - It's a class of personal account that realises basic operations with user balance

    @var {int} accountNumber - number of user account
    @var {String} accountHolder - the name of account holder
    @var {double} balance - account balance, equal to 0 at the beginning
    @var {Amount} transactions - arraylist that keeps data of all account transactions
                                   as an amount of money and describe of operation as "Deposit"/"Withdraw"

    @constructor (accountNumber, accountHolder) - constructor demand number of user account,
                                                  name of account holder,
                                                  setting balance amount to 0.

    @method {void} deposit ({double} amount) - method that adds amount to the balance
    @method {void} withdraw ({double} amount) - method that subtracts amount from the balance,
                                                also not allowing to withdraw more than available.
    @method {void} printTransactionHistory - shows whole transaction history in format [amount, "transactionType"].
    @method {void} toString - prints number of user account, name of user, balance, and all its transactions;

     */

public class PersonalAccount {
    private int accountNumber;
    private String accountHolder;
    private double balance;
    ArrayList<Amount> transactions = new ArrayList<>();

    public PersonalAccount(int accountNumber, String accountHolder) {
        this.accountNumber = accountNumber;
        this.accountHolder = accountHolder;
        balance = 0;
    }

    public void deposit(double amount) {
        balance += amount;
        transactions.add(new Amount(amount, "Deposit"));
    }

    public void withdraw(double amount) {
        if (balance - amount > 0) {
            balance -= amount;
            transactions.add(new Amount(amount, "Withdraw"));
        }
        else {
            System.out.println("Not enough money!");
        }
    }

    void printTransactionHistory() {
        if (!transactions.isEmpty()) {
            for (Amount transaction : transactions) {
                System.out.println(transaction);
            }
        }
        else {
            System.out.println("You have not had a single transaction");
        }
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public ArrayList<Amount> getTransactions() {
        return transactions;
    }

    public void setTransactions(ArrayList<Amount> transactions) {
        this.transactions = transactions;
    }

    @Override
    public String toString() {
        return  "Account number: " + accountNumber +
                "\nAccount holder: " + accountHolder +
                "\nBalance: " + balance +
                "\nTransactions: " + transactions;
    }
}
