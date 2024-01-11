package programmingExercises;
import java.util.Scanner;

public class Problem4_1 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("give the radius of the circumscribed circle:");
		double radius = input.nextDouble();
		System.out.println("The side of the pentagon is:");
		double side = 2*radius*Math.sin(Math.PI/5);
		System.out.printf("side=%5.2f\n", side);
		double area = (5*side*side)/(4*Math.tan(Math.PI/5));
		System.out.printf("Area of the pentagon is %6.2f", area);
		
	}

}
