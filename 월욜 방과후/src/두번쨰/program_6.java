package �ι���;

import java.util.Scanner;

public class program_6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n[] = new int [10];
		System.out.println("���� 10���� �Է��ϼ���");
			
			for(int i=0; i<n.length; i++) {  //���� �б�
				n[i] = sc.nextInt();	
			}
			for(int i=0; i<n.length; i++)
				if(n[i] % 3 ==0)
					System.out.println(n[i]+" ");
		}	
	//sc.close();

}
