
public class SavingsAccount extends BankAccount {
	private double rate = 0.025;
	private int savingsNumber = 0;
	private String accountNumber, temp = getAccountNumber();
	
	public SavingsAccount(String name, double amount)
	{
		super(name, amount);
		
		accountNumber = getAccountNumber();
		setAccountNumber(accountNumber.concat("-") + savingsNumber);
	} 
	
	public SavingsAccount(SavingsAccount oldAccount, double amount)
	{
		super(oldAccount, amount);
		
		accountNumber = getAccountNumber().substring(0, 6);
		setAccountNumber(accountNumber.concat("-") + ++savingsNumber);
	}
	
	public void postInterest()
	{
		setBalance(getBalance() + getBalance() * rate / 12);
	}
	
}
