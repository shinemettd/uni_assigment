public class Main {
    public static void main(String[] args) {

        //some testcases

        PersonalAccount first = new PersonalAccount(1, "anyname");

        System.out.println(first);
        //simple operations
        first.deposit(50);
        first.deposit(25);
        first.deposit(666);
        first.withdraw(10);

        first.printTransactionHistory();
        System.out.println(first);

        PersonalAccount second = new PersonalAccount(2, "azamat");

        //try to withdraw money from empty account
        second.withdraw(100);
        //try to withdraw with not enough money
        second.deposit(5);
        second.withdraw(500);

        second.printTransactionHistory();

        PersonalAccount third = new PersonalAccount(3, "homer");
        //try to print a transaction history without any transactions made
        third.printTransactionHistory();

        third.deposit(100);
        third.printTransactionHistory();

    }
}