package �ι���;

import java.util.InputMismatchException;
import java.util.Scanner;

public class program_7 {

	public static void main(String[] args) {
		String day[] = {"��","��","ȭ","��","��","��","��"};
		
		Scanner scanner = new Scanner(System.in);
		while(true) {
			System.out.println("������ �Է��ϼ���");
		int n;
	
		try {
			n = scanner.nextInt();
		}
		catch (InputMismatchException e) {
			System.out.println("���! ���� �Է����� �ʾҽ��ϴ�.");
			scanner.next();
			continue;
		}
		if(n<0) {
			System.out.println("���α׷� �����մϴ�...");
			break;
		}
		int index = n%day.length;
		
		}
		
		

	}

}
