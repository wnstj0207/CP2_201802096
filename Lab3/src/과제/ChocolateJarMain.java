package ����;

import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class ChocolateJarMain {
	public static void main(String[] args) {
		ChocolateJar chocolateJar = new ChocolateJar();
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int i=1, user, com, maxCom;
		
		System.out.println("������ �����մϴ�.");
		System.out.println("�׾Ƹ����� "+(chocolateJar.getChilli()+chocolateJar.getChocolate())+"���� �������� �ֽ��ϴ�.");
		System.out.println(chocolateJar.status());
		System.out.println("1~3���� �������� ���� �� ������ ĥ���� ������ �й��մϴ�.\n����!!");
		do {
			System.out.println("+------ "+i+"��° ��! ------+");
			do {
			System.out.println("�� ���� �������?(1~3)");
			user = input.nextInt();
			} while(user > chocolateJar.getChocolate() || user>=4 || user<=0);
			chocolateJar.takeItem(user);
			System.out.println("�÷��̾�� "+user+"���� ���ݸ��� ���½��ϴ�.");
			System.out.println(chocolateJar.status());
			if(chocolateJar.isEmpty() == true) {
				System.out.println("�÷��̾� �¸�!");
				break;
			}
			maxCom = Math.min(3, chocolateJar.getItem()-1);
			com = random.nextInt(1000)%maxCom%3 + 1;
			chocolateJar.takeItem(com);
			System.out.println("��ǻ�ʹ� "+com+"���� ���ݸ��� ���½��ϴ�.");
			System.out.println(chocolateJar.status());
			if(chocolateJar.isEmpty() == true) {
				System.out.println("��ǻ�� �¸�!");
				break;
			}
			i += 1;
		} while(chocolateJar.isEmpty() == false);
		input.close();
	}
}