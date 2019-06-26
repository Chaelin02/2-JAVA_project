package Constructor;

import java.util.Scanner;

public class Car_2Main extends Car_2 {

	public static void main(String[] args) {
		Car_2Main car2 = new Car_2Main();
		
		Scanner sc = new Scanner(System.in);
		String y = sc.next();
		
		 car2.setColor();

	}

}
