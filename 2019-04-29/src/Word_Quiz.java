import java.util.Scanner;

public class Word_Quiz {

	public static void main(String[] args) {
		

		String strArr[] = {"love","happy","tired","java","handsome","cute"};
		Scanner sc = new Scanner(System.in);
		
		while(true) { 
		
		String answer =	getAnswer(strArr);
		String question =getScrambleWorld(answer);
		char hint[] = new char[answer.length()];  // d�� �迩��
		
		for(int i =0; i<hint.length; i++) {
			hint[i] = '_';
		}
		
		while(true) {
			System.out.println("Question : "+question);   //�����ִ°� ������
			System.out.println("Your Answer is (q�� ����������) : " );  //�����ΰ� ����
	 	String input = sc.next();
	 	
		if(input.equalsIgnoreCase("q")) {  //��ҹ��� ���о���
			System.out.println("���α׷��� �����մϴ�.");
			System.exit(0);;
		}	
		else if(input.equalsIgnoreCase(answer)) {
			System.out.println("�����Դϴ�.");
			System.out.println();
			break;
		}
		else {
			System.out.println(input+"(��)�� ������ �ƴմϴ�. �ٽ� �õ��غ�����.");
			System.out.println("Hint : "+getHint(answer,hint));
		}
		
		
			}//while	
		}//�ι�° ȭ��
	
	}//main
	public static String getHint(String answer,char[] hint) {
		int count = 0; //����� ����
		for(int i=0; i<=hint.length; i++) {
			if(hint[i]=='_')
			count++;
		}
			if(count > 2) {  //hint�� �ٶ� ������ΰ��� ã������ ȭ�Ϲ� ������
				while(true) {   // ���ѹݺ�==�����ڵ�(?)
				int idx = (int)Math.random()*answer.length();  //ids==0~3������ ������ ����
				if(hint[idx]=='_') {
					hint[idx] = answer.charAt(idx);
					break;
					}//if
				
				}//while
			}//if
		return new String(hint);  //Char���� hint�迭�� String���� �ٲ���
	}
	
	//Math�� 0���� 0.9999���� 1������ ���� �ƴ�.
		public static String getAnswer(String strArr[]) {			
			return strArr[(int)(Math.random() *strArr.length)];
			
		}//getAnwer
		
		
		public static String getScrambleWorld(String str) {
			
			 char[] chArr = str.toCharArray();
			 for(int i=0; i<10; i++) {
				 
				 int idx = (int)(Math.random() *str.length());   //idx == 3����
				 	char temp = chArr[0];
				 	chArr[0] = chArr[idx];
				 	chArr[idx] = temp;
				 	
			 }//for
			 
			 return new String(chArr);
			
		}//getScrambleWorld
		
		
}//main
