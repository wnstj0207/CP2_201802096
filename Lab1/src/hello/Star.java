package hello;

import java.util.Scanner;

public class Star {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n;

		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		n = s.nextInt();
		if(n<=0)
			n=5;
		System.out.println("---[1��]---");
		for(int i=1; i<=n; i++) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		n = s.nextInt();
		if(n<=0)
			n=5;
		System.out.println("---[2��]---");
		for(int i=n; i>0; i--) {
			for(int j=0; j<i; j++)
				System.out.print("*");
			System.out.println();
		}
		do {
		System.out.print("�� ���� �ٷ� ���� ����ұ��? ");
		n = s.nextInt();
		if(n<=0)
			n = 9;
		} while(n%2 == 0);
		System.out.println("---[3��]---");
		for(int i=1; i<=n/2+1; i++) {
			for(int j=n/2+1; j>i; j--)
				System.out.print(" ");
			for(int k=0; k<i; k++)
				System.out.print("*");
			for(int l=1; l<i; l++)
				System.out.print("*");
			System.out.println();
		}
		for(int i=n/2; i>0; i--) {
			for(int j=n/2; j>=i; j--)
				System.out.print(" ");
			for(int k=0; k<i; k++)
				System.out.print("*");
			for(int l=1; l<i; l++)
				System.out.print("*");
			System.out.println();
		}
		s.close();
	}
}