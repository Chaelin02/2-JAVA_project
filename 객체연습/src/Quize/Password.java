package Quize;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("암호문을 입력하세요(소문자만)>>");
		
		String input = sc.nextLine();  //공백포함해서 한줄 전체를 읽음 
		char str[] = input.toCharArray();   //한글자씩 자름
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
