package 두번쨰;

import java.util.Scanner;

public class program_3 {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				int row, col;
				System.out.println("행의 갯수를 입력");
				row=sc.nextInt();
				System.out.println("열의 갯수를 입력");
				col=sc.nextInt();
				
				//row 가로
				//col 세로
				int [][] a = new int [row][col];
				int i, k, val =1;
				for(i=0; i<row; i++) {
					for (k=0; k<col; k++) {
						a[i][k]=val;
						val++;
					}
				}
				System.out.printf("a[0][0]부터 a[%d][%d]까지 출력 \n",row,col);
				
				for(i=0; i <row; i++) {
					for(k=0; k<col; k++) {
						System.out.printf("%3d",a[i][k]);
					}
					System.out.println("\n");
					
				}
			}
		
	

}
