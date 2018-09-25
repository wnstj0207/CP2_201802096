package ����;

public class BankAccountMain {
	public static void main(String[] main) {
		Account account = new BankAccount("���ؼ�", 300000, 0.1);
		int month, money;
		long bigMoney;
		
		System.out.println("���� ������ "+account.getName()+"�̰�, �ܾ��� "+account.getBalance()+" �Դϴ�.\n");
		
		money = 100000;
		account.deposit(money);
		System.out.println("���¿� "+money+"���� �Ա��Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
		
		money = 100000;
		account.withdraw(money);
		System.out.println("���¿� "+money+"���� ����Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
		
		money = 350000;
		account.withdraw(money);
		System.out.println("����Ϸ��� �ݾ��� �ܾ׺��� ����, �ܾ��� "+account.getBalance()+"�� �״�� �Դϴ�.");
		
		money = 10000;
		month = 12;
		System.out.println("�ſ� "+money+"���� "+month+"���� �����ϸ�, �ܾ��� "+account.installmentSavingPredict(month, money)+"���� �� ���Դϴ�.");
		
		money = 2000000;
		month = 24;
		System.out.println(money+"���� "+month+"���� ���� �����ϸ�, �ܾ��� "+account.fixedDepositPredict(month, money)+"���� �� ���Դϴ�.");
		
		bigMoney = 20000000000L;
		account.deposit(bigMoney);
		System.out.println("���¿� "+bigMoney+"���� �Ա��Ͽ�, �ܾ��� "+account.getBalance()+"���� �Ǿ����ϴ�.");
	}
}