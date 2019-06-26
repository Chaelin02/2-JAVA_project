package 두번쨰;

import java.util.Scanner;

public class program_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("소문자 알파벳 하나를 입력하세요>>");
		String s = sc.next();   //입력을 문자열로 읽음 
		char c = s.charAt(0);  //문자열의 첫 번째 문자
		
		for(char a = 'a'; a <= c; a++) {
				System.out.println(a);
			
		}
	
		sc.close();
	}

}
