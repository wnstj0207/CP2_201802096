package 과제;

import java.util.Scanner;
import java.math.*;
import java.util.Random;

public class ChocolateJarMain {
	public static void main(String[] args) {
		ChocolateJar chocolateJar = new ChocolateJar();
		Scanner input = new Scanner(System.in);
		Random random = new Random();
		int i=1, user, com, maxCom;
		
		System.out.println("게임을 시작합니다.");
		System.out.println("항아리에는 "+(chocolateJar.getChilli()+chocolateJar.getChocolate())+"개의 아이템이 있습니다.");
		System.out.println(chocolateJar.status());
		System.out.println("1~3개의 아이템을 꺼낼 수 있으며 칠리를 꺼내면 패배합니다.\n시작!!");
		do {
			System.out.println("+------ "+i+"번째 턴! ------+");
			do {
			System.out.println("몇 개를 뽑을까요?(1~3)");
			user = input.nextInt();
			} while(user > chocolateJar.getChocolate() || user>=4 || user<=0);
			chocolateJar.takeItem(user);
			System.out.println("플레이어는 "+user+"개의 초콜릿을 꺼냈습니다.");
			System.out.println(chocolateJar.status());
			if(chocolateJar.isEmpty() == true) {
				System.out.println("플레이어 승리!");
				break;
			}
			maxCom = Math.min(3, chocolateJar.getItem()-1);
			com = random.nextInt(1000)%maxCom%3 + 1;
			chocolateJar.takeItem(com);
			System.out.println("컴퓨터는 "+com+"개의 초콜릿을 꺼냈습니다.");
			System.out.println(chocolateJar.status());
			if(chocolateJar.isEmpty() == true) {
				System.out.println("컴퓨터 승리!");
				break;
			}
			i += 1;
		} while(chocolateJar.isEmpty() == false);
		input.close();
	}
}