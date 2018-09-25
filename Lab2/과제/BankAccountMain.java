package 과제;

public class BankAccountMain {
	public static void main(String[] main) {
		Account account = new BankAccount("박준서", 300000, 0.1);
		int month, money;
		long bigMoney;
		
		System.out.println("계좌 주인은 "+account.getName()+"이고, 잔액은 "+account.getBalance()+" 입니다.\n");
		
		money = 100000;
		account.deposit(money);
		System.out.println("계좌에 "+money+"원을 입금하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");
		
		money = 100000;
		account.withdraw(money);
		System.out.println("계좌에 "+money+"원을 출금하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");
		
		money = 350000;
		account.withdraw(money);
		System.out.println("출금하려는 금액이 잔액보다 많아, 잔액은 "+account.getBalance()+"원 그대로 입니다.");
		
		money = 10000;
		month = 12;
		System.out.println("매월 "+money+"원씩 "+month+"개월 적금하면, 잔액이 "+account.installmentSavingPredict(month, money)+"원이 될 것입니다.");
		
		money = 2000000;
		month = 24;
		System.out.println(money+"원을 "+month+"개월 정기 예금하면, 잔액이 "+account.fixedDepositPredict(month, money)+"원이 될 것입니다.");
		
		bigMoney = 20000000000L;
		account.deposit(bigMoney);
		System.out.println("계좌에 "+bigMoney+"원을 입금하여, 잔액이 "+account.getBalance()+"원이 되었습니다.");
	}
}