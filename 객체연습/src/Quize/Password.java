package Quize;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("��ȣ���� �Է��ϼ���(�ҹ��ڸ�)>>");
		
		String input = sc.nextLine();  //���������ؼ� ���� ��ü�� ���� 
		char str[] = input.toCharArray();   //�ѱ��ھ� �ڸ�
		char temp;
		
		for(int i=0; i<str.length; i++) {
			if(str[i]==' ') {
				temp = ' ';
			}
			else if(str[i]=='a') {
				temp = 'x';
			}
			else if(str[i]=='b') {
				temp = 'y';
			}
			else if(str[i]=='c') {
				temp = 'z';
			}
			else 
				temp = (char)(str[i] - 3);
			
		System.out.print(temp);
		}

		
	}
}
