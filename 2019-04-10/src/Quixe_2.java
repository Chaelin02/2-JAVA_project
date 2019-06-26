import java.util.Scanner;
// String이 가지고 있는 문자열 길이 구하는 법은 length()쓰기
public class Quixe_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("신호값 10자리 입력");
		int sum =0 ;
		
		String a = sc.nextLine();
	
		if(a.length() != 10) {
			System.out.println("제품의 신호값이 10자리가 아닙니다.");
			System.exit(0);
		}
		
	
		for(int i = 0; i<a.length(); i++) {
			 sum = a.charAt(i)-'0';  //-48 해도 ㄱㅊ 
		}	
		
		
		if(sum % 7 == 4) {
			System.out.println("Bad");	
		}else {
			System.out.println("Good");
			}
	
	}

}
