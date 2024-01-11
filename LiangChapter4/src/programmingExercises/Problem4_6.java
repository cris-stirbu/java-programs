package programmingExercises;
import java.util.Scanner;
public class Problem4_6 {

	public static void main(String[] args) {
		System.out.println("Generate 3 random angles with vertex in the "
				+ " center of the circle of radius r");
		double alfa1 = Math.random()*(2*Math.PI);
		double alfa2 = Math.random()*(2*Math.PI);
		double alfa3 = Math.random()*(2*Math.PI);
		System.out.printf(" alfa1=%3.2f\n alfa2=%3.2f\n alfa3=%3.2f\n ",
				alfa1, alfa2, alfa3);
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the circle");
		double radius = input.nextDouble();
		
		System.out.println("\n The coordinates of the three points on the circle are:");
		
		double x1 = radius*Math.cos(alfa1);
		double y1 = radius*Math.sin(alfa1);
		
		double x2 = radius*Math.cos(alfa2);
		double y2 = radius*Math.sin(alfa2);
		
		double x3 = radius*Math.cos(alfa3);
		double y3 = radius*Math.sin(alfa3);
		
		
		System.out.printf("A(%3.2f, %3.2f), B(%3.2f, %3.2f), C(%3.2f, %3.2f)\n",
				x1, y1, x2, y2, x3, y3);
		
		System.out.println("The sides of the triangle ABC:");
		double a = Math.sqrt((x2-x3)*(x2-x3)+(y2-y3)*(y2-y3));
		double b = Math.sqrt((x1-x3)*(x1-x3)+(y1-y3)*(y1-y3));
		double c = Math.sqrt((x1-x2)*(x1-x2)+(y1-y2)*(y1-y2));
		System.out.printf("a=%3.2f, b=%3.2f, c=%3.2f\n", a, b, c);
		
		System.out.println("The angles of the triangle ABC are:");
		
		double A = Math.toDegrees(Math.acos((c*c+b*b-a*a)/(2*b*c)));
		double B = Math.toDegrees(Math.acos((a*a+c*c-b*b)/(2*a*c)));
		double C = Math.toDegrees(Math.acos((a*a+b*b-c*c)/(2*a*b)));
		
		System.out.printf("A=%3.2f, B=%3.2f, C=%3.2f", A, B, C);
		
		
		
		
		
		
	}

}
