package 두번쨰;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program_7 {

	public static void main(String[] args) {
		String day[] = {"일","월","화","수","목","금","토"};
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("정수를 입력하세요");
		int n;
	
		try {
			n = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("경고! 수를 입력하지 않았습니다.");
			scanner.next();
			continue;
		}
		if(n<0) {
			System.out.println("프로그램 종료합니다...");
			break;
		}
		int index = n%day.length;
		
		}
		
		

	}

}
