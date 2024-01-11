package programmingExercises;
import java.util.Scanner;
public class Problem4_11 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the binary number as a short:");
		int binary=input.nextInt();
		
		long decimal=0;
		
		while (binary>0) {
			int digit = binary % 10;
			decimal = decimal*2+digit;
			binary = binary/10;
		}

		System.out.println("\n the decimal value is "+ decimal);
		
	}

}
