/*100 �̸��� ���ӵ� �� �ڸ����� ¦�� 3���� ���Ͽ�����, 4****2�� �Ǿ���. 
	�� �� ���� ���� � ������, �׸��� ����� ������ ���ϴ� ���α׷��� for���� �̿��ؼ� �ۼ�.*/
public class Quiz_1 {

	public static void main(String[] args) {
		int number;
		
		for(int i=10; i<100; i++) {
				number = i * (i+2) *(i+4);
				//System.out.println(number);
				if ((number/100000==4) && (number%10==2)) 			
					System.out.println(i + "*" + (i+2) + "*" + (i*4) + "="+ number);
					
			
		}//for

	}

}
