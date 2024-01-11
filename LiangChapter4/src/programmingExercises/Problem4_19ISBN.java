package programmingExercises;
import java.util.Scanner;
public class Problem4_19ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the first 9 digits of the ISBN number: ");
		String number=input.nextLine();
		String isbn=number;
		
		if(number.length() !=9) {
			System.out.println("Icorrect number");
			System.exit(1);
		}
		
		int tenthDigit=0;
		
		for(int i=0;i<number.length();i++) {
			char ch = number.charAt(i);
			String c = ""+ch;
			int cipher = Integer.parseInt(c);
			tenthDigit = tenthDigit+cipher*(i+1);
		}
		System.out.println(tenthDigit);
		tenthDigit %=11;
		System.out.print("ISBN is ");
		if(tenthDigit<10) System.out.println(""+isbn+tenthDigit);
		else System.out.println(""+isbn+"X");
		
	}

}
