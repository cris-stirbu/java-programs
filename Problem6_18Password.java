package programmingExercises;
import java.util.Scanner;
public class Problem6_18Password {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Choose a password:");
		String password=input.nextLine();

		isValid(password);
		
		if(isLetterOrDigit(password)) System.out.println("is letter or digit");
		else System.out.println("somthong wrong");
		
		input.close();
	}
	
	public static boolean isTenCharacters(String password) {
		if(password.length()<10) return false;
		return true;
	}
	public static boolean isLetterOrDigit(String password) {
		for(int i=0;i<=password.length()-1;i++) 
			if(!Character.isLetter(password.charAt(i)) && 
					!Character.isDigit(password.charAt(i)))
				return false;
		return true;
	}
	public static boolean isThreeDigits(String password) {
		int count =0;
		for(int i=0;i<password.length();i++) 
			if(Character.isDigit(password.charAt(i)))
				count++;
		if(count<3) return false;
		return true;		
	}
	
	public static void isValid(String password) {
		if(isTenCharacters(password)&& isLetterOrDigit(password)&&
				isThreeDigits(password))
			System.out.println("The password is valid");
		else
			System.out.println("The password is not valid");
	}

}
