package programmingExercises;
import java.util.Scanner;
public class Problem4_5 {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 System.out.println("Enter the number of sides of the regular poylgon:");
	 int numberOfSides = input.nextInt();
	 System.out.println("Enter the length of a side:");
	 double side = input.nextDouble();
	 
	 double area = (numberOfSides*side*side)/(4*Math.tan(Math.PI/numberOfSides));
	 
	 System.out.printf("area of the regular polygon with %3d sides and side length %5.2f is %5.2f", 
			 numberOfSides,side, area);
	 

	}

}
