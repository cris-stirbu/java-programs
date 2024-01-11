package programmingExercises;

public class Problem6_10PrimeNumber {

	public static void main(String[] args) {
		
displayPrimes(100);
	}

	
	
	public static void displayPrimes(int number) {
		int count=0;
		for(int n=1;n<=number;n++) {
			if (isPrime(n)) {
				System.out.print(n+" ");
				count++;
				if(count%10==0) System.out.println();
		}
	}
	}
	
	public static boolean isPrime(int number) {
		int k=2;
	
		for(k=2;k<=number/2;k++)
			if(number%k==0) return false;
	return true;
		
	}
}
