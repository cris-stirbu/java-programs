package programmingExercises;
import java.util.Scanner;
public class Problem6_3Palindrome {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the integer:");
		int number=input.nextInt();
		
		if(isPalindrome(number)) System.out.println(number+" is palindrome");
		else System.out.println(number+" is not a palindrome");
	}

	public static int reverse(int n) {
		int m=0;
		while(n>0) {
			m=m*10+n%10;
			n/=10;
		}
		return m;
	}
	
	public static boolean isPalindrome(int n) {
		if(n==reverse(n)) return true;
		else return false;
	}
}
