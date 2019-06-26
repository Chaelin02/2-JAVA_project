package 두번쨰;

import java.util.Scanner;

public class program_8 {

	public static void main(String[] args) {
		System.out.println("정수 10개 입력 >>");
		Scanner sc = new Scanner(System.in);
		int arr[] = new int [10];
		int temp;
			// sc.nextInt();  //입력받음
		
		for (int i = 0; i < arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				if (arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
 							
				}
			}	 
		}
	//	System.out.println("큰수부터 출력");
		for(int i=0; i<arr.lenght; i++ )
			System.out.println(arr[i] + " ");
			sc.close();
	}

}
