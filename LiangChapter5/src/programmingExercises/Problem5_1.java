package programmingExercises;
import java.util.Scanner;
public class Problem5_1 {

	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		int score;
		do {
			System.out.print("Enter your score");
			score = input.nextInt();
			if(score>=60) System.out.println("You passed the exam");
			else if(score >=0) System.out.println("You didn\'t pass the exam");
		}while(score !=-1);
		System.out.println("Nothing entered, just 0");
	}

}
