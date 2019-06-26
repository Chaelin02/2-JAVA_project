package 가위바위보;

import java.util.Scanner;
//main 밖은 지역변수
public class Game {
	public static final int 가위 = 1;
	public static final int 바위 = 2;
	public static final int 보 = 3;

	public static void main(String[] args) {
		int com, you ;
		Scanner sc = new Scanner(System.in);
		String choice ;
		
//		Math.random();    //0.00 ~ 0.999~까지 1은 안나옴
//		Math.random() * 3 는 2.99999까지 
//		(int)(Math.random() * 3)는 0,1,2 나옴
		
		
		
		while(true) {
			 
			com = (int)(Math.random() * 3) + 1;
			System.out.println("원하는 값을 입력(1:가위 , 2:바위 , 3:보) : ") ;
			you = sc.nextInt();
			
//			System.out.println("com : " + com + "you : " + you);
//			방법1 : 초급자 코스
			
//			if(com == 1) {    //com:가위
//				switch(you) {
//				case 1:
//					System.out.println("컴퓨터 : 가위, 사용자:가위, ===> 비겼습니다.");
//					break;
//				case 2:
//					System.out.println("컴퓨터 : 가위, 사용자:바위, ===> 사용자가 이겼습니다.");
//					break;
//				case 3:
//					System.out.println("컴퓨터 : 가위, 사용자:보, ===> 컴퓨터가 이겻습니다.");
//					break;
//				default:
//					System.out.println("1~3사이의 정수만 입력해 주세요.");
//					break;
//				}
//			}else if(com == 2) {  //com:바위
//				switch(you) {
//				case 1:
//					System.out.println("컴퓨터 : 바위, 사용자:바위, ===> 비겼습니다.");
//					break;
//				case 2:
//					System.out.println("컴퓨터 : 바위, 사용자:보, ===> 사용자가 이겼습니다.");
//					break;
//				case 3:
//					System.out.println("컴퓨터 : 바위, 사용자:가위, ===> 컴퓨터가 이겻습니다.");
//					break;
//				default:
//					System.out.println("1~3사이의 정수만 입력해 주세요.");
//					break;
//				}
//			}else if(com == 3) {   //com:보
//				switch(you) {
//				case 1:
//					System.out.println("컴퓨터 : 보, 사용자:가위, ===> 사용자가 이겼습니다.");
//					break;
//				case 2:
//					System.out.println("컴퓨터 : 보, 사용자:바위, ===> 컴퓨터가 이겼습니다.");
//					break;
//				case 3:
//					System.out.println("컴퓨터 : 보, 사용자:보, ===> 비겼습니다. ");
//					break;
//				default:
//					System.out.println("1~3사이의 정수만 입력해 주세요.");
//					break;
//				}
//			}
			
//			방법2: 중급코스
//			switch(com) {
//			case 1:
//				System.out.print("컴퓨터 : 가위 \t");
//				break;
//			case 2:
//				System.out.print("컴퓨터: 바위\t");
//				break;
//			case 3:
//				System.out.print("컴퓨터 : 보\t");
//				break;
//			}//switch
//			
//			switch(you) {
//			case 1:
//				System.out.print("사용자 : 가위 \t");
//				break;
//			case 2:
//				System.out.print("사용자: 바위\t");
//				break;
//			case 3:
//				System.out.print("사용자 : 보\t");
//				break;
//			default :
//				System.out.println("1~3에서 3사이의 숫자만 입력해 주세요.");
//				break;
//			}//switch
			
			System.out.println("컴퓨터 :"+print(com));
			System.out.println("사용자 :"+print(you));
				
			
//			if((you==가위 && com==보) || (you==바위 && com==가위) || (you==보 && com==바위))
//				System.out.println(" 사용자의 승리");
//			else if(you==com)
//				System.out.println("비겼습니다.");
//			else 
//				System.out.println("컴퓨터의 승리");
			
						
//			최상급자 코스
			//			이기는 경우, 지는경우, 비기는 경우 
//			각각 빼서 계산함. you-com 해서
//			+3하고 %3 의 나머지.
			switch((you-com +3)%3) {
			case 1: 
				System.out.println("사용자의 승리");
				break;
			case 2:
				System.out.println("컴퓨터의 승리");
				break;
			case 0:
				System.out.println("비겼습니다.");
				break;
		default:
			System.out.println("1~3사이의 정수만 입력해주세요.");
				
				
			}			
			System.out.println("계속 하시겠습니까? (y or n)");
			choice = sc.next();
			
//			if(choice.equals("n") || choice.equals("N")) {
			if(choice.equalsIgnoreCase("N")) {   //대문자, 소문자 상관없이 넣을 수 있다.
				System.out.println("게임을 종료합니다.");
				System.exit(0);
				}				
			}//while end
		}//main

	
	static public String print(int su) {
	
		String choice;
		if(su==1)
			choice = "가위\t";
		else if(su==2)
			choice = "바위\t";
		else if(su==3)
			choice = "보 \t";
		}//print
}
              