package programmingExercises;
import java.util.Scanner;
public class Problem4_9 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String answer="yes";
		
		do {
			System.out.print("Enter a character:");
			char c = input.nextLine().charAt(0);
			System.out.println("\n the unicode for charcater "+c+" is "+((int)c));
			System.out.print("would you like to continue?(yes\\no):");
			answer = input.nextLine();
			
		}while(answer.equals("yes"));
	}

}
