package Quize;

import java.util.Scanner;

public class Office {

	static int n;
	static int s[];
	public static void main(String[] args) {
		int i;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("회사의 수를 입력하세요 (10개 이하)");
		n = sc.nextInt();
		s = new int [n];   //회사수만큼 방을 만듦
		
		for (i=0; i<n; i++) {
			s[i] = sc.nextInt();
		}//for
		System.out.println("회사의 휴대폰 판매량을 적으세요(100이하)");
		int amount = sc.nextInt();
		
		System.out.println(amount);
//		for(int i = 0; i < a.length; i++) {
//			System.out.println(a[i]);
//		}
		
		for(i = 0; i<s.length; i++) {
			System.out.println(s[i] + "==>" + rank(s[i]+"등");
		}
		
		
	}//main
	public int rank() {
		int rank = 1;
		for(int i = 0; i<n; i++) {
			if(n<s[i])
				rank++;
		}
		return rank;
	}//rank

}
