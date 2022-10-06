package OOPS;

class Account

{

	String customerName;
	int accountNo;

	Account(String a, int b)

	{
		this.customerName = a;
		this.accountNo = b;
	}

	void display()

	{
		System.out.println(customerName + "\n" + accountNo);
	}

}

class CurrentAccount extends Account

{

	int currentBalance;

	CurrentAccount(String a, int b, int c)

	{

		super(a, b);

		currentBalance = c;

	}

	void display()

	{

		super.display();

		System.out.println("Current Balance: " + currentBalance);

	}

}

class AccountDetails extends CurrentAccount

{
	int depositAmount, withdrawalAmount;

	AccountDetails(String a, int b, int c, int d, int e)

	{
		super(a, b, c);
		this.depositAmount = d;
		this.withdrawalAmount = e;

	}

	void display()

	{
		super.display();
		System.out.println(depositAmount + "\n" + withdrawalAmount);
	}

}

class Solution

{

	public static void main(String args[])

	{

		AccountDetails A = new AccountDetails("Harshit", 11111, 10000, 5000, 500);

		A.display();

	}

}
