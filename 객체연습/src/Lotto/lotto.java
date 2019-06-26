package Lotto;

import java.util.Random;

public class lotto {
	public static void main(String[] args) {
		
//	int l1, l2, l3, l4, l5, l6;
//	
//	l1 = (int)(Math.random()*45)+1;
//	do {
//		l2 = (int)(Math.random()*45)+1;
//	}while (l1==l2);
//	do {
//		l3 = (int)(Math.random()*45)+1;
//	}while (l1==l3 || l2==l3);
//	do {
//		l4 = (int)(Math.random()*45)+1;
//	}while (l1==l4 || l4==l2 || 14==13);
//	do {
//		l5 = (int)(Math.random()*45)+1;
//	}while (l1==l5 || l5==l2 || l5==l3 || l5==l4);
//	do {
//		l6 = (int)(Math.random()*45)+1;
//	}while (l1==l6 || l6==l2 || l6==l3 || l6==l4 || l6==l5);
//	System.out.println(l1+" "+l2+" "+l3+" "+l4+" "+l5);
	
		
		//Random random = new Random();
		int lotto[] = new int [7];
		int human[] = new int[6];
		int count = 2000;
		int lucky; //맞힌 숫자의 갯수
		int lucky_b;   //보너스 숫자를 맞혔는가? 1:맞음 0:틀림
		int rank1=0, rank2=0, rank3=0, rank4=0, rank5=0, rank6 =0;
		
		//당첨번호
	for(int i=0; i<lotto.length; i++) {
		lotto[i] = (int) (Math.random()*45)+1;
		for(int j=0; j<i; j++) {
			if(lotto[i]==lotto[j]) {
				i--;
				break;
						}//if
					}//for j
				}//for i
	
			for(int k=1; k<=count; k++) {
				System.out.printf("[제 %5d 회]",k);
				for(int i =0; i<6; i++) {
					System.out.printf("%2d",lotto[i]);    //%2d한이유는 자릿수 맞춰주려고. 
				}
				System.out.printf("[%2d] \t ",lotto[6]);
				
//				사용자의 로또 번호 추첨
				for(int i=0; i<human.length; i++) {
					human[i] = (int) (Math.random()*45)+1;
					for(int j=0; j<i; j++) {
						if(human[i]==human[j]) {
							i--;
							break;
									}//if
								}//for j
							}//for i
				
				lucky = 0;
				for(int i = 0; i<6; i++) {
					for(int j = 0; j<6; j++) {
						if(human[i] == lotto[j]) {
							System.out.printf("%2d",human[i]);
							lucky++;
							break;
						}//if 
						else if(human[i] != lotto[j] && j==5) {    //j==5가 없으면 그냥 값만 찍고 끝나버림.
							System.out.printf("%2d",human[i]);
						}//else if				
					}//for j
				}//for i
				
				int i1;
				for(i1=0, lucky_b=0; i1<6; i1++) {
					if(lotto[6] == human[i1]) {
						lucky_b=1;
						break;
					}
				}
				
				switch(lucky) {
				case 6:
					System.out.println("********축하합니다. 1등입니다.*******");
					rank1++;
					break;					
				case 5:
					if(lucky_b == 1) {
						System.out.println("[2등]");
						rank2++;
					}
					else {
						System.out.println("[3등]");
						rank3++;
					}
					break;
				case 4:
					System.out.println("[4등]");
					rank4++;
					break;
				case 3:
					System.out.println("[5등]");
					rank5++;
					break;
				default:
					System.out.println("*꽝*");
					rank6++;
					break;
					
				}
		}//for k
				System.out.println();
				System.out.println("[총 도전횟수] :"+count+"회\n");
				System.out.println("1등 : "+rank1+"회");
				System.out.println("2등 : "+rank2+"회");
				System.out.println("3등 : "+rank3+"회");
				System.out.println("4등 : "+rank4+"회");
				System.out.println("5등 : "+rank5+"회");
				System.out.println("꽝 : "+rank6+"회");
				
						
				System.out.println();
			}//for
	
			
			
			
	}
//}
