/****************
 @Author Jesse Allen 
 @Created October 11 2013
*****************/


/**
   A Class that holds information on a bank account
*/
public class BankAccount
{
    //Private instance fields
    private double balance;
    private String firstName;
    private String lastName;
    
    /**
       Default constructor
    */
    public BankAccount()
    {
        balance = 0;//sets balance to zero
    }
    /**
       Constructor
       @param balance The starting balance of the account
    */
    public BankAccount(double balance)
    {
        //Used this keyword to avoid shadowing
        this.balance = balance;
    }
        /**
       Copy Constructor
       @param origAccount The account to be copied
    */
    public BankAccount(BankAccount origAccount)
    {
        balance = origAccount.balance;
                      
    }
    /**
       deposits an amount in the account
       @param amount The amount to be deposited
    */
    public void deposit(double amount)
    {
        balance += amount;
    }
    /**
       withdrawls an amount from the account
       @param amount The amount to be withdrawn
    */
    public void withdrawl(double amount)
    {
        balance -= amount;
    }
        /**
       Gets the current balance of the account
       @return Returns the accounts balance
    */
    public double getBalance()
    {
       return balance;
    }
}   
    
    
    
    
    
       