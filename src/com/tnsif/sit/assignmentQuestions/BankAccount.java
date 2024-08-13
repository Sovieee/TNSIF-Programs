package com.tnsif.sit.assignmentQuestions;
import java.util.*;

class InsufficientFundsException extends Exception
{
	 public InsufficientFundsException(String message) {
	        super(message);
	    }
}
	 class InvalidAmountException extends Exception {
		    public InvalidAmountException(String message) {
		        super(message);
		    }
		}
public class BankAccount
{
	int accountNumber;
	double balance;
	double amount = 0;
	double amount1 = 0;
	
	public BankAccount (int accountNumber , double balance)
	{
		this.accountNumber = accountNumber;
		this.balance = balance;
		
	}
	
	  void deposit(double amount) throws InvalidAmountException
	{
		  
		if (amount <= 0)
		{
			throw new InvalidAmountException("Invalid Amount : Deposit amount must be greater than zero." );
			
		}
		balance += amount;
        System.out.println("Succesfully Deposited: " + amount);
	}
	 
	 void withdrawal(double amount1) throws InvalidAmountException , InsufficientFundsException 
	 {
		 if (amount1 <= 0)
		 {
				throw new InvalidAmountException("Invalid Amount : Withdrawal amount must be greater than zero." );
		 }
		 if (amount1 > balance)
		 {
				throw new InsufficientFundsException("Not Enough Credits : Balance amount must be greater than or equal to the withdrawal amount." );
				
		 }
		 balance -= amount1;
		 
		 System.out.println("Succesfully Withdrawn: " + amount1);
	 }
	 
	 void display()
	 {
		 System.out.println("Account Number: " + accountNumber + ", Balance: " + balance);
	 }
	 

			public static void main(String[] args) {
				Scanner sc = new Scanner(System.in);
				try
				{
				 System.out.println("Enter Account Number: ");
				int accountNumber = sc.nextInt();
				 System.out.println("Enter initial Balance: ");
				double balance = sc.nextDouble();
				BankAccount obj = new BankAccount (accountNumber, balance);
				obj.display();
				 System.out.println("Enter amount for deposit : ");
				 double amount = sc.nextDouble();
				obj.deposit(amount);
				obj.display();
				 System.out.println("Enter amount for withdrawal : ");
				 double amount1 = sc.nextDouble();
				obj.withdrawal(amount1);
				obj.display();
				
				}
				catch(InvalidAmountException  |  InsufficientFundsException e)
				{
					System.out.println("Exception: " + e.getMessage());
				}
				finally
				{
					System.out.println("Transaction Complete");
				
				}
				sc.close();
			}

		}
	 

