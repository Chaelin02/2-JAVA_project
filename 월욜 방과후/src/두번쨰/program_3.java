package �ι���;

import java.util.Scanner;

public class program_3 {

	public static void main(String[] args) {

				Scanner sc=new Scanner(System.in);
				int row, col;
				System.out.println("���� ������ �Է�");
				row=sc.nextInt();
				System.out.println("���� ������ �Է�");
				col=sc.nextInt();
				
				//row ����
				//col ����
				int [][] a = new int [row][col];
				int i, k, val =1;
				for(i=0; i<row; i++) {
					for (k=0; k<col; k++) {
						a[i][k]=val;
						val++;
					}
				}
				System.out.printf("a[0][0]���� a[%d][%d]���� ��� \n",row,col);
				
				for(i=0; i <row; i++) {
					for(k=0; k<col; k++) {
						System.out.printf("%3d",a[i][k]);
					}
					System.out.println("\n");
					
				}
			}
		
	

}
