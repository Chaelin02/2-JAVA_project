package �ι���;

import java.util.Scanner;

public class program_5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("�ҹ��� ���ĺ� �ϳ��� �Է��ϼ���>>");
		String s = sc.next();   //�Է��� ���ڿ��� ���� 
		char c = s.charAt(0);  //���ڿ��� ù ��° ����
		
		for(char a = 'a'; a <= c; a++) {
				System.out.println(a);
			
		}
	
		sc.close();
	}

}
