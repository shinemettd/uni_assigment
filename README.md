This program counts withdrawals and deposits of money, and also allows you to create new accounts and maintain their report (balance history).

More detailed information about whole code and its operation is at the beginning in the comments in the code of each Class.

-------------------------------------------------------------------------------

Here is a brief desciption of code structure:

"PesonalAccount" Class:

     - "accountNumber" (int): A unique identifier for the account.

     - "accountHolder" (String): The name of the account holder.

     - "balance" (double): The current balance in the account.

     - "transactions" (an array of "Amount" objects): An array to store deposit and withdrawal transactions.

"Amount" Class:

     - This class include:

     - "amount" (double): The transaction amount.

     - "transactionType" (String): A string indicating the type of transaction ("Deposit" or "Withdrawal").

Methods of "PersonalAccount" Class:

     - "PersonalAccount(int accountNumber, String accountHolder)": A constructor initializes the "accountNumber", "accountHolder", and sets the initial "balance" to 0.0.

     - "void deposit(double amount)": A method that deposit money into the account. This method adds the deposit transaction to the "transactions" array and updates the "balance".

     - "void withdraw(double amount)": A method that withdraw money from the account. This method adds the withdrawal transaction to the "transactions" array and updates the "balance". 

     - "void printTransactionHistory()": A method that print the transaction history (all transactions) of the account. 
    
     - others getter and setter methods and toString.

Methods of "Amount" Class:

      - others getter and setter methods and toString.
      
-------------------------------------------------------------------------------
