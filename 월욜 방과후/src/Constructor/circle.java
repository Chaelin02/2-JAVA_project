package Constructor;
//설정자 원의 반경 값을 클래스에 주소 원의 면적과 원의 둘레를 구하는 프로그램을 작성하시오
public class circle {

		 double radius;
		 
		 public circle(){
		  this.radius = 0;
		 }
		 public double getRadius() {
		  return radius;
		 }

		 public void setRadius(double radius) {
		  this.radius = radius;
		 }
		 
		 public double print_extent(){ //원의 넓이 반환
		  return radius*radius*Math.PI;
		 }
		 
		 public double print_circumference(){ //원의 둘레 반환
		  return 2*radius*Math.PI;
		 }
		
	}


