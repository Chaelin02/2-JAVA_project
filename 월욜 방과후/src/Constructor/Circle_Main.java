package Constructor;

public class Circle_Main extends circle {

	public static void main(String[] args) {
		 Circle_Main circleInfo = new Circle_Main ();
		  
		  circleInfo.setRadius(5); //원의 반지름을 주어진 값으로 변경
		  System.out.println("원의 반지름 : "+circleInfo.getRadius());
		  System.out.println("원의 면적 : "+circleInfo.print_extent());
		  System.out.println("원의 둘레 : "+circleInfo.print_circumference());
		 }
}
