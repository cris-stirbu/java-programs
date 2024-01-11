package programmingExercises;
import java.util.Scanner;
public class Problem4_22Substring {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	boolean flag=true; 
	
	System.out.println("Enter the two strings:");
	
	System.out.print("s1=");
	String s1 = input.nextLine();
	System.out.print("\ns2=");
	String s2 = input.nextLine();
	
	int n1 = s1.length();
	int n2 = s2.length();
	
	char c = s2.charAt(0);
	
	int k = s1.indexOf(c);
	if(k==-1) flag=false;
	if(k+n2>n1) flag=false;
	
	String s = s1.substring(k, k+n2);
	System.out.println(s);
	
	if (flag) {
	 if(s2.equals(s)) System.out.println("s2 is substring of s1");
	 else System.out.println("s2 is not substring of s1");
	}
	else System.out.println("s2 is not substring of s1");
   }

}
