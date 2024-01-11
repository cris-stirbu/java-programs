package programmingExercises;

//rezolvarea foloseste charAt, daca se vrea ordoanarea a trei stringuri, 
//problema este mult mai complicata 

import java.util.Scanner;
public class Problem4_24Order3Strings {
   public static void main(String[] args) {
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter three countries:");
	System.out.print("country1=");
	String s1 = input.nextLine();
	System.out.print("\ncountry2=");
	String s2 = input.nextLine();
	System.out.print("\ncountry3=");
	String s3 = input.nextLine();
	
	
	
	char k = s1.charAt(0);
	char l = s2.charAt(0);
	char m = s3.charAt(0);

	if(k>l)
		if(k>m)
			if(l>m)
				System.out.println(s1+", "+s2+", "+s3);
			else
				System.out.println(s1+", "+s3+", "+s2);
		else 
			System.out.println(s3+", "+s1+", "+s2);
	else if(l>m)
		if(k>m)
		    System.out.println(s2+", "+s1+", "+s3);
		else 
			System.out.println(s2+", "+s3+", "+s1);
	else
		System.out.println(s3+", "+s2+", "+s1);
		
			
	
	

	}

}
