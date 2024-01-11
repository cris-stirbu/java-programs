package programmingExercises;
import java.util.Scanner;
public class Problem3_9ISBN {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the first 9 digits of ISBN:");
		
		int number = input.nextInt();
	    int isbn=number;
		int numberOfDigits=1;
	    int tenthDigit=0;
	    int counter=9;
	    
	    while(number>0) {
	    	int cipher=number%10;
	    	numberOfDigits++;
	    	tenthDigit=tenthDigit+cipher*counter;
	    	counter--;
	    	number=number/10;
	    }
	if(numberOfDigits !=9) {
		System.out.println("Wrong number");
		System.exit(1);
	}
	
	tenthDigit %=11;
	if (tenthDigit<10) System.out.printf("%09d%1d", isbn, tenthDigit);
	else System.out.printf("%09d%1s", isbn, "X");
	}

}
