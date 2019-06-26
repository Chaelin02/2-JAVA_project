public class Quize {

	public static void main(String[] args) {
		
		int h,t;		//h= 백의자리 t = 십의 자리		
		int count = 0;
		
		for(int i=1000; i<=9999; i++) {
			t = (i/100) % 10 ; //10의 자리 구하기
			h = (i/10) % 10 ;  //100의 자리 구하기
			
			if((h==t) && (i%9==0)) {
				count ++;		
				System.out.print(i+" ");
				if(count%10 == 0)
					System.out.println();
				}//if
			}//for
		System.out.println("총 갯수는:"+count);
		}//main

} 
