import java.util.Scanner;

public class program_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("정수를 입력받으세요");
		
		String day[] = {"일","월","화","수 ","목","금","토"};
		int a = sc.nextInt();

		 if(a>0) {
			 System.out.println(day[a%7]);
		 }else if(a<0) {
			 System.exit(0);
		 }
	}

}
