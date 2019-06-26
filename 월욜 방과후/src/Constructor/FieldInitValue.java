package Constructor;

public class FieldInitValue {
		byte byteField;
		short shortField;
		int intField;
		long longField;
		boolean booleanField;
		char charField;
		float floatField;
		double doubleField;
		int[] arrField;
		String referenceFiled;
		
		
		public static void main(String[] args) {
			FieldInitValue q=new FieldInitValue();
			
			System.out.println(q.byteField);
			System.out.println(q.shortField);
			System.out.println(q.intField);
			System.out.println(q.longField);
			System.out.println(q.booleanField);
			System.out.println(q.charField);
			System.out.println(q.floatField);
			System.out.println(q.doubleField);
			System.out.println(q.arrField);
			System.out.println(q.referenceFiled);



	}

}
