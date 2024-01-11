package programmingExercises;
import java.util.Scanner;
public class Problem6_6DisplayPattern {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer:");
		int number=input.nextInt();
		
		displayPattern(number);
		input.close();
	}

	public static void displayPattern(int number) {
		for(int i=1; i<=number;i++) { 
			for(int j=i;j>=1;j--)
				System.out.print(j+" ");
			System.out.println();
		}
	}
}
