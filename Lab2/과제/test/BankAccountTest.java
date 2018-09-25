package 과제.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import 과제.BankAccount;

class BankAccountTest {

	@Test
	void testGetName() {
		BankAccount bankAccount = new BankAccount("박준서", 300000, 0.1);
		assertEquals("박준서", bankAccount.name);
	}

	@Test
	void testGetBalance() {
		BankAccount bankAccount = new BankAccount("박준서", 300000, 0.1);
		assertEquals(bankAccount.getBalance(), bankAccount.balance);
	}

	@Test
	void testDeposit() {
		BankAccount bankAccount = new BankAccount("박준서", 300000, 0.1);
		bankAccount.deposit(100000);
		assertEquals(400000, bankAccount.balance);
		bankAccount.deposit(20000000000L);
		assertEquals(20000400000L, bankAccount.balance);
	}

	@Test
	void testWithdraw() {
		BankAccount bankAccount = new BankAccount("박준서", 300000, 0.1);
		bankAccount.withdraw(100000);
		assertEquals(200000, bankAccount.balance);
		bankAccount.withdraw(250000);
		assertEquals(200000, bankAccount.balance);
	}

	@Test
	void testInstallmentSavingPredict() {
		BankAccount bankAccount = new BankAccount("박준서", 300000, 0.1);
		assertEquals(426500, bankAccount.installmentSavingPredict(12, 10000));
	}

	@Test
	void testFixedDepositPredict() {
		BankAccount bankAccount = new BankAccount("박준서", 300000, 0.1);
		assertEquals(2806899, bankAccount.fixedDepositPredict(24, 2000000));
	}

}
