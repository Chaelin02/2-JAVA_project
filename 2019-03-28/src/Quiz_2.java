import java.util.Scanner;

public class Quiz_2 {
// static 이 new 와 비슷한 역할을 함.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a , b, c; // 사용자 입력
		int key = 0; //만능키의 값
		int count = 0; //수행 횟수
		int min;
		System.out.print("ID 세개의 문 보안키를 입력하세요.ex)10 20 30");
		a =sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
//		
//	//방법1	
//		for(int i=1; i<=100; i++) {
//			count++;
//			if((a%i==0) && (b%i==0) && (c%i==0)) {
//			key = i;
//			
//			} 		
//		} //for	
//		
		
//		방법2
//		for(int i=1; i<=a; i++) {
//			count++;
//			if((a%i==0) && (b%i==0) && (c%i==0)) {
//				//System.out.println(i + " 세수의 약수");
////				1,2,5,10 이 출력된다.
//			key = i;
//			
//			} 		
//		} //for	
		
		
//		//	방법3 : 삼항연산자를 사용 (조건) ? true : false
//		min = a < b ? (a < c ? a : c): (b < c ? b : c);
//		
//		for(int i=1; i<=min; i++) {
//		count++;
//		if((a%i==0) && (b%i==0) && (c%i==0)) {
//		key = i;
//		
//		} 		
//	} //for	
//		
//
		for(int i=1; i<=min(c,min(a,b)); i++) {
			count++;
			if((a%i==0) && (b%i==0) && (c%i==0)) {
			key = i;
			
			} 		
		} //for
		
	
		System.out.println("만능키의 값은:"+key);
		System.out.println("수행횟수="+ count+"회 입니다.");
	} //main
//		방법4 : 메서드 함수.
				
	public static int min (int a, int b) {
		if(a>b)
			return b;
		else
			return a;
	}
	
}
