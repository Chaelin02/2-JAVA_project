package �ι���;

import java.util.Scanner;

public class ������ {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���� �Է��ϼ���");
		int money = sc.nextInt();
		
		System.out.println("5�������� ���� : "+money/50000);
		System.out.println("1���� ���� ���� : "+money/10000);
		System.out.println("5õ�� ���� ���� : "+money/5000);
		System.out.println("1õ�� ���� ���� : "+money/1000);
		
		
	}

}
