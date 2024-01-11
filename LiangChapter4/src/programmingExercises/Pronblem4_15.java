package programmingExercises;
import java.util.Scanner;
public class Pronblem4_15 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a letter");
		String letter = input.nextLine();
		
		if(letter.length() != 1) {
			System.out.println("The input must have a sigle char");
			System.exit(1);
		}
		char c = letter.charAt(0);
		if(Character.isLetter(c)) {
			
			c=Character.toLowerCase(c);
			
			switch(c) {
			case 'a':
			case 'b':
			case 'c':System.out.println("2");break;
			case 'd':
			case 'e':
			case 'f':System.out.println("3");break;
			case 'g':
			case 'h':
			case 'i':System.out.println("4");break;
			case 'j':
			case 'k':
			case 'l':System.out.println("5");break;
			case 'm':
			case 'n':
			case 'o':System.out.println("6");break;
			case 'p':
			case 'q':
			case 'r':
			case 's':System.out.println("7"); break;
			case 't':
			case 'u':
			case 'v':System.out.println("8");break;
			case 'w':
			case 'x':
			case 'y': 
			case 'z':System.out.println("9");break;
			default:System.out.println("No number for this char");
			}
		}
		else System.out.println("No accepted argument");
	}

}
