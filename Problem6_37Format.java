package programmingExercises;
import java.util.Scanner;
public class Problem6_37Format {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the integer:");
		int number=input.nextInt();
		System.out.print("Enter the width:");
		int width=input.nextInt();
		System.out.println(format(number, width));
	}

	public static String format(int number, int width) {
		String s=""+number;
		if(s.length()>width) return s;
		else {
			String zeros="";
			for(int i=0;i<width-s.length();i++)
				zeros=zeros+'0';
			System.out.println(zeros);
			return (zeros+s);
		}
	}
}
