
public class String변환 {

	public static void main(String[] args) {
		String data1 = "10" , data2 = "20";
		
		System.out.println("data1 = "+data1+"data2 = "+data2);
			System.out.println("parseInt() 와 parseDouble()메소드 이용");

			
			int c = Integer.intValue(data1);
			int d = Integer.parseInt(data2);
			int sum= c+d;
			
			System.out.println("data1+data2 = "+sum);
			
			double e = Double.parseDouble(data1);
			double f = Double.parseDouble(data2);
			double sum2 = f + e;
			System.out.println("data1+data2 = "+sum2);

		
			
			
			
			
	}

}
