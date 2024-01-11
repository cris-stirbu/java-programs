package programmingExercises;
import java.util.Scanner;
public class Problem4_21 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter SSN as ddd-dd-dddd where d is a digit:");
		String ssn = input.nextLine();
		
		int k1 = ssn.indexOf('-');
		int k2 = ssn.lastIndexOf('-');
		System.out.println(k2);
		String s1 = ssn.substring(0,k1);
		String s2 = ssn.substring(k1+1,k2);
		String s3 = ssn.substring(k2+1);
		
		System.out.println(s1.length()+","+s2.length()+","+s3.length());
		
		boolean flag=true;
		
		System.out.println(s1.length()!=3?"true":"false");
		
		if(s1.length()!=3) {
			flag=false;
		       System.out.println("invalid ssn");
		       System.exit(1);
 	
		}
			if(s2.length()!=2) {
				flag=false;
		       System.out.println("invalid ssn");
		       System.exit(1);
 	
			}
				if(s3.length()!=4)
			{
			       flag=false;
			       System.out.println("invalid ssn");
			       System.exit(1);
	    	}
		
		for (int i=0; i<s1.length(); i++) 	
		if(!(Character.isDigit(s1.charAt(i)))) {
			System.out.println("Invalid SSN");
			flag=false;
			System.exit(1);
		}
		for (int i=0; i<s2.length(); i++) 
			if(!(Character.isDigit(s2.charAt(i)))) {
				System.out.println("Invalid SSN");
				flag=false;
		System.exit(1);
		}
		
		for (int i=0; i<s3.length(); i++) 
			if(!(Character.isDigit(s3.charAt(i)))) {
				System.out.println("Invalid SSN");
				flag=false;
		System.exit(1);
		}
	
	
		if(flag)
			System.out.println(ssn+" is valid");
	
	
	
	}

}
