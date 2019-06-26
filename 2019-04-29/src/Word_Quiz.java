import java.util.Scanner;

public class Word_Quiz {

	public static void main(String[] args) {
		

		String strArr[] = {"love","happy","tired","java","handsome","cute"};
		Scanner sc = new Scanner(System.in);
		
		while(true) { 
		
		String answer =	getAnswer(strArr);
		String question =getScrambleWorld(answer);
		char hint[] = new char[answer.length()];  // d왜 배여림
		
		for(int i =0; i<hint.length; i++) {
			hint[i] = '_';
		}
		
		while(true) {
			System.out.println("Question : "+question);   //섞어주는걸 담은ㅁ
			System.out.println("Your Answer is (q를 누르면종료) : " );  //정답인거 담음
	 	String input = sc.next();
	 	
		if(input.equalsIgnoreCase("q")) {  //대소문자 구분안함
			System.out.println("프로그램을 종료합니다.");
			System.exit(0);;
		}	
		else if(input.equalsIgnoreCase(answer)) {
			System.out.println("정답입니다.");
			System.out.println();
			break;
		}
		else {
			System.out.println(input+"(은)는 정답이 아닙니다. 다시 시도해보세요.");
			System.out.println("Hint : "+getHint(answer,hint));
		}
		
		
			}//while	
		}//두번째 화일
	
	}//main
	public static String getHint(String answer,char[] hint) {
		int count = 0; //언더바 갯수
		for(int i=0; i<=hint.length; i++) {
			if(hint[i]=='_')
			count++;
		}
			if(count > 2) {  //hint를 줄때 언더바인것을 찾으려고 화일문 돌리기
				while(true) {   // 무한반복==영생코드(?)
				int idx = (int)Math.random()*answer.length();  //ids==0~3사이의 임의의 숫자
				if(hint[idx]=='_') {
					hint[idx] = answer.charAt(idx);
					break;
					}//if
				
				}//while
			}//if
		return new String(hint);  //Char였던 hint배열을 String으로 바꿔줌
	}
	
	//Math는 0부터 0.9999까지 1까지는 절대 아님.
		public static String getAnswer(String strArr[]) {			
			return strArr[(int)(Math.random() *strArr.length)];
			
		}//getAnwer
		
		
		public static String getScrambleWorld(String str) {
			
			 char[] chArr = str.toCharArray();
			 for(int i=0; i<10; i++) {
				 
				 int idx = (int)(Math.random() *str.length());   //idx == 3가정
				 	char temp = chArr[0];
				 	chArr[0] = chArr[idx];
				 	chArr[idx] = temp;
				 	
			 }//for
			 
			 return new String(chArr);
			
		}//getScrambleWorld
		
		
}//main
