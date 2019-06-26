import java.util.Scanner;

public class program_3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num[] = new int[10];
		System.out.println("정수 10개 입력");
		
		for(int i=0; i<num.length; i++)
			num[i] = sc.nextInt();
			
		int min;
		for (int i = 0; i < num.length; i++) {
			min = i;
			for (int j = 0; j < num.length; j++) {
				if(num[min]>num[j])
					min = j;
				
				int tmp = num[i];
				num[i]=num[min];
				num[min]=tmp;
				
			}
		}
			for (int i = 0; i < num.length; i++) {
				System.out.println(num[i] + "");
		sc.close();
		}
		}
}
