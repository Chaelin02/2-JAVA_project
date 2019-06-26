package 가위바위보;

import java.util.Random;
import java.util.Scanner;

public class 가위바위보게임 {

	public static void main(String[] args) {
		
		System.out.println("1.가위 2.바위 3.보  (중에 선택하세요)");
		Scanner sc = new Scanner(System.in);
		int me = sc.nextInt();

	//	Random random = new Random();
		int com = random.nextInt(3);
		
	
		while(true) {
			switch(com) {
			case 1: 
				if(me == 1) {
					System.out.println("com : "+ com + "me : "+ me +"비겼습니다!");
				}if(me == 2) {
					System.out.println("com : "+ com + "me : "+ me +"사용자가 이겼습니다!");
				}
				if(me.equals(c)) {
					System.out.println("com : "+ com + "me : "+ me +"컴퓨터의 승리!");
				}
		
				
			}//switch
		
		}//while
	}//main
}//class end
		
					
			



