package forLoops;
import java.util.Scanner;
public class InterestingLoop {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the maximum number(n>5):");
		int n=input.nextInt();
		
		int count = 5;
		int i=0;
		while(count<n) {
			i++;
			count = count + 3;
		}
		System.out.println("\n number of iterations="+i);
	}

}
