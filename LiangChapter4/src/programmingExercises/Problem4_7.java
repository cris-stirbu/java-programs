package programmingExercises;
import java.util.Scanner;
public class Problem4_7 {

	public static void main(String[] args) {
		double alfa1=Math.PI/2-2*Math.PI/5;
		double alfa2=Math.PI/2;
		double alfa3=alfa2+2*Math.PI/5;
		double alfa4=alfa3+2*Math.PI/5;
		double alfa5=alfa4+2*Math.PI/5;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the radius of the bounding circle:");
		double radius = input.nextDouble();
		
		System.out.println("\n the coordinates of the vertices of the pentagon are:");
		
		double x1=radius*Math.cos(alfa1);
		double y1=radius*Math.sin(alfa1);
		double x2=radius*Math.cos(alfa2);
		double y2=radius*Math.sin(alfa2);
		double x3=radius*Math.cos(alfa3);
		double y3=radius*Math.sin(alfa3);
		double x4=radius*Math.cos(alfa4);
		double y4=radius*Math.sin(alfa4);
		double x5=radius*Math.cos(alfa5);
		double y5=radius*Math.sin(alfa5);
		
		System.out.printf("P1(%3.2f, %3.2f), P2(%3.2f,%3.2f), P3(%3.2f,%3.2f)"
				+", P4(%3.2f,%3.2f), P5(%3.2f, %3.2f)", x1,y1,x2,y2,x3,y3,x4,y4, x5,y5);
		
	}

}
