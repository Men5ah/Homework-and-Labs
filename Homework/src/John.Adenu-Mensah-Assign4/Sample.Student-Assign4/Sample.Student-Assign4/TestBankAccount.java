
/**
 * This class tests the BankAccount class.
 * You will need to add to it incrementally as you implement
 * the methods of the BankAccount class.
 */
public class TestBankAccount {
  public static void main(String[] args) {
    /*BankAccount myCurrentAccount, mySavingsAccount, yourCurrentAccount;
    
    myCurrentAccount = new BankAccount(BankAccount.AccountType.CURRENT,
                                       "003456CURRENT");
    mySavingsAccount = new BankAccount(BankAccount.AccountType.SAVINGS,
                                       "003456SAVINGS");
    yourCurrentAccount = new BankAccount(BankAccount.AccountType.CURRENT,
                                         "003457CURRENT");*/
    
     //Second Constructor Test
     BankAccount currentAccount1, savingsAccount1, savingsAccount2, otherCurrentAccount, otherCurrentAccount2;
  
     currentAccount1 = new BankAccount(BankAccount.AccountType.CURRENT, "123456CURRENT", 5000.00);
     savingsAccount1 = new BankAccount(BankAccount.AccountType.SAVINGS, "654321SAVINGS", 20.00);
     savingsAccount2 = new BankAccount(BankAccount.AccountType.SAVINGS, "615243SAVINGS", 2000.00);
     otherCurrentAccount = new BankAccount(BankAccount.AccountType.CURRENT, "162534CURRENT", 5000.00);
     otherCurrentAccount2 = new BankAccount(BankAccount.AccountType.CURRENT, "748596CURRENT", 5000.00);

 
     //Get Balance test
     System.out.println("\nBalance Test");
     System.out.println(currentAccount1.getBalance());
     System.out.println(savingsAccount1.getBalance());
 
     //Get Account Type test
     System.out.println("\nAccount Type Test");
     System.out.println(currentAccount1.getAccountType());
     System.out.println(savingsAccount1.getAccountType());
 
     //Get AccountID test
     System.out.println("\nGet ID Test");
     System.out.println(currentAccount1.getAccountID());
     System.out.println(savingsAccount1.getAccountID());
     System.out.println(otherCurrentAccount.getAccountID());
 
     //Get Minimum Balance Test
     System.out.println("\nGet Minimum Balance Test");
     System.out.println(currentAccount1.getMinBalance());
     System.out.println(savingsAccount1.getMinBalance());
 
     //Withdraw Test
     System.out.println("\nWithdraw Test");
     System.out.println(savingsAccount1.withdraw(5000.00));
     System.out.println(savingsAccount2.withdraw(100));
     System.out.println(currentAccount1.withdraw(2000.00));
 
     //Deposit Test
     System.out.println("\nDeposit Test");
     savingsAccount1.deposit(2.00);
     System.out.println(savingsAccount1.getBalance());
     savingsAccount2.deposit(100.00);
     System.out.println(savingsAccount2.getBalance());
     currentAccount1.deposit(5000.00);
     System.out.println(currentAccount1.getBalance());
 
     //Monthly Maintenance Test
     System.out.println("\nMonthly Maintenance Test");
     savingsAccount1.performMonthlyMaintenance();
     System.out.println(" ");
     savingsAccount2.performMonthlyMaintenance();
     System.out.println(" ");
     currentAccount1.performMonthlyMaintenance();
     
     //Transfer Test
     System.out.println("\nTransfer Test");
     System.out.println(savingsAccount1.transfer(true, otherCurrentAccount, 5000.00));
     System.out.println(otherCurrentAccount.getBalance());
     System.out.println(" ");

     System.out.println(savingsAccount2.transfer(false, otherCurrentAccount2, 5000.00));
     System.out.println(savingsAccount2.getBalance());
     System.out.println(" ");

     System.out.println(currentAccount1.transfer(true, savingsAccount1, 5000.00));
     System.out.println(savingsAccount1.getBalance());
  }
}