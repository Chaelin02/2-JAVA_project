public class Quize {

	public static void main(String[] args) {
		
		int h,t;		//h= �����ڸ� t = ���� �ڸ�		
		int count = 0;
		
		for(int i=1000; i<=9999; i++) {
			t = (i/100) % 10 ; //10�� �ڸ� ���ϱ�
			h = (i/10) % 10 ;  //100�� �ڸ� ���ϱ�
			
			if((h==t) && (i%9==0)) {
				count ++;		
				System.out.print(i+" ");
				if(count%10 == 0)
					System.out.println();
				}//if
			}//for
		System.out.println("�� ������:"+count);
		}//main

} 
