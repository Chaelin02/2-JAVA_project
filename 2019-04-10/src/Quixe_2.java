import java.util.Scanner;
// String�� ������ �ִ� ���ڿ� ���� ���ϴ� ���� length()����
public class Quixe_2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("��ȣ�� 10�ڸ� �Է�");
		int sum =0 ;
		
		String a = sc.nextLine();
	
		if(a.length() != 10) {
			System.out.println("��ǰ�� ��ȣ���� 10�ڸ��� �ƴմϴ�.");
			System.exit(0);
		}
		
	
		for(int i = 0; i<a.length(); i++) {
			 sum = a.charAt(i)-'0';  //-48 �ص� ���� 
		}	
		
		
		if(sum % 7 == 4) {
			System.out.println("Bad");	
		}else {
			System.out.println("Good");
			}
	
	}

}
