package �ι���;

import java.util.Scanner;

public class program_8 {

	public static void main(String[] args) {
		System.out.println("���� 10�� �Է� >>");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [10];
		int temp;
			// sc.nextInt();  //�Է¹���
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 							
				}
			}	 
		}
	//	System.out.println("ū������ ���");
		for(int i=0; i<arr.lenght; i++ )
			System.out.println(arr[i] + " ");
			sc.close();
	}

}
