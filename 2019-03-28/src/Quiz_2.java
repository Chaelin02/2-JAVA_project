import java.util.Scanner;

public class Quiz_2 {
// static �� new �� ����� ������ ��.
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		
		int a , b, c; // ����� �Է�
		int key = 0; //����Ű�� ��
		int count = 0; //���� Ƚ��
		int min;
		System.out.print("ID ������ �� ����Ű�� �Է��ϼ���.ex)10 20 30");
		a =sc.nextInt();
		b =sc.nextInt();
		c =sc.nextInt();
//		
//	//���1	
//		for(int i=1; i<=100; i++) {
//			count++;
//			if((a%i==0) && (b%i==0) && (c%i==0)) {
//			key = i;
//			
//			} 		
//		} //for	
//		
		
//		���2
//		for(int i=1; i<=a; i++) {
//			count++;
//			if((a%i==0) && (b%i==0) && (c%i==0)) {
//				//System.out.println(i + " ������ ���");
////				1,2,5,10 �� ��µȴ�.
//			key = i;
//			
//			} 		
//		} //for	
		
		
//		//	���3 : ���׿����ڸ� ��� (����) ? true : false
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
		
	
		System.out.println("����Ű�� ����:"+key);
		System.out.println("����Ƚ��="+ count+"ȸ �Դϴ�.");
	} //main
//		���4 : �޼��� �Լ�.
				
	public static int min (int a, int b) {
		if(a>b)
			return b;
		else
			return a;
	}
	
}
