package °úÁ¦;

interface Account {
	String getName();
	long getBalance();
	void deposit(long money);
	void withdraw(long money);
	int installmentSavingPredict(int month, int money);
	int fixedDepositPredict(int month, int money);
}

public class BankAccount implements Account {
	public String name;
	public long balance;
	public double interest;
	
	public BankAccount(String name, long balance, double interest) {
		this.name = name;
		this.balance = balance;
		this.interest = interest;
	}
	
	public String getName() {
		return name;
	}
	public long getBalance() {
		return balance;
	}
	public void deposit(long money) {
		balance += money;
	}
	public void withdraw(long money) {
		if(money<=balance)
			balance -= money;
	}
	public int installmentSavingPredict(int month, int money) {
		return (int)balance+(int)(money*this.interest/12*(month*(month+1)/2)+money*month);
	}
	public int fixedDepositPredict(int month, int money) {
		return (int)((money+balance)+(money+balance)*(Math.pow(1+interest/12, month)-1));
	}
}