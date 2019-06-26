package 두번쨰;

import java.util.Scanner;

public class program_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
	
		int a,b,c,d,hap;
		
		System.out.println("1번째 숫자 입력>");
		a = sc.nextInt();

		System.out.println("2번째 숫자 입력>");
		b = sc.nextInt();

		System.out.println("3번째 숫자 입력>");
		c = sc.nextInt();

		System.out.println("4번째 숫자 입력>");
		d = sc.nextInt();
		
		hap = a + b + c + d;
		System.out.println("합계>>"+hap);
						
	}

}
