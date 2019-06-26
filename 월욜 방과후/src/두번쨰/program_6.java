package 두번쨰;

import java.util.Scanner;

public class program_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int [10];
		System.out.println("정수 10개를 입력하세요");
			
			for(int i=0; i<n.length; i++) {  //정수 읽기
				n[i] = sc.nextInt();	
			}
			for(int i=0; i<n.length; i++)
				if(n[i] % 3 ==0)
					System.out.println(n[i]+" ");
		}	
	//sc.close();

}
