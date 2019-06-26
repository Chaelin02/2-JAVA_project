import java.util.Scanner;

public class program_1 {
	public static void main(String ar[]) {
	Scanner sc = new Scanner(System.in);
	System.out.println("정수를 입력하세요");
	int a= sc.nextInt() ;
	
	if(a%2==0) {
		System.out.println("짝수입니다.");
	}else if(a%2 != 0) {
		System.out.println("홀수입니다.");
		}
	}
}
