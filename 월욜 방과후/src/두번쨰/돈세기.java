package 두번쨰;

import java.util.Scanner;

public class 돈세기 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("돈을 입력하세요");
		int money = sc.nextInt();
		
		System.out.println("5만원권의 개수 : "+money/50000);
		System.out.println("1만원 권의 개수 : "+money/10000);
		System.out.println("5천원 권의 개수 : "+money/5000);
		System.out.println("1천원 권의 개수 : "+money/1000);
		
		
	}

}
