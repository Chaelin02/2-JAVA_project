package �ι���;

import java.util.Scanner;

public class program_9 {

	public static void main(String[] args) {
		String eng[] = {"student","love","java","happy","future"};
		String kor[] = {"�л�" , "���" ,"�ڹ�","�ູ��","�̷�"};
		
		Scanner sc = new Scanner(System.in);
		while(true) {
			System.out.println("���� �ܾ �Է��ϼ���>>");
			String s = sc.nextLine();
			if(s.equals("exit"))
				break;
	int i;
	for(i=0; i<eng.length; i++) {
		if(eng[i].equals(s)) {
			System.out.println(kor[i]);
			break;
		}
	}
			if(i==eng.length)
				System.out.println("�׷� ����ܾ �����ϴ�.");
		}
		sc.close();
	}
}
